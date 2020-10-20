package ex_POO_3;

public class Cavalo extends Animal{

	public Cavalo() {}
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() 
	{
		System.out.println("Som de cavalor");
	}
	
	public void correr() 
	{
		System.out.println("Galopando loucamente");
	}

}
