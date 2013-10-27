package com.comun;

import org.jdom.Element;

import com.CustomerCreditTransferInitiation.DatosFrontEnd;

public class PmtInfId {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <PmtInfId>
	 * 
	 * Referencia asignada por el ordenante para identificar claramente 
	 * el bloque de información de pago dentro del mensaje
	 * 
	 * Este dato no exist en CSB 3411. Se pedirá al usuario en el 
	 * Front-end
	 * 
	 * Max35Text
	 * 
	 */
	public Element parse(DatosFrontEnd dfe) {
		Element pmtInfId = new Element ("PmtInfId");
		
		pmtInfId.addContent(dfe.get_pmtInfId());
		return  pmtInfId;
		
	}
	

}
