//producer and consumer program 
import java.util.*;

class producer
{
	static int b;
	void put(int a)
	{
		b=a;
	}
}

class consumer extends producer
{
	void get()
	{
		System.out.println("value of b = "+b);
	}
}

class pro_con
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("enter value : ");
		int a = s.nextInt();

		producer p = new producer();
		consumer c = new consumer();

		p.put(a);
		c.get();
	}
}