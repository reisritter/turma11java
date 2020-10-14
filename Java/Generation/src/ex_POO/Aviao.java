package ex_POO;

public class Aviao {
	
	private String nome;
	private String modelo;
	private double potencia;
	private int ano;
	
	public Aviao() 
	{
		
	}
	
	public Aviao(String nome,String modelo,double potencia,int ano)
	{
		this.nome = nome;
		this.modelo = modelo;
		this.potencia = potencia;
		this.ano = ano;
	}
	
	void imprimirAviao() 
	{
		System.out.println(this.nome);
		System.out.println(this.modelo);
		System.out.println(this.potencia);
		System.out.println(this.ano);
	}
	

}
