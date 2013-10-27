package com.comun;

import org.jdom.Element;

import com.CSB3411.fichero.RO1;

public class BICOrBEI {
	private static final String CAIXALMASSORA = "3130";
	private static final String BIC_CAIXALMASSORA = "BCOEESMM130";
	private static final String BIC_DEFAULT = "FALTABIC";

	/**
	 * Este m�todo deber� devolver el elemento correspondiente con 
	 * la etiqueta <BICOrBEI>
	 * 
	 *  Este m�todo recibe como argumento el c�digo CSB del banco
	 *  y deber� ser capaz de traducirlo a BIC (SWIFT)
	 * 
	 * El c�dig CSB el el n�mero de entidad (cuatro primeros d�gitos)
	 * del CCC.
	 * 
	 * En CSB34.11 se corresponde con RO1 (43...47)
	 */
	public Element parse(RO1 ro1) {
		Element e = new Element ("BICOrBEI");
		
		
		if (ro1.get_BIC().equals(CAIXALMASSORA)) {
			e.setText(BIC_CAIXALMASSORA);
			
		} else  {
			e.setText(BIC_DEFAULT);
		}
		
		return  e;
		
	}	

}
