package ConstructorChainingHierarchical;

public class Shop 
{
	String name;
	String location;
	
	public Shop(String name,String location)
	{
		this.name=name;
		this.location=location;
	}
	public void shopInfo()
	{
		System.out.println("Shop name:"+name);
		System.out.println("Shop location:"+location);
	}

}
