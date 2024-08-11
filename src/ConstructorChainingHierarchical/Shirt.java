package ConstructorChainingHierarchical;

public class Shirt extends Shop 
{
	String brand;
	String color;
	int price;
	
	public Shirt(String name,String location,String brand,String color,int price)
	{
		super(name,location);
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	public void shirtInfo()
	{
		System.out.println("Shirt brand:"+brand);
		System.out.println("Shirt color:"+color);
		System.out.println("Shirt price:"+price);
	}


}
