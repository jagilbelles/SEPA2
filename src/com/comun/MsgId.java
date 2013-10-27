package com.comun;

import org.jdom.Element;

public class MsgId {

	/**
	 * Este método deberá devolver una String correspondiente al 
	 * identificador del mensaje correspondiente con la etiqueta <MsgId>
	 * 
	 * El <MsgId> consistirá en una identificación interna que se 
	 * corresponde con el número de la empresa, más el numero del banco, 
	 * más un contador
	 * 
	 * La longitud máxima es de 35 carácteres
	 * 
	 */
	public Element parse() {
		Element msgId = new Element ("MsgId");
		//TODO: método de concatenacion del <MsgId>
		msgId.setText("001 / 0001 / 0000001");
		return  msgId;
		
	}

}
