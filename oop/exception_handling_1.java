//exception handling
import java.util.*;

class exception_handling_1
{
	public static void main(String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int ans = 1;

		try
		{
			sum = x*y;
			System.out.println("answer = "+ans);
		}
		catch(Exception e)
		{
			System.out.println("exception = "+e);
		}
	}
}