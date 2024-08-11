package pkg1;
import java.util.Scanner;

public class program2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month");
		String s=sc.next();
		System.out.println("enter the year");
		int year=sc.nextInt();
		switch(s)
		{
		case "jan":
		case "mar":
		case "may":
		case "jul":
		case "aug":
		case "oct":
		case "dec":System.out.println("31 days");
		break;
		case "apr":
		case "jun":
		case "sep":
		case "nov":System.out.println("30 days");
		break;
		case "feb":
			if(year%4==0 && year%100!=0 || year%400==0)
				System.out.println("29 days");
			else
				System.out.println("28 days");
				
		}
		
		
		
	}

}
