package pkg1;

public class driver {
	public static void main(String[] args) {
		superclass s1=new superclass();
		System.out.println(s1.a);
		System.out.println(s1.b);
		System.out.println("---------------");
		
		subclass s2=new subclass();
		System.out.println(s2.a);
		System.out.println(s2.b);
		System.out.println(s2.c);
		System.out.println(s2.d);
		
	}
}
