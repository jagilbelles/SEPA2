package com.comun;

import org.jdom.Element;

import com.CSB3411.fichero.Pago;

public class PmtId {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <PmtId> 
	 * 
	 */
	public Element parse(Pago pago) {
		Element e = new Element ("PmtId");
		
		EndToEndId endToEndId = new EndToEndId();
		
		e.addContent(endToEndId.parse(pago));
		
		return  e;
	}
}
