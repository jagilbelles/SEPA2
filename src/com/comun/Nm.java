package com.comun;

import org.jdom.Element;

import com.CSB3411.fichero.RO2;

public class Nm {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <Nm>
	 * 
	 * Nombre del Ordenante
	 * 
	 * Se toma este dato del CSB3411, RO2, posiciones 31 a 67
	 * 
	 * Max70Text
	 * 
	 */
	public Element parse(RO2 ro2) {
		Element e = new Element ("Nm");
		
		e.setText(ro2.get_nombreOrdenante());
		return  e;
		
	}
	

}
