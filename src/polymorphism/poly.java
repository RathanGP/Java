package polymorphism;

public class poly {

	public static void login(String us,String psw )
	{
		System.out.println("logi n throught us and psw");
	}
	public static void login(long mob,int otp)
	{
		System.out.println("logi n throught mob and otp");
	}

	public static void login(long mob,String psw)
	{
		System.out.println("logi n throught mob and psw");
	}
}
