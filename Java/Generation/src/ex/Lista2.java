package ex;

public class Lista2 {

	public int ex1(int v[]) 
	{
		int maior=0;
		for(int i=0;i<v.length;i++) 		
			if(maior<v[i])
				maior=v[i];
		return maior;
	}
	
	public int[] ex2(int v[]) 
	{
		int aux=0;
		for(int i=0;i<v.length-1;i++)
			for(int j=i+1;j<v.length;j++) 			
				if(v[j]<v[i]) 
				{
					aux = v[i];
					v[i]=v[j];
					v[j]=aux;
				}								
		return v;
	}
	
	public String ex3(int i) 
	{
		if(i>17 && i<=25)
			return "adulto";
		else if(i>14)
			return "juvenil";
		else if(i>9)
			return "infantil";
		else return "inválido";
	}
	
	public double ex4(int n) 
	{
		return n%2==0?Math.sqrt(n):Math.pow(n,2);
	}
}
