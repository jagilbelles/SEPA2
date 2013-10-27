package com.comun;

import org.jdom.Element;

public class MsgId {

	/**
	 * Este m�todo deber� devolver una String correspondiente al 
	 * identificador del mensaje correspondiente con la etiqueta <MsgId>
	 * 
	 * El <MsgId> consistir� en una identificaci�n interna que se 
	 * corresponde con el n�mero de la empresa, m�s el numero del banco, 
	 * m�s un contador
	 * 
	 * La longitud m�xima es de 35 car�cteres
	 * 
	 */
	public Element parse() {
		Element msgId = new Element ("MsgId");
		//TODO: m�todo de concatenacion del <MsgId>
		msgId.setText("001 / 0001 / 0000001");
		return  msgId;
		
	}

}
