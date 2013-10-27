package com.comun;

import org.jdom.Element;

import com.CSB3411.fichero.RO1;

public class OrgId {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <OrgId>
	 *  
	 * 
	 */
	public Element parse(RO1 ro1) {
		Element e = new Element ("OrgId");
		
		BICOrBEI bICOrBEI = new BICOrBEI();
		
		e.addContent(bICOrBEI.parse(ro1));
		
		return  e;
		
	}	

}
