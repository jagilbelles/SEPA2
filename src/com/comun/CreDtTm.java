package com.comun;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.jdom.Element;

public class CreDtTm {

	/**
	 * Devuelve la etiqueta <CreDtTm>
	 * 
	 * Fecha y hora cuando la parte iniciadora ha creado un 
	 * (grupo de ) instrucciones de pago
	 * 
	 * La fecha la obtiene del sistema
	 * 
	 * Formato: YYYY-MM-DDThh:mm:ss
	 * 
	 */
	public Element parse() {
		Calendar calendario = GregorianCalendar.getInstance();
		Date fecha = calendario.getTime();
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		
		Element e = new Element ("CreDtTm");
		String s = formatoDeFecha.format(fecha);
		e.setText(s);
		return  e;
		
	}
}
