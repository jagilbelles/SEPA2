package com.comun;

import org.jdom.Element;

import com.CSB3411.fichero.RO1;

public class DbtrAcct {

	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <DbtrAcct> 
	 * 
	 */
	public Element parse(RO1 ro1) {
		Element e = new Element ("DbtrAcct");
		com.DbtrAcct.Id id = new com.DbtrAcct.Id();

		e.addContent(id.parse(ro1));
		
		return  e;
		
	}
	
	}

