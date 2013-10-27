package com.comun;

import java.text.SimpleDateFormat;

import org.jdom.Element;

import com.CSB3411.fichero.RO1;

public class ReqdExctnDt {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <ReqdExctnDt> 
	 * 
	 * Fecha en la que la parte iniciadora solicita a la 
	 * entidad del ordenante que procese el pago. Es la fecha en la que se 
	 * adeudarán las transferencias en la cuenta del ordenante.
	 * 
	 * Toma el dato de CSB34.11 RO1 (38...43)
	 * 
	 * Formato: YYY-MM-DD
	 *
	 *  
	 */
	public Element parse(RO1 ro1) {
		Element e = new Element ("ReqdExctnDt");
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
		
		e.setText(sdf.format(ro1.get_FechaEmision()));
		
		return  e;
		
	}	

}
