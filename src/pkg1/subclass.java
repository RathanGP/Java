package pkg1;

public class subclass extends superclass {
	int c=30;
	int d=40;

	public subclass() 
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
