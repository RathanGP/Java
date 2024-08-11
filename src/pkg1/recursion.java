package pkg1;

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res=sum(10);
		System.out.println(res);
	}
	public static int sum(int a)
	{
		if(a>0)
		{
			return a+sum(a-1);
			
		}
		else
			return 0;
	}

}
