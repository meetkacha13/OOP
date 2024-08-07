//check the num is prime or not

import java.util.*;

public class pra_3_4
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("enter no : ");
		int a = s.nextInt(), count=0;

		for (int i=1;i<=a ;i++ ) 
		{
			if (a%i==0) 
			{
				count++;
			}
		}
		if (count==2) 
		{
			System.out.println("no is not prime");
		}
		else
		{
			System.out.println("no is prime");
		}
	}
}