package com.CSB3411.fichero;

public class Pago {

	private String _referenciaBeneficiario;
	private Double _importe;
	private String _CCCBeneficiario;
	private String _referenciaParaElBeneficiario;

	public String get_referenciaParaElBeneficiario() {
		return _referenciaParaElBeneficiario;
	}

	public void set_referenciaParaElBeneficiario(
			String _referenciaParaElBeneficiario) {
		this._referenciaParaElBeneficiario = _referenciaParaElBeneficiario;
	}

	
	public boolean is_isSet() {
		// han de estar establecidas estas propiedades
		if (_referenciaBeneficiario == "" && 
			_CCCBeneficiario == "") {
			_isSet = true;
		} else {
			_isSet = false;
		}
		return _isSet;
	}

	private boolean _isSet;
	
	public String get_referenciaBeneficiario() {
		return _referenciaBeneficiario;
	}
	public void set_referenciaBeneficiario(String _referenciaBeneficiario) {
		this._referenciaBeneficiario = _referenciaBeneficiario;
	}
	public Double get_importe() {
		return _importe;
	}
	public void set_importe(Double _importe) {
		this._importe = _importe;
	}
	public String get_CCCBeneficiario() {
		return _CCCBeneficiario;
	}
	public void set_CCCBeneficiario(String _CCCBeneficiario) {
		this._CCCBeneficiario = _CCCBeneficiario;
	}

	/**
	 * 
	 */
	public Pago() {
		super();
		this.inicializar();
	}
	
	/**
	 * Inicializa todas las propiedades del objeto
	 */
	public void inicializar() {
		_referenciaBeneficiario = "";
		_importe = 0.0;
		_CCCBeneficiario = "";
				

		
	}
	
	
	
}
