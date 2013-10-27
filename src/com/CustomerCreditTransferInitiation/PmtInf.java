package com.CustomerCreditTransferInitiation;

import java.util.Iterator;

import org.jdom.Element;

import com.CSB3411.fichero.EstructuraCSB3411;
import com.CSB3411.fichero.Pago;
import com.comun.Dbtr;
import com.comun.DbtrAcct;
import com.comun.DbtrAgt;
import com.comun.PmtInfId;
import com.comun.PmtMtd;
import com.comun.ReqdExctnDt;

public class PmtInf {
	
	public Element parse(EstructuraCSB3411 estructura, 
						DatosFrontEnd dfe) {
		Element element = new Element("PmtInf");
		
		PmtInfId pmtInfId = new PmtInfId();
		PmtMtd pmtMtd = new PmtMtd();
		ReqdExctnDt reqdExctnDt = new ReqdExctnDt ();
		Dbtr dbtr = new Dbtr();
		DbtrAcct  dbtrAcct  = new DbtrAcct();
		DbtrAgt dbtrAgt = new DbtrAgt();
		CdtTrfTxInf cdtTrfTxInf = new CdtTrfTxInf();
		
		

		element.addContent(pmtInfId.parse(dfe));
		element.addContent(pmtMtd.parse());
		element.addContent(reqdExctnDt.parse(estructura.get_RO1()));
		element.addContent(dbtr.parse(estructura.get_RO1(), 
								estructura.get_RO2()));
		element.addContent(dbtrAcct.parse(estructura.get_RO1()));
		element.addContent(dbtrAgt.parse(estructura.get_RO1()));
		
		// añade cada uno de los pagos obtenidos del fichero 34.11
		Iterator<Pago> it = estructura.get_pagos().iterator();
		while (it.hasNext()) { //para cada pago
			element.addContent(cdtTrfTxInf.parse(it.next()));
		}
		
		return element;
	
	}
}
