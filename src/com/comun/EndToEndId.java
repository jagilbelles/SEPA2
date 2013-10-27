package com.comun;

import org.jdom.Element;

import com.CSB3411.fichero.Pago;

public class EndToEndId {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <EndToEndId>
	 * 
	 *  Este elemento forma parte de la Identificación del pago
	 *  
	 *  Referencia única que asigna la parte iniciadora para identificar 
	 *  la operación y que se transmite sin cambios a lo largo 
	 *  de la cadena del pago hasta el beneficiario
	 *  
	 *  En el CSB34.11, en el bloque de transferencias nacionales
	 *  se corresponde con el registro de detalle noveno
	 *  posiciones (40,53) 
	 * 
	 * 
	 */

	public Element parse(Pago pago) {
		Element e = new Element ("EndToEndId");
		
		//hay que
		e.setText(pago.get_referenciaParaElBeneficiario());
		
		return  e;
	}

}
