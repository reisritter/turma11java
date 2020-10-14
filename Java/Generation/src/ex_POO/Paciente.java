package ex_POO;

public class Paciente {

	private String nome;
	private String cpf;
	private boolean convenio;	
	
	public Paciente() {}
	
	public Paciente(String nome, String cpf,boolean convenio) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.convenio = convenio;
	}
	
	void possuiConvenio() 
	{
		System.out.println(this.convenio==true?"SIM":"NÂO");
	}

}
