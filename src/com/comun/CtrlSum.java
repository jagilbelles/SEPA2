package com.comun;

import org.jdom.Element;

import com.CSB3411.fichero.RT;

public class CtrlSum {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <CtrlSum> 
	 * 
	 * El <CtrlSum> es la suma total de todos los importes individuales 
	 * incluidos en el mensaje, sin tener en cuenta las divisas.
	 * 
	 * DecimalNumber - fractionDigits: 2, totalDigits 18
	 * Separador decimal el punto [.]
	 * 
	 */
	public Element parse(RT rt) {
		Element ctrlSum = new Element ("CtrlSum");
		ctrlSum.setText(String.valueOf(rt.get_SumaImportes()));
		return  ctrlSum;
		
	}


}
