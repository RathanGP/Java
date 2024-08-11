package ConstructorChainingHierarchical;

public class Pant  extends Shop 
{
	String brand;
	String color;
	int price;
	
	public Pant(String name,String location,String brand,String color,int price)
	{
		super(name,location);
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	public void pantInfo()
	{
		System.out.println("Pant brand:"+brand);
		System.out.println("Pant color:"+color);
		System.out.println("Pant price:"+price);
	}


}
