package com.DbtrAcct;

import org.jdom.Element;

import com.CSB3411.fichero.RO1;

public class IBAN {
	private static final String ISO_ES = "ES";
	private static final String DIGITOS_CONTROL = "99";

	/**
	 * Este m�todo deber� devolver el elemento correspondiente con 
	 * la etiqueta <IBAN> 
	 * 
	 * El IBAN es el c�digo internacional de la cuenta, (antiguo CCC)
	 * 
	 * Ahora se compone del CCC m�s el c�digo del pa�s.
	 * 
	 * En cuanto al c�digo del pa�s, se asume que es ESPA�A.
	 * 
	 * El CCC en el CSB.34.11 est� en RO1 posiciones 43 a 63
	 * EL c�digo de pa�s 
	 * 
	 */
	public Element parse(RO1 ro1) {
		Element e = new Element("IBAN");
		
		//TODO: calcular el c�digo IBAN a partir del CCC

		e.setText(ISO_ES + DIGITOS_CONTROL +  ro1.get_CCC());
		
		return  e;
		
	}	

}
