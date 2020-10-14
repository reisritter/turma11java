package ex_POO;

public class Funcionario {
	
	private String nome;
	private String identificacao;
	private double salario;
	
	public Funcionario() 
	{
		
	}
	
	public Funcionario(String nome,String identificacao,double salario) 
	{
		this.nome = nome;
		this.identificacao = identificacao;
		this.salario = salario;
	}
	
	void imprimirFunc() 
	{
		System.out.println(this.nome);
		System.out.println(this.identificacao);
		System.out.println(this.salario);
	}

}
