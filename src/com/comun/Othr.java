package com.comun;

import org.jdom.Element;

import com.CSB3411.fichero.RO1;

public class Othr {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <Othr> 
	 * 
	 */
	public Element parse(RO1 ro1) {
		Element othr = new Element ("Othr");
		Id id = new Id();
		
		othr.addContent(id.parse(ro1));
		return  othr;
		
	}
	

}
