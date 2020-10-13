package ex;

import java.util.Scanner;

public class Lista4 {

    /*
    1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. 
    O programa deve executar os seguintes passos: 
        (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
        (b) Armazene em uma variável inteira (simples) a soma entre os valores 
            das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
        (c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
        (d) Mostre na tela cada valor do vetor A, um em cada linha.
    */
    
    public void ex1()
    {
        int a[] = { 1, 0, 5, -2, -5, 7},soma=0;  
        soma=a[0]+a[1]+a[5];
        System.out.println(soma);
        a[4]= 100;
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
    
    /*
    2- Faça um programa que receba 6 números inteiros e mostre: 
        • Os números pares digitados;  
        • A soma dos números pares digitados; 
        • Os números ímpares digitados; 
        • A quantidade de números ímpares digitados.
    */
    




    public void ex2()
    {
        Scanner s = new Scanner(System.in);
        int v[]=new int[6],somaPares=0,qtdImpares=0;
        String nPares="",nImpares="";
        for(int i=0;i<v.length;i++)
        {
            v[i]=s.nextInt();
            if(v[i]%2==0)
            {
                nPares+=" "+v[i];
                somaPares+=v[i];
            }
            else
            {
                nImpares+=" "+v[i];
                qtdImpares++;
            }                
        }           
        s.close();
        System.out.printf("%s %d\n%s %d",nPares,somaPares,nImpares,qtdImpares);
    }

    /*
    3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
    */
    
    public void ex3()
    {
        Scanner s = new Scanner(System.in);
        int count=0;
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            {
                if(s.nextInt()>10)
                    count++;
            }
        s.close();
        System.out.println(count);
    }

    /*
    4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. 
    Ofereça ao usuário um menu de opções:
        (1) somar as duas matrizes 
        (2) subtrair a primeira matriz da segunda 
        (3) adicionar uma constante as duas matrizes
        (4) imprimir as matrizes 
    Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
    Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante 
    deve ser armazenado na própria matriz.
    */

    public void imprimir(int [][] v,int MAX)
    {
        System.out.println("######################");
        for(int i=0;i<MAX;i++)
            for(int j=0;j<MAX;j++)
                System.out.println(v[i][j]);
        System.out.println("######################");
    }

    public void ex4()
    {
        Scanner s = new Scanner(System.in);
        final int MAX = 2;
        int v1[][] = new int[MAX][MAX],v2[][] = new int[MAX][MAX],v3[][] = {{0,0},{0,0}};
        int op = 0,consta=0;        
        for(int i=0;i<MAX;i++)
            for(int j=0;j<MAX;j++)
            {
                v1[i][j]=s.nextInt();
                v2[i][j]=s.nextInt();
            }
        do
        {
            op=s.nextInt();
            if(op==1)
            for(int i=0;i<MAX;i++)
                for(int j=0;j<MAX;j++)
                    v3[i][j]=v1[i][j]+v2[i][j];
            else if(op==2)
            for(int i=0;i<MAX;i++)
                for(int j=0;j<MAX;j++)
                    v3[i][j]=v1[i][j]-v2[i][j];
            else if(op==3)
            {
                consta=s.nextInt();
                for(int i=0;i<MAX;i++)
                    for(int j=0;j<MAX;j++)
                    {
                        v1[i][j]+=consta;
                        v2[i][j]+=consta;
                    }                        
            }
            else if(op==4)                            
            {
                imprimir(v1, MAX);
                imprimir(v2, MAX);
                imprimir(v3, MAX);
            }                        
        }
        while(op>=1 && op<=4);
        s.close();

    }
}
