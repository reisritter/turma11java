package ex_POO_3;

public class Pregui�a extends Animal{

	public Pregui�a() {}
	
	public Pregui�a(String nome, int idade) {
		super(nome, idade);		
	}

	@Override
	public void emitirSom() 
	{
		System.out.println("Som sinistro de Pregui�a");
	}
	
	public void subirArvores() 
	{
		System.out.println("Escalando devagar e sempre");
	}

}
