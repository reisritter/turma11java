package ex;

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
	
	public double ex4(int a,int b,int c) 
	{
		return (Math.pow((a+b),2) + Math.pow((b+c),2))/2;	
	}
	
	public double ex5(double n1,double n2,double n3) 
	{
		return 	((n1*0.2)+(n2*0.3)+(n3*0.5));
	}
	
	public double ex6(int x1,int x2,int y1,int y2) 
	{
		return Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)));
	}
	
	public double [] ex7(int a,int b,int c,int d,int e,int f) 
	{		
		double res[]= {((c*e) - (b*f))/((a*e)-(b*d)),((a*f)-(c*d))/((a*e)-(b*d))};
		return res;
	}
	
	public double ex8(double cF) 
	{
		return cF+(cF*0.28)+(cF*0.45);	
	}
}
