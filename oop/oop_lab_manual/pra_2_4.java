// w.a.p to calculate the area of circul
import java.util.*;

public class pra_2_4
{
	public static void main(String[] args) 
	{
		float r;
		double pi=3.14;

		Scanner s = new Scanner(System.in);
		System.out.println("enter r : ");
		r = s.nextFloat();

		System.out.println("area of circul is : "+(pi*r*r));
	}
}