package com.comun;

import org.jdom.Element;

public class PstlAdr {
	private String _ctry;
	private String _adrLine;
	private String _adrLine2;

	
	
	public String get_ctry() {
		return _ctry;
	}



	public void set_ctry(String _ctry) {
		this._ctry = _ctry;
	}



	public String get_adrLine() {
		return _adrLine;
	}



	public void set_adrLine(String _adrLine) {
		this._adrLine = _adrLine;
	}



	public String get_adrLine2() {
		return _adrLine2;
	}



	public void set_adrLine2(String _adrLine2) {
		this._adrLine2 = _adrLine2;
	}



	/**
	 * 
	 * @return estructura XML:
	 * 	<PstlAdr>
	 * 		<Ctry>xxxxxxxxxxx<\Ctry>   
	 * 		<AdrLine>xxxxxxxxxxx<\AdrLine>
	 * 		<AdrLine2>xxxxxxxxxxx<\AdrLine2>
	 * 	<\PstlAdr>
	 */	
	public Element parse() {
		Element PstlAdr = new Element ("PstlAdr");
		
		Element Ctry = new Element("Ctry");
		PstlAdr.addContent(Ctry);
		Ctry.setText(_ctry);
		
		Element AdrLine = new Element("AdrLine");
		PstlAdr.addContent(AdrLine);
		AdrLine.setText(_adrLine);
		
		Element AdrLine2 = new Element("AdrLine2");
		PstlAdr.addContent(AdrLine2);
		AdrLine2.setText(_adrLine2);

		return PstlAdr;
	}
	

}
