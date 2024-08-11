package pkg1;
import java.util.Scanner;

public class employee {
	
	int id;
	int mob;
	String ename;
	static String companyname;
	
	public employee(int id,int mob,String ename,String companyname) 
	{
		this.id=id;
		this.mob=mob;
		this.ename=ename;
		this.companyname=companyname;
		
	}
	public void display()
	{
		System.out.println("employee id:"+id);
		System.out.println("employee mob:"+mob);
		System.out.println("employee ename:"+ename);
		System.out.println("employee companyname:"+companyname);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			
	
		System.out.println("Enter the id:");
		int id=s.nextInt();
		System.out.println("Enter the mobile:");
		int mob=s.nextInt();
		System.out.println("Enter the ename:");
		String ename=s.next();
		
		System.out.println("Enter the companyname:");
		String companyname=s.next();
		employee e1=new employee(id,mob,ename,companyname);
		e1.display();
		}
		
		
		
		
		
		
	
	}

}
