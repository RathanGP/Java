package P;

public class Demo
{
	public static void Login(String username,String password) throws MyException
	{
		if(username=="Rathan" & password=="rathan@123")
		{
			System.out.println("Login Successfull....");
		}
		else if(username=="Rathan" & password!="rathan@123")
		{
			throw new MyException("Incorrect password ....");
		}
		else if(username!="Rathan" & password=="rathan@123")
		{
			throw new MyException("Incorrect username ....");
		}
		else
			throw new MyException("failed....");
	}
	
	public static void main(String[] args) throws MyException 
	{
		try
		{
			Login("Rathan","rathan");
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured"+e);
		}
		
	}

}
