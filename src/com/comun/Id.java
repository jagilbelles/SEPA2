package com.comun;

import org.jdom.Element;

import com.CSB3411.fichero.RO1;

public class Id {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <Id> 
	 * 
	 */
	public Element parse(RO1 ro1) {
		Element id = new Element ("Id");

		id.setText(ro1.get_NIF() + ro1.get_sufijo());
		return  id;
		
	}
	

}
