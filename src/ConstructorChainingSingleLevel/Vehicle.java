package ConstructorChainingSingleLevel;

public class Vehicle 
{
	String brand;
	int wheels;
	
	public Vehicle(String brand,int wheels)
	{
		this.brand=brand;
		this.wheels=wheels;
	}
	public void vehicleInfo()
	{
		System.out.println("Vehicle brand:"+brand);
		System.out.println("Vehicle wheels:"+wheels);
	}

}
