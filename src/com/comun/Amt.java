package com.comun;

import org.jdom.Element;

import com.CSB3411.fichero.Pago;

public class Amt {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <Amt> 
	 * 
	 */
	public Element parse(Pago pago) {
		Element e = new Element ("Amt");
		
		InstdAmt instdAmt= new InstdAmt();
		
		e.addContent(instdAmt.parse(pago));
		
		return  e;
	}
	

}
