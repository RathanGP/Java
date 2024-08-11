package overriding;

public class product 
{
	String brand;
	double price ;
	 product(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
	}
	 void display()
	 {
		 System.out.println("brand:"+brand);
		 System.out.println("price:"+price);
	 }
	

}
