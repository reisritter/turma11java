package projeto_POO_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ex_POO_3.Produtos;

public class Principal {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<Funcionario>();
		int n;
		
		do 
		{
			System.out.println("1- Cadastrar Funcionario.");						
			System.out.println("2- Imprimir Funcionarios.");			
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
						
					System.out.println("Adicionado com Sucesso");
					break;
				case 2:					
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
						System.out.println("*****************");
						
					}
					break;				
				default:
			}
		}
		while(n>=1 && n<=2);

	}

}
