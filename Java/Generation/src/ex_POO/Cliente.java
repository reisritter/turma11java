package ex_POO;

public class Cliente {
	
	private String nome;
	private String cpf;
	int idade;
	String tel;
	
	void imprimirCliente(String nome) 
	{
		this.nome = nome;
		System.out.println(this.nome);
	}
	
	void imprimirCliente(String nome,String cpf) 
	{
		this.nome = nome;
		this.cpf = cpf;
		System.out.printf("Nome: %s CPF: %s",this.nome,this.cpf);
	}
	
	String retornaNome(String nome) 
	{
		this.nome = nome;
		return this.nome;
	}

}
