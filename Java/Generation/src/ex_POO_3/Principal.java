package ex_POO_3;

import java.util.*;

public class Principal {

	public static void pular() 
	{
		System.out.println("\n");
	}
	
	public static void main(String[]args) 
	{
		/*

	    1.Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), 
	    utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a todos os animais
	    fique na classe Animal: 


	    2.Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e invoque o método que emite 
	    o som de cada um de forma polimórfica, isto é, independente do tipo de animal.


	    3.Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo 
	    List do Java para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:

	        Armazenar dados da List
	        Remover dados da list;
	        Atualizar dados da list.
	        Apresentar todos os dados da list.

		 */
		
		// 2.
				
		Cachorro ca1 = new Cachorro("DOG",5);
		Cavalo cav1 = new Cavalo("Horse",15);
		Preguiça preg = new Preguiça("Flash",52);
		ca1.correr();
		ca1.emitirSom();
		cav1.correr();
		cav1.emitirSom();
		preg.emitirSom();
		preg.subirArvores();
		
		 // 3.
		
		Scanner l = new Scanner(System.in);
		List<Produtos> lista = new ArrayList<Produtos>();
		int n;
		
		do 
		{
			System.out.println("1- Cadastrar Produto.");			
			System.out.println("2- Remover Produtos.");			
			System.out.println("3- Atualizar quantidades.");			
			System.out.println("4- Imprimir Produtos.");			
			n=l.nextInt();
			
			switch(n) 
			{
				case 1:
					System.out.println("Nome, preço e quantidade:");
					pular();
					lista.add(new Produtos(l.next(),l.nextDouble(),l.nextInt()));
					System.out.println("Adicionado com Sucesso");
					pular();
					break;
				case 2:					
					lista.clear();
					System.out.println("Removido com sucesso!");
					pular();
					break;
				case 3:
					System.out.println("Atualizar qtds: ");
					for(Produtos p : lista)
					{
						System.out.println(p.getNome());						
						p.setQuantidade(l.nextInt());
					}
					System.out.println("Atualizado com sucesso!");
					break;
				case 4:
					
					for(Produtos p : lista)
					{
						System.out.println("Nome: "+p.getNome());						
						System.out.println("Preço: "+p.getPreco());						
						System.out.println("Quantidade: "+p.getQuantidade());						
					}
					break;
				default:
			}
		}
		while(n>=1 && n<=4);
		
	}

}
