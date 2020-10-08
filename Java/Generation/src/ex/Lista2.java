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
		int res[]=v;
		for(int i=0;i<v.length-1;i++)
			for(int j=i+1;j<v.length;j++) 
			{
				if(v[j]<v[i])
					res[i]=v[j];
			}
		return res; //10,1,20,2,3,1222,32,4234,1,2,9,-1,10000000
	}
}
