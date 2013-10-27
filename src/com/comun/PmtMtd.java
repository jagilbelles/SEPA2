package com.comun;

import org.jdom.Element;

import com.CustomerCreditTransferInitiation.DatosFrontEnd;

public class PmtMtd {
	/**
	 * Este m�todo deber� devolver el elemento correspondiente con 
	 * la etiqueta <PmtMtd>
	 * 
	 * Detalla el medio de pago utilizado para mover los fondos
	 * 
	 * Ser� un valor fijo "TRF"
	 */
	public Element parse() {
		Element e = new Element ("PmtMtd");
		
		e.addContent("TRF");
		return  e;
		
	}
	

}
