package com.CustomerCreditTransferInitiation;

import org.jdom.Element;

import com.CSB3411.fichero.Pago;
import com.comun.Amt;
import com.comun.PmtId;

public class CdtTrfTxInf {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <CdtTrfTxInf> 
	 * 
	 */
	public Element parse(Pago pago) {
		
		Element e = new Element ("CdtTrfTxInf");
		
		PmtId pmtId = new PmtId();
		Amt amt = new Amt();
		
		e.addContent(pmtId.parse(pago));
		e.addContent(amt.parse(pago));
		
		return  e;
		
	}
	
	

}
