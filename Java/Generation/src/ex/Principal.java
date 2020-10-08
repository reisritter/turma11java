package ex;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) 
	{						
		Lista2 l = new Lista2();
		int res[]= {10,1,20,2,3,1222,32,4234,1,2,9,-1,10000000};
		for(int i=0;i<res.length;i++)
			System.out.println(l.ex2(res)[i]);
	}		
}
