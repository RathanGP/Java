package part3;

import java.util.Scanner;

import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the char size");
    	int size=sc.nextInt();
    	System.out.println("Enter the characters");
        char[] ch=new char[size];
        
        for(int i=0;i<size;i++)
        {
        	ch[i]=sc.next().charAt(0);
        }
        System.out.println("char to be searched");
        char chh=sc.next().charAt(0);
        for(int i=0;i<size;i++)
        {
        	if(ch[i]==chh)
        	{
        		System.out.println("the index value of char:"+i);       		
        	}
        }
        
    }
}
