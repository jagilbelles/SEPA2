package com.DbtrAcct;

import org.jdom.Element;

import com.CSB3411.fichero.RO1;

public class Id {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <Id> 
	 * 
	 * 
	 */
	public Element parse(RO1 ro1) {
		Element e = new Element ("Id");
		
		IBAN iban = new IBAN();
		
		e.addContent(iban.parse(ro1));
		
		return  e;
		
	}	
	

}
