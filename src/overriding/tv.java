package overriding;

public class tv extends product 
{
	int size;
	String type;
	 tv(String brand,double price,int size,String type)
	{
		 super(brand,price);
		this.size=size;
		this.type=type;
	}
	void display()
	{
		super.display();
		 System.out.println("size:"+size);
		 System.out.println("type:"+type);
	}

}
