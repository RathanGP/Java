package part3;
public class ObjectClass
{
	String name;
	int id;
	long phno;
	public ObjectClass(String name,int id,long phno)
	{
		this.id=id;
		this.name=name;
		this.phno=phno;
	}
	public String toString()
	{
		return "name="+name + "id="+id + "phno="+phno;
	}
	public boolean equals(Object o)
	{
		ObjectClass obj=(ObjectClass)o;
		return name==obj.name || id==obj.id || phno==obj.phno;
	}
	public int hashcode()
	{
		return 999;
	}
	public static void main(String args[])
	{
		ObjectClass obj1=new ObjectClass("Rathan",12,657546777);
		ObjectClass obj2=new ObjectClass("Sam",456,987654781);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.hashcode());
		System.out.println(obj1.toString());
		obj1.toString();
	}
}

