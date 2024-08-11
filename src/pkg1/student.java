package pkg1;

import java.util.Scanner;

public class student {
	int id;
	int number;
	String name;
	static String college;
	
	public student(int id,int number,String name,String  college) 
	{
		this.id=id;
		this.number=number;
		this.name=name;
		this.college=college;
	}
	public void display()
	{
		System.out.println("Enter the student id : "+id);
		System.out.println("Enter the student number : "+number);
		System.out.println("Enter the student name : "+name);
		System.out.println("Enter the student college : "+college);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
		System.out.println("Enter the student id :");
		int id=sc.nextInt();
		System.out.println("Enter the student number :");
		int number=sc.nextInt();
		System.out.println("Enter the student name :");
		String name=sc.next();
		System.out.println("Enter the student college :");
		String college=sc.next();
				
		student s=new student(id,number,name,college);
		s.display();
		}

	}

}
