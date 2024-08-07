//given no or string is palindrom or not
//i can number's palindrom program...so this is number's program , not for string


//not complete
import java.util.*;

public class pra_3_2
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("enter number : ");
		int n = s.nextInt();

		int temp=n;
		int rev=0 , rem=0;

		//while loop 
		while (n!=0) 
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}

		if (temp==rev) 
		{
			System.out.println("number is palindrom");
		}
		else
		{
			System.out.println("number is not palindrom");
		}
	}
}