package constructor;

public class CopyConstructor 
{
	int id;
	String name;
	CopyConstructor copy;
	
	public CopyConstructor(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	public CopyConstructor(CopyConstructor copy)
	{
		this.copy=copy;
	}
	
	@Override
	public String toString() {
		return "CopyConstructor [id=" + id + ", name=" + name + ", copy=" + copy + "]";
	}

	public static void main(String[] args) 
	{
		CopyConstructor c1=new CopyConstructor(101,"xyz");
		CopyConstructor c2=new CopyConstructor(c1);
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
