package com.CSB3411.fichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Fichero {
	private EstructuraCSB3411 _estructura;

	public EstructuraCSB3411 get_estructura() {
		return _estructura;
	}

	public Fichero(EstructuraCSB3411 estructura) {
		super();
		
		_estructura = estructura;
		
		NombreFichero nf = new NombreFichero();
		File f = new File(nf.get_nombre());
		FileReader fr;
		try {
			fr = new FileReader (f);
			BufferedReader br = new BufferedReader (fr);
			String r;
			
			while ((r = br.readLine())!= null) {
				determinarTipoRegistro(r, br); 
				
			}
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	/**
	 * Determina el tipo de registro de que se trata según
	 * el modelo del cuadernillo CSB 34.11
	 * 
	 * Los cuatro primeros carácteres definen el tipo de registro
	 * 
	 * @param s linea leida del fichero
	 */
	private void determinarTipoRegistro(String s, 
										BufferedReader br) {
		
		String codigo = s.substring(0, 4);
		String numeroDato = s.substring(28, 31);
		
		if (codigo.equals("0362") && numeroDato.equals("001"))  {
			RO1parser rO1p = new RO1parser();
			rO1p.parse (_estructura, s);
			
		} else if (codigo.equals("0362") && numeroDato.equals("002")) {
			RO2parser rO2p = new RO2parser();
			rO2p.parse(_estructura, s);
			
		} else if (codigo.equals("0962"))  {
			RTparser rtp = new RTparser();
			rtp.parse(_estructura, s);
			
		} else if (codigo.equals ("0656")) {
			leerBloqueTxNacionales(s, br, _estructura.get_pagos());
		}
		else {
			//nothing to do
		}
		
		
	}

	/**
	 * Se llama a este método cuando se encuentra un registro de
	 * cabecera de Transferencias nacionales.
	 * 
	 * Va leyendo registros del BufferedReader dado hasta encontrar 
	 * el fin del bloque.
	 * 
	 * A medida que va leyendo registros, agrega elementos al 
	 * ArrayList<Pago> dado. 
	 * 
	 * El bloque de Transferencias Nacionales está compuesto por n 
	 * bloques de transferencias. Cada uno de estos bloques es un pago.
	 * 
	 * El bloque se delimita por la identificación de los registros en 
	 * el csb34.11: 
	 * 	
	 * 		0656010
	 * 		0656011
	 * 		...
	 * 		0656022
	 * 
	 * @param s
	 * @param br
	 */
	private void leerBloqueTxNacionales(String s, BufferedReader br, 
					ArrayList<Pago> pagos) {
		
		Pago pago = new Pago();
		String r;
		
		/*
		 * Tomar datos del registro de cabecera de tx nacionales 
		 * (si procede)
		 */
		
		/*
		 * Leer el primer registro del bloque, que debe ser el primero
		 * de un bloque de una transferencia individual (0656010)
		 * 
		 * Iniciar un bucle hasta encontrar otro (0656010), que supone
		 * un nuevo pago, o un (0856) que supone el fin del bloque de 
		 * TX nacionales
		 */
		try {
			r = s;
			while (r !=null ) {
				// si es fin del bloque termina el bucle
				String cRegistro_cOperacion = r.substring(0, 4);
				if (cRegistro_cOperacion.equals("0856")) {
					break;
				}
				// analiza el numero de dato
				String numeroDato = r.substring(28, 31);
				if (numeroDato.equals("010")) { 		// NUEVO PAGO. REGISTRO DETALLE PRIMERO

					pagos.add(pago);
					
					//inicializar el pago
					pago.inicializar();
					
					//toma los datos del REGISTRO DE DETALLE Registro Primero
					pago.set_referenciaBeneficiario(r.substring(16,28));	
					pago.set_importe(Double.parseDouble(r.substring(31, 43)));
					pago.set_CCCBeneficiario(r.substring(43, 63));
					
				} else if (numeroDato.equals("018")) {	// REGISTRO DETALLE NOVENO
					pago.set_referenciaParaElBeneficiario(r.substring(40, 53));
					
				}
				else  {
					// nothing to do
				}
				r = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * Tomar datos del bloque de totales de tx nacionales 
		 * (si procede)
		 */
		
	}
	
	
}
