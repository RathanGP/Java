package pkg1;

import java.util.Scanner;

public class program5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int count=10,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int x=sc.nextInt();
		System.out.println("enter the secound number");
		int y=sc.nextInt();
		System.out.println(x);
		System.out.println(y);
		
		for(int i=2;i<count;i++)
		{
			z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}
			
	}

}
