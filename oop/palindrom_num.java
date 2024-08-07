import java.util.*;

public class palindrom_num
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		int rem=0, rev=0;

		//while loop 
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
	}
}