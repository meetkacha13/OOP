//find maximum no from given 3 no

import java.util.*;

public class pra_3_3
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("enter no 1 : ");
		double a1 = s.nextInt();

		System.out.println("enter no 2 : ");
		double a2 = s.nextInt();

		System.out.println("enter no 3 : ");
		double a3 = s.nextInt();

		if (a1>a2) 
		{
			if (a1>a3) 
			{
				System.out.println(a1+" is max");
			}
			else
			{
				System.out.println(a3+" is max");
			}
		}
		else if (a2>a1) 
		{
			if (a2>a3) 
			{
				System.out.println(a2+" is max");
			}
			else
			{
				System.out.println(a3+" is max");
			}
		}
	}
}