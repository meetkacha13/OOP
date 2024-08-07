// convert fahrenheit to celsius (formula : c=f-32*5/9)
import java.util.*;

public class pra_2_5
{
	public static void main(String[] args) 
	{
		float f;

		Scanner s = new Scanner(System.in);
		System.out.println("enter fahrenheit : ");
		f = s.nextFloat();

		System.out.println("celsius : "+(f-32*5/9));
	}
}