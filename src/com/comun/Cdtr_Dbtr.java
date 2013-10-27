package com.comun;

import org.jdom.Element;

public class Cdtr_Dbtr {
	private String _nm;
	private String _ctry;
	private String _adrLine;
	private String _adrLine2;
	

	public String get_nm() {
		return _nm;
	}



	public void set_nm(String _nm) {
		this._nm = _nm;
	}

	
	
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
	 * @param tipo = 0 --> Dbtr
	 * 				1 --> Cdtr
	 * 
	 * @return estructura XML:
	 * 	<Ctr> o <Dbtr>
	 * 		<Nm>xxxxxxxxxx<\Nm>
	 * 		<PstlAdr>
	 * 			<Ctry>xxxxxxxxxxx<\Ctry>   
	 * 			<AdrLine>xxxxxxxxxxx<\AdrLine>
	 * 			<AdrLine2>xxxxxxxxxxx<\AdrLine2>
	 * 		<\PstlAdr>
	 * 	<\Cdtr> o <\Dbtr>
	 */	
	public Element parse(int tipo) {
		Element cdtr_Dbtr;
		
		//Determina si es Dbtr o Cdtr
		if (tipo == 0) {	// Dbtr
			cdtr_Dbtr = new Element ("Dbtr");
			
		} else {			// Cdtr
			cdtr_Dbtr = new Element ("Cdtr");
			
		}
		
		
		Element Nm = new Element("Nm");
		cdtr_Dbtr.addContent(Nm);
		Nm.setText(_nm);
		
		PstlAdr pa = new PstlAdr();
		pa.set_ctry(_ctry);
		pa.set_adrLine(_adrLine);
		pa.set_adrLine2(_adrLine2);
		Element pstlAdr = pa.parse();
		cdtr_Dbtr.addContent(pstlAdr);

		return cdtr_Dbtr;
	}
	

	

}
