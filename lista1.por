programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		ex8()
	}

	//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
	//   meses e dias e mostre-a expressa apenas em dias. 
	funcao ex1()
	{
		//Declaração variáveis
		inteiro dia,mes,ano,somaDias
		//Leitura
		escreva("ano\n")
		leia(ano)
		escreva("mes\n")
		leia(mes)
		escreva("dia\n")
		leia(dia)	
		//Cálculo para dias
		somaDias = dia + (mes * 30) + (ano * 365)
		//Imprimir o resultado
		escreva("\n Idade em dias: "+somaDias+" dias")			
	}
	
	//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e 
	//   mostre-a expressa em anos, meses e dias. 
	funcao ex2()
	{
		//Declaração variáveis
		inteiro dia,mes,ano,somaDias
		//Leitura
		escreva("Soma de dias:\n")
		leia(somaDias)	
		//Cálculo	
		ano = somaDias / 365
		somaDias = somaDias%365
		mes = somaDias/30
		somaDias = somaDias%30
		dia = somaDias
		//Imprimir o resultado
		escreva("\n"+ano+" anos")			
		escreva("\n"+mes+" mes")
		escreva("\n"+dia+" dias")			
	}


	//3. Faça um sistema que leia o tempo de duração de um 
	//   evento em uma fábrica expressa em segundos e mostre-o expresso em horas,
	//   minutos e segundos.	
	funcao ex3()
	{
		inteiro duracaoSeg
		inteiro seg
		inteiro min
		inteiro hor
		
		leia(duracaoSeg)

		hor = duracaoSeg / 3600
		duracaoSeg = duracaoSeg%3600
		min = duracaoSeg / 60
		duracaoSeg = duracaoSeg%60
		seg = duracaoSeg

		escreva("\n",hor," ",min," ",seg)				
	}

	//4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e 
	//   calcule a seguinte expressão: D = (R+S)/2
	//   , onde  R=(A+B)^2 e S=(B+C)^2
	funcao ex4()
	{
		inteiro A
		inteiro B
		inteiro C
		inteiro D
		inteiro R
		inteiro S

		leia(A,B,C)

		R=(A+B)^2 
		S=(B+C)^2
		D=(R+S)/2

		escreva("\nD: ",D)
		
	}

	//5. Faça um sistema que leia as 3 notas de um aluno e 
	//   calcule a média final deste aluno. 
	//   Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 

	funcao ex5()
	{
		inteiro A,B,C
		real media
		
		leia(A,B,C)

		media = ((A*0.2)+(B*0.3)+(C*0.5))
		
		escreva(media)	
	}

	//6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
	//   P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: 
	//   D=((x2 - x1)^2 + (y2-y1)^2)^0.5
	funcao ex6()
	{
		inteiro x1,x2,y1,y2	
		real d = 0.0
		
		leia(x1,y1,x2,y2)

		d=((x2-x1)^2 + (y2-y1)^2) 
		d = mat.raiz(d,2.0)

		escreva(d)
	}
	
	//7. Um sistema de equações lineares do tipo: 
	//   ,pode ser resolvido segundo mostrado abaixo : 
	//   x = (c*E - b*f)/(a*E - b*d)
	//   y = (a*f - c*d)/(a*E - b*d)
	//  Escreva um sistema que lê os coeficientes a,b,c,d,e e f e 
	//  calcula e mostra os valores de x e y. 
	funcao ex7()
	{
		inteiro a,b,c,d,E,f
		real x,y
		
		leia(a,b,c,d,E,f)

		x = (c*E - b*f)/(a*E - b*d)
		y = (a*f - c*d)/(a*E - b*d)

		escreva("\nx = ",x," y = ",y,"\n")
	}

	//8. O custo ao consumidor de um carro novo é a soma do custo de fábrica 
	//   com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
	//   Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
	//   escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
	funcao ex8()
	{
		real custoFab,custoCon

		leia(custoFab)

		custoCon = custoFab + custoFab*0.28 + custoFab*0.45

		escreva(custoCon)
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1274; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */