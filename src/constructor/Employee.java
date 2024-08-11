package constructor;

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
			this(EmployeeId);
			System.out.println(EmployeeId);
		}
		public Employee(int EmployeeId)
		{
			System.out.println("Constructor chaining for Employee Details...!");
		}
		
		public static void main(String[] args) 
		{
			new Employee(101,"Rathan",55000.00,"Java Developer");
			
		}

}


