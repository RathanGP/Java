package ConstructorChainingMultiLevel;

public class GrandFather 
{
	String name;
	int age;
	
	public GrandFather(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void grandfatherInfo()
	{
		System.out.println("GrandFather Name:"+name);
		System.out.println("GrandFather age:"+age);
		
	}

}
