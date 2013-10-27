package com.GrpHdr;

import org.jdom.Element;

import com.CSB3411.fichero.RO1;
import com.comun.Othr;

public class InitgPty {
	/**
	 * Este método deberá devolver el elemento correspondiente con 
	 * la etiqueta <InitgPty> 
	 * 
	 * El <InitgPty> En Identificación, salvo acuerdo previo entre el 
	 * ordenante y su entidad financiera, se aplicará la siguiente regla 
	 * de uso en la comunidad española. Es obligatorio que el ordenante
	 * consigne el NIF-Sufijo (12 caracteres) cuyo uso tenga acordado con 
	 * su entidad financiera
	 *  
	 */
	public Element parse(RO1 ro1) {
		Element initgPty = new Element ("InitgPty");
		
		Othr othr = new Othr();
		
		initgPty.addContent(othr.parse(ro1));
		
		
		return  initgPty;
		
	}

}
