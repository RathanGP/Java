package ConstructorChainingMultiLevel;

public class Son extends Father
{
	int siblings;
	
	public Son(String name,int age,int property,int children,int siblings)
	{
		super(name,age,property,children);;
		this.siblings=siblings;
	}
	public void sonInfo()
	{
		System.out.println("Siblings:"+siblings);
		
	}


}
