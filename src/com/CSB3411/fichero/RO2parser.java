package com.CSB3411.fichero;

public class RO2parser {
	
	public void parse(EstructuraCSB3411 _estructura, String s) {
		RO2 ro2 = new RO2();
		
		String _nombre = "";

		_nombre = s.substring(31, 67);
		
		ro2.set_nombreOrdenante(_nombre);

		_estructura.set_RO2(ro2);
		
	}

}
