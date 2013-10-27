package com.CSB3411.fichero;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RO1parser {
	
	public void parse(EstructuraCSB3411 _estructura, String s) {
		RO1 ro1 = new RO1();
		
		// hay que comprobar numero de dato, sólo trataremos el primero
		if (s.substring(28, 31).equals("001")) {
			String _NIF = "";
			String _sufijo = "";
			Date _fechaEmision = null;
			String _BIC = "";
			String _CCC = "";

			_NIF = s.substring(4, 13);
			_sufijo = s.substring(13, 16);
			_BIC = s.substring(43, 47);
			_CCC = s.substring(43, 63);
			
			SimpleDateFormat formato = new SimpleDateFormat("ddMMyy");
			try {
				_fechaEmision = formato.parse(s.substring(38, 43));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ro1.set_NIF(_NIF);
			ro1.set_sufijo(_sufijo);
			ro1.set_FechaEmision(_fechaEmision);
			ro1.set_BIC(_BIC);
			ro1.set_CCC(_CCC);

			_estructura.set_RO1(ro1);
		} 
		
		
	}

}
