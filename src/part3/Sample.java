package part3;

import java.util.HashSet;
import java.util.Set;

public class Sample {

	public static void main(String[] args) 
	{
		int[] arr1= {3,4,5,8,9,7,6,7};
		int[] arr2= {3,2,1,0,7,8,9};

		Set<Integer> set1=new HashSet<>();
		Set<Integer> equals=new HashSet<>();
		
		for(int num:arr1)
		{
			set1.add(num);
		}
		for(int num:arr2)
		{
			if(set1.contains(num))
			{
				equals.add(num);
				System.out.println(num);
			}

		}

		
	}
}
