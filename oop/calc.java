import java.util.*;

public class calc
{
	public static void main(String[] args) 
	{
		int a, b, x;
		double ans;
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter no 1: ");
		a=s.nextInt();
		System.out.println("enter no 2: ");
		b=s.nextInt();

		System.out.println("press 1 for addition");
		System.out.println("press 2 for subtraction");
		System.out.println("press 3 for multiplication");
		System.out.println("press 4 for division");

		System.out.println("enter no : ");
		x=s.nextInt();

		switch(x)
		{
			case 1:
				System.out.println("sum = "+(a+b));
				break;

			case 2:
				System.out.println("sub = "+(a-b));
				break;

			case 3:
				System.out.println("mul = "+(a*b));
				break;

			case 4:
				System.out.println("div = "+(a/b));
				break;

			default:
				System.out.println("invalid no");
				break;
		}
	}
}
