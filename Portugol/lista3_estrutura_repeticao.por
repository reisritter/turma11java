programa
{
	
	funcao inicio()
	{
		ex2_faca()
	}

	//PARA
	/*
	1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus 
	habitantes, coletando dados sobre o salário e número de filhos.
	A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00.
	*/
	funcao ex1_para()
	{
		inteiro i,filho
		real mediaSal=0,sal,mediaFilho=0,maior=0,percentual=0
		const inteiro totalP = 2
		
		para(i=0;i<totalP;i++)
		{
			leia(sal,filho)
			mediaSal+=sal
			mediaFilho+=filho
			
			se(sal>maior)
				maior=sal
			se(sal<=100)
				percentual+=1
		}

		escreva("\nMedia Salário: ",mediaSal/totalP)
		escreva("\nMedia Filho: ",mediaFilho/totalP)
		escreva("\nMaior Salário: ",maior)
		escreva("\nPercentual de Pessoas com salário menores que 100: ",percentual/(totalP/100.0),"%")
		
	}
	
  	/*
	2- Desenvolver um sistema que efetue a soma de todos os números 
	ímpares que são  múltiplos de três e que se encontram no conjunto 
	dos números de 1 até 500.  	
  	*/
	funcao ex2_para()
	{
		inteiro i,count=0
		para(i=3;i<=500;i+=3)
			se(i%2==1)
				count+=i

		escreva("Somatória: ",count)				
	}

	//ENQUANTO

	/*
	1- Elaborar um programa que efetue a leitura sucessiva de valores 
	numéricos e apresente no final o total do somatório, a média e o 
	total de valores lidos. O programa deve fazer as leituras dos valores 
	enquanto o usuário estiver fornecendo valores positivos. Ou seja, o 
	programa deve parar quando o usuário fornecer um valor negativo.	
	*/
	funcao ex1_enquanto()
	{
		inteiro count=0,soma=0,media=0,n
		leia(n)
		enquanto(n>=0)
		{
			soma+=n
			count+=1
			media=soma/count
			leia(n)
		}
		escreva("Soma: ",soma,"\nCount: ",count,"\nmedia: ",media)
	}
	
	/*
	2- Obtenha um número digitado pelo usuário e repita a operação de 
	multiplicar ele por três  (imprimindo o novo valor) até que ele seja 
	maior do que 100. Ex.: se o usuário digita 5,  deveremos observar na 
	tela a seguinte sequência: 5 15 45 135.
	*/
	funcao ex2_enquanto()
	{
		inteiro n
		leia(n)
		escreva(n)
		enquanto(n<100)
			escreva("\n",n*=3)
		
	}
	//FAÇA...ENQUANTO

	/*
	1- Faça um programa que mostre uma contagem na tela de 233 a 456, 
	só que contando de 3 em 3 quando estiver entre 300 e 400 e de 
	5 em 5 quando não estiver.
	*/
	funcao ex1_faca()
	{
		inteiro i=233
		faca
		{
			se(i>=300 e i<=400)
				escreva("\n",i+=5)
			senao
				escreva("\n",i+=3)
		}enquanto(i<456)
	}
	/*
	2- Faça um programa que pegue um número do teclado e calcule a soma 
	de todos os números  de 1 até ele. Ex.: o usuário entra 7, o programa 
	vai mostrar 28, pois  1+2+3+4+5+6+7=28.	
	*/
	funcao ex2_faca()
	{
		inteiro n,soma=0,count=0
		leia(n)
		faca
		{
			soma+=count
			count++
		}enquanto(count<=n)
		escreva(soma)
	}


}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2767; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */