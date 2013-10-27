package com.comun;

import org.jdom.Element;

import com.CSB3411.fichero.RO1;

public class DbtrAgt {
	
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <DbtrAgt> 
	 * 
	 */
	public Element parse(RO1 ro1) {
		Element e = new Element ("DbtrAgt");
		FinInstnId finInstnId= new FinInstnId();

		e.addContent(finInstnId.parse(ro1));
		
		return  e;
		
	}
	

}
