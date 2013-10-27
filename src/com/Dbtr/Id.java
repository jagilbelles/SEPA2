package com.Dbtr;

import org.jdom.Element;

import com.CSB3411.fichero.RO1;
import com.comun.OrgId;

public class Id {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <Id> 
	 * 
	 */
	public Element parse(RO1 ro1) {
		Element e = new Element ("Id");
		
		OrgId orgId = new OrgId();
		
		e.addContent(orgId.parse(ro1));
		
		return  e;
		
	}	
	

}
