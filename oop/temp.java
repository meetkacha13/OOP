import java.util.*;

public class temp
{
	public static void main(String[] args) 
	{
		float a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter fahrenheit : ");
		a=s.nextFloat();

		System.out.println("celsius = "+ ((a-32)*5/9));	
	}
}