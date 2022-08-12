package Familia57;

public class DadosDoPaciente {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente("Lucas mendes","23","M","Febre, dor de cabeça");
		
		System.out.println("Nome do Paciente(a): "+paciente1.getNomePaciente());
		System.out.println("\nIdade do Paciente(a): "+paciente1.getIdadePaciente()+" anos");
		System.out.println("\nSexo do Paciente(a): "+paciente1.getSexoPaciente());
		System.out.println("\nSintomas do Paciente(a): "+paciente1.getSintomasPaciente());

	}

}
