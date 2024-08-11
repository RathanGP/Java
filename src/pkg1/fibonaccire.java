package pkg1;

public class fibonaccire {
	static int a=0,b=1,c,i,count=10;
	static void fabio(int count) 
	{
		if(count>0)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			fabio(count-1);
			
		}
	}
	
	public static void main(String[] args)
	{
		System.out.print(a+" "+b);
		fabio(count-2);
	}

}
