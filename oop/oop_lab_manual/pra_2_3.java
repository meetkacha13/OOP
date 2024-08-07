//w.a.p to create basic calculator by getting 2 no and 1 string from user and apply operator given in a string on the given no

import java.util.*;

public class pra_2_3
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double ans=0;

		System.out.println("enter value 1 : ");
		double a = s.nextDouble();
		System.out.println("enter value 2 : ");
		double b = s.nextDouble();

		System.out.println("enter the operator ( + , - , * , / ) : ");
		String o = s.next();

		switch(o)
		{

			case "+":
				ans = a+b;
				break;

			case "-":
				ans = a-b;
				break;

			case "*":
				ans = a*b;
				break;

			case "/":
				ans = a/b;
				break;

			default:
				System.out.println("invalid input");
		}
		System.out.println(a + " " + o + " " + b + " = " + ans);
	}
}