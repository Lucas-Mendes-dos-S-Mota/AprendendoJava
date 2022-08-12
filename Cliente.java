package Familia57;

public class Cliente {
	private String nomecliente;
	private String saldoDaCarteira;
	private String carrinhodeCompra;
	
	public Cliente(String nomecliente, String saldoDaCarteira, String carrinhodeCompra) {
		super();
		this.nomecliente = nomecliente;
		this.saldoDaCarteira = saldoDaCarteira;
		this.carrinhodeCompra = carrinhodeCompra;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public String getSaldoDaCarteira() {
		return saldoDaCarteira;
	}

	public void setSaldoDaCarteira(String saldoDaCarteira) {
		this.saldoDaCarteira = saldoDaCarteira;
	}

	public String getCarrinhodeCompra() {
		return carrinhodeCompra;
	}

	public void setCarrinhodeCompra(String carrinhodeCompra) {
		this.carrinhodeCompra = carrinhodeCompra;
	}
	
	

	}

	


