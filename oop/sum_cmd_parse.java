import java.util.*;

public class sum_cmd_parse
{
	public static void main(String args[])
	{
		int c, d;
		System.out.println("enter string 1 : "+args[0]);
		System.out.println("enter string 2 : "+args[1]);
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);

		System.out.println("your sum = "+(a+b));
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter no 1: ");
		c=s.nextInt();
		System.out.println("enter no 2: ");
		d=s.nextInt();
		System.out.println("your scanner sum is : "+ (c+d));
	}
}