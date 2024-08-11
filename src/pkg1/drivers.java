package pkg1;

public class drivers {

	public static void main(String[] args) {
	 fruit f = new fruit();
	  if (f instanceof ootyapple)
	 {
		 apple a1 = (apple)f;
		 System.out.println(a1.type);
	 }

	  else if(f instanceof apple) 
	 {
		 apple a =(apple)f;
		 System.out.println(a.taste);
		 
	 }
	 
		 else
	 {
		 
		 System.out.println(f.taste);
	 }
	} 
}


