import java.util.*;

public class max
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter value 1 : ");
		int a=s.nextInt();

		System.out.println("enter value 2 : ");
		int b=s.nextInt();

		System.out.println("enter value 3 : ");
		int c=s.nextInt();

		if(a>b)
		{
			if (a>c) 
			{
				System.out.println("a is max");	
			}
			else
			{
				System.out.println("c is max");
			}
		}
		else if(b>a)
		{
			if(b>c)
			{
				System.out.println("b is max");
			}
			else
			{
				System.out.println("c is max");
			}
		}	
	}
}