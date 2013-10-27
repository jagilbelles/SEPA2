package com.CustomerCreditTransferInitiation;

import org.jdom.Element;

import com.CSB3411.fichero.EstructuraCSB3411;
import com.GrpHdr.InitgPty;
import com.comun.CreDtTm;
import com.comun.CtrlSum;
import com.comun.MsgId;
import com.comun.NbOfTxs;

public class Grphdr {
	final String MSGID = "";
	
	public Element parse(EstructuraCSB3411 estructura) {
		Element element = new Element("GrpHdrdr");
		
		MsgId msgId = new MsgId();
		CreDtTm creDtTm = new CreDtTm();
		NbOfTxs nbOfTxs = new NbOfTxs ();
		CtrlSum ctrlSum = new CtrlSum();
		InitgPty initgPty = new InitgPty();
		
		element.addContent(msgId.parse());
		element.addContent(creDtTm.parse());
		element.addContent(nbOfTxs.parse(estructura.get_RT()));
		element.addContent(ctrlSum.parse(estructura.get_RT()));
		element.addContent(initgPty.parse(estructura.get_RO1()));
		
		
		return element;
		
	}
	
}
