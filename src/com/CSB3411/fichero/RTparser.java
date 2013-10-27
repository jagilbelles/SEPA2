package com.CSB3411.fichero;

public class RTparser {

	public void parse(EstructuraCSB3411 _estructura, String s) {
		RT rt = new RT();
		
		long _NumOperaciones =0;
		long _NumRegistros =0;
		Double _SumaImportes =(double) 0;
		
		_SumaImportes = (Double.parseDouble(s.substring(31, 43)))/100;
		_NumRegistros =  Long.parseLong(s.substring(51, 61));
		_NumOperaciones = Long.parseLong(s.substring(43, 51));
		
		rt.set_NumOperaciones(_NumOperaciones);
		rt.set_NumRegistros(_NumRegistros);
		rt.set_SumaImportes(_SumaImportes);
		
		_estructura.set_RT(rt);
		
	}
	
	

}
