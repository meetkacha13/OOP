import java.util.*;
public class rec
{
	public static int fac(int a)
	{
		if (a>0)
		{
			return a*fac(a-1);
		}
		else
		{
			return 1;
		}	
	}
	public static void main(String[] args)
    {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=fac(num);
		System.out.println(i);
	}
}