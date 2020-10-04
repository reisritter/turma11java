programa
{	
	funcao inicio()
	{
		
	}

	/*
	1. Elabore um programa que calcule o que deve ser pago por um produto, 
	considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
	Utilize os códigos da tabela a seguir para ler qual a condição de pagamento 
	escolhida e efetuar o cálculo adequado. 
	Código Condição de pagamento 
		1 À vista em dinheiro ou cheque, recebe 20% de desconto 
		2 À vista no cartão de crédito, recebe 15% de desconto 
		3 Em duas vezes, preço normal de etiqueta sem juros 
		4 Em três vezes, preço normal de etiqueta mais juros de 10%
	*/
	funcao ex1()
	{
		cadeia prod = "Prod1"
		real preco = 20.0
		inteiro n
		leia(n)
		escolha(n)
		{
			caso 1:preco*=0.8
			pare
			caso 2:preco*=0.85
			pare
			caso 3:pare
			caso 4:preco+=1.1
			senao:
		}
		escreva("Produto: ",prod," Preço: ",preco)
	}

	/*
	O2.  IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde 
	para dar uma indicação sobre a condição de peso de uma pessoa adulta. 
	A fórmula é IMC = peso / ( altura )2 
	Elabore um programa que leia o peso e a altura de um adulto e mostre 
	sua condição de acordo com a tabela abaixo. 
	IMC em adultos Condição 
		Abaixo de 18,5 Abaixo do peso 
		Entre 18,5 e 25 Peso normal 
		Entre 25 e 30 Acima do peso 
		Acima de 30 obeso
	*/

	funcao ex2()
	{
		real peso,altura,imc=0.0
		leia(peso,altura)
		imc=peso/(altura*altura)
		se (imc<18.5)
			escreva("Abaixo do peso")
		senao se(imc>=18.5 e imc<25)
			escreva("Peso normal")
		senao se(imc>=25 e imc<30)
			escreva("Acima do peso")
		senao
			escreva("Obeso")
	}

	/*
	3. Escrever um programa que leia uma quantidade desconhecida de números e 
	conte quantos deles estão nos seguintes intervalos: 
	[0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando 
	for lido um número negativo.
	*/

	funcao ex3()
	{
		
		inteiro n,pos[4]={0,0,0,0}
		leia(n)	
		enquanto(n>=0)
		{
			se(n>=0 e n<=25)
				pos[0]++
			senao se(n>=26 e n<=50)
				pos[1]++
			senao se(n>=51 e n<=75)
				pos[2]++
			senao se(n>=76 e n<=100)
				pos[3]++
			senao
				escreva("n > 100\n")
			leia(n)	
		}
		escreva("\n[0-25]: ",pos[0])
		escreva("\n[26-50]: ",pos[1])
		escreva("\n[51-75]: ",pos[2])
		escreva("\n[76-100]: ",pos[3])		
	}

	/*	 
	4. Faça um programa que calcula e escreve a seguinte soma: 
	soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50  
	*/

	funcao ex4()
	{
		const inteiro MAX=50
		inteiro i
		real soma=0.0
		para(i=0;i<MAX;i++)		
			soma+= ((2*i+1)/(i+1))			
		escreva(soma)
		
	}
	
	/*
	 5. Faça um programa que leia um vetor de 5 posições para números reais 
	 e, depois, um código inteiro. Se o código for zero, finalize o programa; 
	 se for 1, mostre o vetor na ordem direta; se for 2, 
	 mostre o vetor na ordem inversa. Caso, o código for diferente de 1 e 2, 
	 escreva uma mensagem informando que o código inválido.
	*/
	funcao ex5()
	{
		const inteiro MAX = 5
		real v1[MAX]
		inteiro n,i

		para(i=0;i<MAX;i++)
			leia(v1[i])
		leia(n)
		escolha(n)
		{
			caso 0:
			pare
			caso 1:
				para(i=0;i<MAX;i++)
					escreva("\n ",v1[i])
			pare
			caso 2:
				para(i=MAX-1;i>=0;i--)
					escreva("\n ",v1[i])
			pare
			caso contrario:
			escreva("Numero inválido!")
		
		}
		
	}

	/*
	6. Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos. 
	Em seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.
	*/
	funcao ex6()
	{
		const inteiro MAX = 3
		inteiro v[MAX],m[MAX][MAX],i,j,res[MAX][MAX]
		para(i=0;i<MAX;i++)		
			para(j=0;j<MAX;j++)
			{
				escreva("m[",i,"][",j,"]= ")
				leia(m[i][j])
			}
		para(i=0;i<MAX;i++)
		{
			escreva("v[",i,"]= ")
			leia(v[i])
		}

		para(i=0;i<MAX;i++)		
			para(j=0;j<MAX;j++)			
				res[i][j]= v[i]*m[i][j]

		
		para(i=0;i<MAX;i++)		
			para(j=0;j<MAX;j++)			
				escreva("\n3res[",i,"][",j,"]= ",res[i][j])							
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */