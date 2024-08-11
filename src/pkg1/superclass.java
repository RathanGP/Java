package pkg1;

public class superclass {
	int a=10;
	int b=20;
	
	public superclass() 
	{
		System.out.println("constructor");
	}
	

	static
	{
		System.out.println("static block");
	}

	{
		System.out.println("non-static block");
	}
}
