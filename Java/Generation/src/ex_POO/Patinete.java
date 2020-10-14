package ex_POO;

public class Patinete 
{
	private String modelo;
	private double velocidade;
	
	public Patinete() 
	{
		
	}
	
	public Patinete(String modelo,double velocidade) 
	{
		this.modelo = modelo;
		this.velocidade = velocidade;
	}
	
	void imprimirPatinete() 
	{
		System.out.println(this.modelo);
		System.out.println(this.velocidade);
	}
}
