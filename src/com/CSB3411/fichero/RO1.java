package com.CSB3411.fichero;

import java.util.Date;

public class RO1 {
	
	private String _NIF;
	private String _sufijo;
	private Date _FechaEmision;
	private String _BIC;
	private String _CCC;
	
	public Date get_FechaEmision() {
		return _FechaEmision;
	}
	public String get_BIC() {
		return _BIC;
	}
	public void set_BIC(String _BIC) {
		this._BIC = _BIC;
	}
	public void set_FechaEmision(Date _FechaEmision) {
		this._FechaEmision = _FechaEmision;
	}
	public String get_NIF() {
		return _NIF;
	}
	public void set_NIF(String _NIF) {
		this._NIF = _NIF;
	}
	public String get_sufijo() {
		return _sufijo;
	}
	public void set_sufijo(String _sufijo) {
		this._sufijo = _sufijo;
	}
	public String get_CCC() {
		return _CCC;
	}
	public void set_CCC(String _CCC) {
		this._CCC = _CCC;
	}
	

}
