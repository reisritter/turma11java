package projeto_POO_1;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utilidades.*;

public class Principal {

	
	
	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<Funcionario>();
		
		int n;
		
		do 
		{			
			
			Formatacao.linha(50);
			System.out.println("1- Cadastrar Funcionario.");						
			System.out.println("2- Imprimir Funcionarios.");
			System.out.println("3- Remover Funcionarios.");
			Formatacao.linha(50);			
			n=l.nextInt();
			
			switch(n) 
			{
				case 1:
					System.out.println("1 - Física \n2 - Jurídica");
					n=l.nextInt();
					if(n==1) 
					{
						System.out.println("Nome - Salário - CPF - Impostos");
						lista.add(new FuncionarioFisico(l.next(),l.nextDouble(),l.next(),l.nextDouble()));
					}
					else if(n==2) 
					{
						System.out.println("Nome - Salário - CNPJ - Descontos");
						lista.add(new FuncionarioJuridico(l.next(),l.nextDouble(),l.next(),l.nextDouble()));					
					}
						
					System.out.println("Adicionado com Sucesso!");
					break;
				case 2:			
					
					if(!lista.isEmpty())
						for(Funcionario f : lista)
						{
							System.out.println(f.getNome());
							if(f instanceof FuncionarioFisico) 
							{							
								System.out.println(((FuncionarioFisico) f).getCpf());
								System.out.println(((FuncionarioFisico) f).calcularSalario());
							}
							else if(f instanceof FuncionarioJuridico) 
							{
								System.out.println(((FuncionarioJuridico) f).getCnpj());
								System.out.println(((FuncionarioJuridico) f).calcularSalario());
							}
							System.out.println("*********************");
							
						}
					else 
						System.out.println("Nenhum Funcionário cadastrado!");
					break;
				case 3:
					
					String nome = l.next();	
					int a = -1;
					if(!lista.isEmpty()) 
					{
						for(Funcionario f : lista)												
							if(f.getNome().equalsIgnoreCase(nome))
							{
								a= lista.indexOf(f);
								break;
								
							}
						if(a>-1)
							lista.remove(a);
					}
						
					
						
										
														
			}
		}
		while(n>=1 && n<=3);
		l.close();

	}

}
