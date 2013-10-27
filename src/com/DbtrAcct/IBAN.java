package com.DbtrAcct;

import org.jdom.Element;

import com.CSB3411.fichero.RO1;

public class IBAN {
	private static final String ISO_ES = "ES";
	private static final String DIGITOS_CONTROL = "99";

	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <IBAN> 
	 * 
	 * El IBAN es el código internacional de la cuenta, (antiguo CCC)
	 * 
	 * Ahora se compone del CCC más el código del país.
	 * 
	 * En cuanto al código del país, se asume que es ESPAÑA.
	 * 
	 * El CCC en el CSB.34.11 está en RO1 posiciones 43 a 63
	 * EL código de país 
	 * 
	 */
	public Element parse(RO1 ro1) {
		Element e = new Element("IBAN");
		
		//TODO: calcular el código IBAN a partir del CCC

		e.setText(ISO_ES + DIGITOS_CONTROL +  ro1.get_CCC());
		
		return  e;
		
	}	

}
