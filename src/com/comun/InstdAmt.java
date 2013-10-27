package com.comun;

import org.jdom.Element;

import com.CSB3411.fichero.Pago;

public class InstdAmt {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <InstdAmt> 
	 * 
	 */
	public Element parse(Pago pago) {
		Element e = new Element ("InstdAmt");
		
		e.addContent("" + pago.get_importe());
		
		return  e;
	}

}
