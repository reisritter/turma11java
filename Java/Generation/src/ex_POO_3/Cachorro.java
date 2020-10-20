package ex_POO_3;

public class Cachorro extends Animal{	
	
	public Cachorro() {}
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);	
	}
	
	@Override
	public void emitirSom() 
	{
		System.out.println("AUAUAU");
	}
	
	public void correr() 
	{
		System.out.println("Correndo loucamente");
	}

}
