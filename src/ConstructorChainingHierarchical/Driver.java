package ConstructorChainingHierarchical;

public class Driver 
{
	public static void main(String[] args) 
	{
		Shirt shirt=new Shirt("Show Off", "Banglore", "Puma", "White", 750);
		shirt.shopInfo();
		shirt.shirtInfo();
		
		System.out.println("-----------------");
		
		Pant pant=new Pant("Show Off","Banglore", "US polo", "Black", 1200);
		pant.shopInfo();
		pant.pantInfo();
	}

}
