package part3;

import java.util.Scanner;

public class Highestcf 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		System.out.println("Enter the number");
		int y=sc.nextInt();
		
		int max=x>y?x:y;
		
		int i=max/2;
		if(x%i==0 && y%i==0)
		{
			System.out.println(i);

		}
		else
			i--;
	}

}
