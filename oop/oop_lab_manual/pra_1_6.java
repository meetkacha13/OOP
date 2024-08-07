//w.a.p to do sum of cmd argument passed as two double no

import java.util.*;

public class pra_1_6
{
	public static void main(String[] args) 
	{
		System.out.println("enter value 1 : "+args[0]);
		double a = Double.parseDouble(args[0]);

		System.out.println("enter value 2 : "+args[1]);
		double b = Double.parseDouble(args[1]);

		double sum = a + b;
		System.out.println("sum : "+sum);
	}
}