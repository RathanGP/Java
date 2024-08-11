package pkg1;

public class prime {
	public static void main(String[] args)
	{
		System.out.println(checkprimeno(20));
		
	}

		
	public static String checkprimeno(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return "not prime";
			}
			
		}
		return "prime";
	}
}