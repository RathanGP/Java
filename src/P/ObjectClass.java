package P;

public class ObjectClass 
{
	int id;
	String name;
	double sal;
	
	public ObjectClass(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public int hashcode()
	{
		return 23456;
	}
	public String toString()
	{
		return "id="+id +" "+  "name="+name +" "+ "sal="+sal;
	}
	public boolean equals(Object o)
	{
		ObjectClass obj=(ObjectClass)o;
		return obj.id==id || obj.name==name || obj.sal==sal;
	}
	public static void main(String[] args)
	{
		ObjectClass obj1=new ObjectClass(101,"Rathan",55000);
		ObjectClass obj2=new ObjectClass(102,"Ram",65000);
		System.out.println(obj1.hashcode());
		System.out.println(obj2.hashcode());
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.toString());;
		System.out.println(obj2.toString());
		
	}
}
