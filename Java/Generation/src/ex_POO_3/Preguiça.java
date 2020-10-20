package ex_POO_3;

public class Preguiça extends Animal{

	public Preguiça() {}
	
	public Preguiça(String nome, int idade) {
		super(nome, idade);		
	}

	@Override
	public void emitirSom() 
	{
		System.out.println("Som sinistro de Preguiça");
	}
	
	public void subirArvores() 
	{
		System.out.println("Escalando devagar e sempre");
	}

}
