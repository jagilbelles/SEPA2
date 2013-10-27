package com.comun;

import org.jdom.Element;

public class RmtInf {
	private String _ustrd;

	public String get_ustrd() {
		return _ustrd;
	}

	public void set_ustrd(String _ustrd) {
		this._ustrd = _ustrd;
	}
	
	/**
	 * 
	 * @return estructura XML:
	 * 	<RmtInf>
	 * 		<Ustrd>xxxxxxxxxxx<\Ustrd>   
	 * 	<\RmtInf>
	 */	
	public Element parse() {
		Element rmtInf = new Element ("RmtInf");
		
		Element ustrd = new Element("Ustrd");
		rmtInf.addContent(ustrd);
		ustrd.setText(_ustrd);
		
		return rmtInf;
	}
	

	


}
