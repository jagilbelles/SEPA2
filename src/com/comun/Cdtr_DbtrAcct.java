package com.comun;

import org.jdom.Element;

public class Cdtr_DbtrAcct {
	private String _codigoIBAN;


	public String get_codigoIBAN() {
		return _codigoIBAN;
	}


	public void set_codigoIBAN(String _codigoIBAN) {
		this._codigoIBAN = _codigoIBAN;
	}


	/**
	 * 
	 * @param tipo: 0 --> CdtrAcct
	 * 				1 --> DbtrAcct
	 * @return estructura XML:
	 * 	<DbtrAcct> o <CdtrAcct>
	 * 		<Id>   
	 * 			<IBAN>xxxxxxxxxxx<\IBAN>
	 * 		<\Id>
	 * 	<\DbtrAcct> o <\CdtrAcct>
	 */	
	public Element parse(int tipo) {
		Element cdtr_DbtrAcct;
		if (tipo == 0) {
			cdtr_DbtrAcct = new Element ("CdtrAcct");
		} else {
			cdtr_DbtrAcct = new Element ("DbtrAcct");
		}

		Element id = new Element ("Id");
		cdtr_DbtrAcct.addContent(id);
		
		Element iBAN = new Element ("IBAN");
		cdtr_DbtrAcct.addContent(iBAN);
		iBAN.setText(_codigoIBAN);
		
		return cdtr_DbtrAcct;
	}
	

}
