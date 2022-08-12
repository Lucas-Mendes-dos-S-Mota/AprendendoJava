package Familia57;

public class Paciente {
	
	private String nomePaciente;
	private String idadePaciente;
	private String sexoPaciente;
	private String sintomasPaciente;
	
	public Paciente(String nomePaciente, String idadePaciente, String sexoPaciente, String sintomasPaciente) {
		super();
		this.nomePaciente = nomePaciente;
		this.idadePaciente = idadePaciente;
		this.sexoPaciente = sexoPaciente;
		this.sintomasPaciente = sintomasPaciente;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getIdadePaciente() {
		return idadePaciente;
	}
	public void setIdadePaciente(String idadePaciente) {
		this.idadePaciente = idadePaciente;
	}
	public String getSexoPaciente() {
		return sexoPaciente;
	}
	public void setSexoPaciente(String sexoPaciente) {
		this.sexoPaciente = sexoPaciente;
	}
	public String getSintomasPaciente() {
		return sintomasPaciente;
	}
	public void setSintomasPaciente(String sintomasPaciente) {
		this.sintomasPaciente = sintomasPaciente;
	}
	//public String setIdadePaciente() {
		// TODO Auto-generated method stub
		//return null;
	//}

}
