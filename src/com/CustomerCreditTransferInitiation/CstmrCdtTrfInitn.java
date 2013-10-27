package com.CustomerCreditTransferInitiation;

import org.jdom.Element;

import com.CSB3411.fichero.EstructuraCSB3411;
import com.CSB3411.fichero.Fichero;

public class CstmrCdtTrfInitn {
	private Element _CstmrCdtTrfInitn;

	public Element get_CstmrCdtTrfInitn() {
		return _CstmrCdtTrfInitn;
	}

	public void set_CstmrCdtTrfInitn(Element _CstmrCdtTrfInitn) {
		this._CstmrCdtTrfInitn = _CstmrCdtTrfInitn;
	}
	
	public void montar (Element e) {
		EstructuraCSB3411 estructura = new EstructuraCSB3411();
		//TODO: dfe se debería pasar como argumento a montar 
		//ya que estos datos deben venir desde el interface con el usuario
		DatosFrontEnd dfe = new DatosFrontEnd();
		Fichero f = new Fichero(estructura);
		
		Grphdr grphdr = new Grphdr();
		e.addContent(grphdr.parse(estructura));
		//TODO: Asignarlo a un root
		
		PmtInf pmtInf = new PmtInf();
		e.addContent(pmtInf.parse(estructura, dfe));
		//TODO: Asignarlo a un root		
		
		
		
		
	}
	

}
