package pkg1;

public class Driverr {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Product p=new Mobile();
		if(p instanceof Mobile) 
		{
			Mobile m=(Mobile)p;
			System.out.println("Ram:"+m.ram);
			System.out.println("Ram:"+m.rom);
			m.call();
		}
		else
		{
			Laptop l=(Laptop)p;
			System.out.println("Ram:"+l.ram);
			System.out.println("Ram:"+l.rom);
			l.code();	
		}
	}

}
