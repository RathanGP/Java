package pkg1;


public class fibonacci {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1,b=1,c,i,count=20;
		System.out.print(a+" "+b);
		for(i=2;i<count;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
	}

}

