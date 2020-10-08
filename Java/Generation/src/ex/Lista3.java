package ex;
import java.util.Scanner;
public class Lista3 {
	
	public void ex1() 
	{
		for(int i=1000;i<2000;i++)
			if(i%11==5)
				System.out.println(i);
	}
	
	public int[] ex2(int v[]) 
	{
		int res[]= {0,0};
		for(int i=0;i<v.length;i++)
			if(v[i]%2==0)
				res[0]++;
			else res[1]++;
		return res;			
	}

	/*
	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
	Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
	*/

	public void ex3()
	{
		Scanner s = new Scanner(System.in);
		int idade=s.nextInt(),v[]={0,0};
		while(idade != -99)
		{			
			if(idade<21)
				v[0]++;
			else if(idade>50)
				v[1]++;
			idade=s.nextInt();
		}
		s.close();
		System.out.printf("<21 = %d >50 = %d",v[0],v[1]);
	}

	/*
	Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos 
	de uma região. Para tanto, a cada uma das pessoas era perguntado: idade, 
	sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
	(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
	Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:(WHILE)
		0 número de pessoas calmas; 
		1 número de mulheres nervosas; 
		2 número de homens agressivos; 
		3 número de outros calmos;
		4 número de pessoas nervosas com mais de 40 anos; 
		5 número de pessoas calmas com menos de 18 anos.
	*/

	public void ex4()
	{
		//Scanner s = new Scanner(System.in);
		int v[]= new int[6],idade=0,sexo=0,comp=0,c=0;		
		while(c<150)
		{			
			idade=(int)(Math.random()*90);//idade
			sexo=(int)(Math.random()*3);//sexo
			comp=(int)(Math.random()*3);//comportamento

			if(comp==1)//0 número de pessoas calmas;
			{	v[0]++;
				if(sexo==3)//3 número de outros calmos;
					v[3]++;
				if(idade<18)//5 número de pessoas calmas com menos de 18 anos
					v[5]++;
			}				
			else if(comp==2)
			{
				if(sexo==1)//1 número de mulheres nervosas
					v[1]++;
				if(idade>40)//4 número de pessoas nervosas com mais de 40 anos
					v[4]++;
			}
			else if(comp==3)
				if(sexo==2)//2 número de homens agressivos
					v[2]++;			
			c++;
		}
		System.out.printf("0- %d 1- %d 2- %d 3- %d 4- %d 5- %d",v[0],v[1],v[2],v[3],v[4],v[5]);
	}
	/*
	Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
	No final, mostre a soma dos números digitados.(DO...WHILE)
	*/

	public void ex5()
	{
		Scanner l = new Scanner(System.in);
		int n=0,soma=0;
		do
		{
			n=l.nextInt();
			soma+=n;
		}while(n!=0);
		l.close();
		System.out.println(soma);
	}

	/*
	Escrever um programa que receba vários números inteiros no teclado. E no final imprimir 
	a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
	*/

	public void ex6()
	{
		Scanner s = new Scanner(System.in);
		int n=0,cont=0;
		double media=0.0;
		do
		{
			n=s.nextInt();
			if(n%3==0)
			{
				media+=n;
				cont++;
			}				
		}while(n!=0);
		s.close();
		System.out.println(media/cont);
	}



}
