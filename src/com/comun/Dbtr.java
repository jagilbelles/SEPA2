package com.comun;


import org.jdom.Element;

import com.CSB3411.fichero.RO1;
import com.CSB3411.fichero.RO2;

public class Dbtr {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <Dbtr> 
	 * 
	 * Parte que debe un importe al beneficiario o al último beneficiario
	 * 
	 */
	public Element parse(RO1 ro1, RO2 ro2) {
		
		Element e = new Element ("Dbtr");
		
		Nm nm = new Nm();
		com.Dbtr.Id id = new com.Dbtr.Id();
		
		e.addContent(nm.parse(ro2));
		e.addContent(id.parse(ro1));
		
		return  e;
		
	}	
}

