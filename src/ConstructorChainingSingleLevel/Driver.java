 package ConstructorChainingSingleLevel;

public class Driver 
{
	public static void main(String[] args) 
	{
		Car car=new Car("BMW",4,"x6","Black",40000000);
		car.vehicleInfo();
		car.carInfo();
		
	}

}
