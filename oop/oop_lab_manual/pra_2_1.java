//w.a.p to get 2 no from user and print sum of 2 no using cmd and scanner class
import java.util.*;

public class pra_2_1
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter command line argument");

		System.out.println("enter value 1 : "+args[0]);
		System.out.println("enter value 2 : "+args[1]);

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println("sum of command line argument : "+(a+b));

		System.out.println("enter scanner class argument");

		System.out.println("enter value 1 : ");
		int x = s.nextInt();
		System.out.println("enter value 2 : ");
		int y = s.nextInt();

		System.out.println("sum of scanner class : "+(x+y));
	}
}