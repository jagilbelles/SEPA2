package com.CSB3411.fichero;

import java.util.ArrayList;
/*este es un comentario de prueba de gitHub*/
public class EstructuraCSB3411 {
	

	private RT _RT;
	private RO1 _RO1;
	private RO2 _RO2;
	private ArrayList<Pago> _pagos;

	public EstructuraCSB3411() {
		super();
		_pagos = new ArrayList<Pago>();
		
	}

	public RT get_RT() {
		return _RT;
	}

	public ArrayList<Pago> get_pagos() {
		return _pagos;
	}

	public void set_pagos(ArrayList<Pago> _pagos) {
		this._pagos = _pagos;
	}

	public RO2 get_RO2() {
		return _RO2;
	}

	public void set_RO2(RO2 _RO2) {
		this._RO2 = _RO2;
	}

	public RO1 get_RO1() {
		return _RO1;
	}

	public void set_RO1(RO1 _RO1) {
		this._RO1 = _RO1;
	}

	public void set_RT(RT _RT) {
		this._RT = _RT;
	}
	
	

}
