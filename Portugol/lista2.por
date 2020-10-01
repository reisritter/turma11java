programa
{
	
	funcao inicio()
	{
		ex8()
	}
	/*
	1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar 
	o rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate 
	maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) 
	deve pagar um multa de R$ 4,00 por quilo excedente. 
	João precisa que você faça um sistema que leia a variável P (peso de tomates) e 
	verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M 
	o valor da multa que João deverá pagar. 
	Caso contrário mostrar tais variáveis com o conteúdo ZERO.
	*/

	funcao ex1()
	{
		inteiro p,E = 0
		real m

		leia(p)

		se(p >= 50)
		{
			E = p - 50
			m = E * 4.0	
		}

		escreva("E: ",E," ","M: ",m)
	}

	/*
	2) Elabore um sistema que leia as variáveis C e N, respectivamente código e 
	número de horas trabalhadas de um operário. E calcule o salário sabendo-se que 
	ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o 
	excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
	A hora excedente de trabalho vale R$ 20,00. No final do processamento 
	imprimir o salário total e o salário excedente.
	*/
	funcao ex2()
	{
		inteiro n
		real salario,E = 0.0
		leia(n)
		
		se(n > 50)
		{
			E = (n-50) * 20.0
			salario = 500 + E
		}
		senao		
			salario = n*10.0

		escreva("Salário: ",salario," E: ",E)			
			
	}

	/*
	3) Desenvolva um sistema em que:
	Leia 4 (quatro) números;
	Calcule o quadrado de cada um;
	Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	*/
	funcao ex3()
	{
		inteiro a,b,c,d
		leia(a,b,c,d)	

		se(c*c>=1000)
			escreva("C = ",c," ",c*c)
		senao
		{
			escreva("\nA= ",a," ",a*a)	
			escreva("\nB= ",b," ",b*b)
			escreva("\nC= ",c," ",c*c)
			escreva("\nD= ",d," ",d*d)
		}
	}

	/*
	 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este 
	 número é par ou ímpar, e se é positivo ou negativo.	 
	*/
	funcao ex4()
	{
		//OBS: CONSIDERANDO QUE O ZERO É UM NÚMERO POSITIVO PAR E QUE HÁ NÚMEROS NEGATIVOS
	 	//IMPARES E PARES!
	 	
		inteiro n
		cadeia esc
		leia(n)

		se (n>=0)
			se(n%2==0)
				esc=	"Número positivo e par"
			senao
				esc="Número positivo e ímpar"
		senao
			se(n%2==0)
				esc=	"Número negativo e par"
			senao
				esc=	"Número negativo e ímpar"

		escreva(esc)
		
	}

	/*
	5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 
	3 grupos de indústrias que são altamente poluentes do meio ambiente. 
	O índice de poluição aceitável varia de 0,05 até 0,25. 
	Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a 
	suspenderem suas atividades, se o índice crescer para 0,4 as industrias 
	do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice 
	atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
	Faça um sistema que leia o índice de poluição medido e emita a notificação adequada 
	aos diferentes grupos de empresas.	 
	*/
	funcao ex5()
	{
		real n
		cadeia x = "Suspender atividades: \n"
		leia(n)

		se(n>0.25 e n<=0.39)
			x += "1º Grupo"
		senao se(n>0.39 e n<=0.49)
			x += "1º Grupo\n2º Grupo"
		senao se(n>0.49)
			x += "Todos os Grupos"
		escreva(x)
	}

	/*
	6) Elabore um sistema que dada a idade de um nadador 
	classifique-o em uma das seguintes categorias:
		Infantil A = 5 a 7 anos
		Infantil B = 8 a 11 anos
		Juvenil A = 12 a 13 anos
		Juvenil B = 14 a 17 anos
		Adultos = Maiores de 18 anos
	*/
	funcao ex6()
	{
		inteiro i
		leia(i)
		se (i>=5 e i<=7)
			escreva("Infantil A = 5 a 7 anos")
		senao se(i>7 e i<=11)
			escreva("Infantil B = 8 a 11 anos")
		senao se(i>11 e i<=13)
			escreva("Juvenil A = 12 a 13 anos")
		senao se(i>13 e i<=17)
			escreva("Juvenil B = 14 a 17 anos")
		senao se(i>17)
			escreva("Adultos = Maiores de 18 anos")
	}

	/*
	7) Receber valores de base e altura de um triângulo e verificar se são valores válidos 
	(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
	*/
	funcao ex7()
	{
		inteiro b,h
		real area=0.0
		leia(b,h)
		se(b>0 e h>0)
			area = (b*h)/2.0
		escreva(area)
		
	}

	/*
	8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma 
	for maior que 100, caso contrário imprimi-la com o valor zero.
	*/
	funcao ex8()
	{
		inteiro n,res = 0
		leia(n)
		se(n>100)
			res=n
		escreva(res)					
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4486; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */