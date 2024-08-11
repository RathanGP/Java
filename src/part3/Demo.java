package part3;

public class Demo 
{
	public static void login(String user,String password) throws MyException
	{
		if(user=="root" && password=="root@123")
		{
			System.out.println("login successfull");
		}
		else
			throw new MyException("Incorrect username and password");
	}
	
	public static void main(String[] args) throws MyException
	{
		try
		{
			login("root","root@123");
		}
		catch(Exception e)
		{
			System.out.println("Exception occcured"+e);
		}
	}

}
