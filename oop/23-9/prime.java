import java.util.*;
import java.io.*;

public class prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt() ,count=0;

		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("number is not prime");
		}
		else
		{
			System.out.println("number is prime");
		}
	}
}