package com.comun;

import org.jdom.Element;

import com.CSB3411.fichero.RO1;
import com.DbtrAgt.BIC;

public class FinInstnId {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <FinInstnId> 
	 * 
	 */
	public Element parse(RO1 ro1) {
		Element e = new Element ("FinInstnId");
		BIC bic = new BIC();

		e.addContent(bic.parse(ro1));
		
		return  e;
		
	}

}
