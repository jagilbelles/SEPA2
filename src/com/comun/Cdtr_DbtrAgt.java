package com.comun;

import org.jdom.Element;

public class Cdtr_DbtrAgt {
	private String _BIC;
	


	public String get_BIC() {
		return _BIC;
	}



	public void set_BIC(String _BIC) {
		this._BIC = _BIC;
	}



	/**
	 * @param tipo = 0 --> CdtrAgt
	 * 				1 --> DbtrAgt
	 * 
	 * @return estructura XML:
	 * 	<CdtrAgt> o <DbtrAgt>
	 * 		<FinInstnId>
	 * 			<BIC>xxxxxxxxxxx<\BIC>   
	 * 		<\FinInstnId>
	 * 	<\CdtrAgt> o <\DbtrAgt>
	 */	
	public Element parse(int tipo) {
		Element cdtr_DbtrAgt;
		
		//Determina si es Dbtr o Cdtr
		if (tipo == 0) {	// Dbtr
			cdtr_DbtrAgt = new Element ("CdtrAgt");
			
		} else {			// Cdtr
			cdtr_DbtrAgt = new Element ("DbtrAgt");
			
		}
		
		Element finInstnId = new Element("FinInstnId");
		cdtr_DbtrAgt.addContent(finInstnId);

		Element bIC = new Element ("BIC");
		finInstnId.addContent(bIC);
		bIC.setText(_BIC);
		
		return cdtr_DbtrAgt;
	}
	

	

}
