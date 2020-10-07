package ex;
import java.util.Scanner;

public class Lista1 {

	public int ex1(int ano,int mes, int dia) 
	{		
		return ((ano*360)+(mes*30)+dia);
	}
	
	public int[] ex2(int idade) 
	{		
		int tempo[]= {idade/360,(idade%360)/30,(idade/360)%30};
		return tempo;
	}
	
	public int[] ex3(int t) 
	{		
		int tempo[] = {t/3600,(t%3600)/60,(t%3600)%60};
		return tempo;
	}
	
}
