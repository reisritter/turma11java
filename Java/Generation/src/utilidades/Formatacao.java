package utilidades;

public class Formatacao {

	public static void linha(int n) 
	{
		String r="";
		for(int i=0;i<n;i++)
			r += "*";
		System.out.println(r);
	}
	
	public static void limparTela(int n) 
	{
		for(int i=0;i<n;i++)
			System.out.println("");
	}

}
