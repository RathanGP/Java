package constructor;

public class student {
	String name;
	long pno;
	static String skill;
	int exp;
	public student(String name,long pno) 
	{
		this.pno=pno;
		this.name=name;
	}
	public student(int exp,String name,long pno) 
	{
		this(name,pno,skill);
		this.exp=exp;
	}
	public student(String name,int exp,long pno) 
	{
		this(name,pno);
		this.exp=exp;									
	}
	public student(String name,long pno,String skill) 
	{
		this(name,pno);
		this.skill=skill;
	}
	public void display()
	{
		System.out.println("student experience:"+exp);
		System.out.println("student mobno:"+pno);
		System.out.println("student name:"+name);
		System.out.println("studnet skill:"+skill);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student("rathan",1234567890,"java");
		s.display();
		
	}
	
}