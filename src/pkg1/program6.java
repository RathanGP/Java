package pkg1;

import java.util.Scanner;

public class program6 {
	static int x=0,y=1,z=0;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int count=10;
		
		System.out.print(x+" "+y);
		fibonacciseries(count-2);
		
	}
	public static void fibonacciseries(int count)
	{
		
		if(count>0)
		{
			z=x+y;
			x=y;
			y=z;
			System.out.print(" "+z);
			fibonacciseries(count-1);
			
		}
	}

}