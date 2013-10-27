package com.comun;

import org.jdom.Element;

import com.CSB3411.fichero.RT;

public class NbOfTxs {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <NbOfTxs> 
	 * 
	 * El <NbOfTxs> es el número de operaciones individuales que contiene
	 * el mensaje
	 * 
	 * Max5NumericText
	 * 
	 */
	public Element parse(RT rt) {
		Element nbOfTxs = new Element ("NbOfTxs");
		nbOfTxs.setText(String.valueOf(rt.get_NumOperaciones()));
		return  nbOfTxs;
		
	}

}
