package pkg1;

public class program3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String binary[]=
			{
					"0000","0001","0010","0011","0100",
					"0101","0110","0111","1000","1001",
					"1010","1011","1100","1101","1110","1111",
			};
		int a=5;
		int b=6;
		int c=a^b;
		int d=a|b;
		int e=a&b;
		int f=(~a&b)|(a&~b);
		System.out.println(binary[c]);
		System.out.println(binary[d]);
		System.out.println(binary[e]);
		System.out.println(binary[f]);
	}

}
