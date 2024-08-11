package ConstructorChainingSingleLevel;

public class Car extends Vehicle
{
	String model;
	String color;
	int price;

	public Car(String brand,int wheels,String model,String color,int price)
	{
		super(brand,wheels);
		this.model=model;
		this.color=color;
		this.price=price;
	}
	public void carInfo()
	{
		System.out.println("Car model:"+model);
		System.out.println("Car color:"+color);
		System.out.println("Car price:"+price);
	}
}
