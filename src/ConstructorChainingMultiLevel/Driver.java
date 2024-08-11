package ConstructorChainingMultiLevel;

public class Driver 
{
	public static void main(String[] args) 
	{
		Son son=new Son("Krishna", 90, 4,1, 0);
		son.grandfatherInfo();
		System.out.println("--------------");
		son.fatherInfo();
		System.out.println("--------------");
		son.sonInfo();
		
	}
	
	

}
