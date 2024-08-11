package ConstructorChainingMultiLevel;

public class Father extends GrandFather
{
	int property;
	int children;
	
	public Father(String name,int age,int property,int children)
	{
		super(name,age);
		this.property=property;
		this.children=children;
	}
	public void fatherInfo()
	{
		System.out.println("Father property:"+property);
		System.out.println("Father Childern:"+children);
		
	}

}
