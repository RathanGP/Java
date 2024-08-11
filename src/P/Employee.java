package P;

public class Employee 
{
	int EmployeeId;
	String EmployeeName;
	Double Sal;
	String EmployeeRole;
	
	public Employee(int EmployeeId,String EmployeeName,	Double Sal,String EmployeeRole)
	{
		this(EmployeeId,EmployeeName,EmployeeRole);
		System.out.println(EmployeeId+" "+EmployeeName+" "+EmployeeRole);
	}
	public Employee(int EmployeeId,String EmployeeName,String EmployeeRole)
	{
		this(EmployeeId,EmployeeName);
		System.out.println(EmployeeId+" "+EmployeeName);
	}
	public Employee(int EmployeeId,String EmployeeName)
	{
		this(EmployeeId);;
		System.out.println(EmployeeId);
	}
	public Employee(int EmployeeId)
	{
		System.out.println(EmployeeId);
	}
	public void display()
	{
		System.out.println(EmployeeId);
		System.out.println(EmployeeName);
		System.out.println(Sal);
		System.out.println(EmployeeRole);
	}
	public static void main(String[] args) 
	{
		Employee emp = new Employee(101,"Rathan",55000.00,"Java Developer");
		emp.display();
	}

}
