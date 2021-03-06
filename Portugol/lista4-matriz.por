programa
{
	
	funcao inicio()
	{
		
	}	

	//Insere valores em uma matriz
	funcao lerMatriz(inteiro L,inteiro C,inteiro M[][])
	{
		inteiro i,j
		para(i=0;i<L;i++)
			para(j=0;j<C;j++)
				leia(M[i][j])	
	}

	//Imprime os valores de uma matriz
	funcao escrevaMatriz(inteiro L,inteiro C,inteiro M[][])
	{
		inteiro i,j
		para(i=0;i<L;i++)
			para(j=0;j<C;j++)
				escreva("\nM[",i,"][",j,"]= ",M[i][j])	
	}

	//1.Faça um programa que crie um vetor por leitura com 5 valores de 
	//pontuação de uma atividade e o escreva em seguida. Encontre após a 
	//maior pontuação e a apresente.
	funcao ex1()
	{
		const inteiro L=5
		inteiro i,maior=0,M[L]

		para(i=0;i<L;i++)
			leia(M[i])
			
		maior=M[0]
		para(i=1;i<L;i++)
			se(M[i]>maior)
				maior=M[i]
		escreva(maior)			
	}

	//2.Um dado é lançado 10 vezes e o valor correspondente é anotado. 
	//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
	//A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
	//e apresente também quantas foram as ocorrências da maior pontuação.
	funcao ex2()
	{
		const inteiro L=10
		inteiro i,maior=0,M[L]
		real media=0.0
		para(i=0;i<L;i++)
		{
			leia(M[i])
			media+=M[i]			
			se(M[i]==6)
				maior++
		}
		escreva("Media: ",media/L,"\nOcorrências: ",maior)
			
	}
	//3.Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	//	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma 
	//	posição das matrizes N1 e N2;
	//	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma 
	//	posição das matrizes N1 e N2.
	funcao ex3()
	{
		const inteiro L=4,C=6
		inteiro i,j,N1[L][C],N2[L][C],M1[L][C],M2[L][C]
		lerMatriz(L,C,N1)
		lerMatriz(L,C,N2)

		para(i=0;i<L;i++)
			para(j=0;j<C;j++)			
			{				
				M1[i][j]=N1[i][j]+N2[i][j]
				M2[i][j]=N1[i][j]-N2[i][j]
			}

		escrevaMatriz(L,C,M1)
		escrevaMatriz(L,C,M2)
	}
	//4.Crie um programa que receba valores do usuário para 
	//preencher uma matriz 3X3, e em seguida, exiba a soma dos valores 
	//dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
	funcao ex4()
	{
		const inteiro L=3,C=3
		inteiro i,j,soma1=0,soma2=0,matriz[L][C]

		lerMatriz(L,C,matriz)

		para(i=0;i<L;i++)
			para(j=0;j<C;j++)
			{
				soma1+=matriz[i][j]
				se (i==j)
					soma2+=matriz[i][j]
			}
		escreva(soma1," ",soma2)		
	}

	//Leia 2 vetores de 4 posições, um com os nomes dos alunos e o outro com as 
	//respectivas notas. Depois imprima os vetores, marcando com um * os alunos com
	//a maior nota!
	funcao exercicioEd()
	{
		const inteiro C=4
		inteiro i,j,N[C],maior=0,k
		cadeia A[C]

		para(i=0;i<C;i++)
		{
			leia(A[i])
			leia(N[i])
			se(N[i]>maior)			
				maior=N[i]									
		}

		para(i=0;i<C;i++)
			se(N[i]==maior)
				A[i]+=" X"

		para(i=0;i<C;i++)
			escreva("\n ",A[i]," ",N[i])	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 142; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */