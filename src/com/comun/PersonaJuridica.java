package com.comun;

import org.jdom.Element;

public class PersonaJuridica {
	private String _nm;
	private String _bICOrBEI;
	public String get_nm() {
		return _nm;
	}
	public void set_nm(String _nm) {
		this._nm = _nm;
	}
	public String get_bICOrBEI() {
		return _bICOrBEI;
	}
	public void set_bICOrBEI(String _bICOrBEI) {
		this._bICOrBEI = _bICOrBEI;
	}
	/**
	 * 
	 * @return estructura XML:
	 * 	<OrgId>
	 * 		<BICOrBEI>xxxxxxxxxxx<\BICOrBEI>   
	 * 	<\OrgId>
	 */	
	public Element parse() {
		Element OrgId = new Element ("OrgId");
		
		Element bICOrBEI = new Element("BICOrBEI");
		OrgId.addContent(bICOrBEI);
		bICOrBEI.setText(_bICOrBEI);
		
		return OrgId;
	}

}
