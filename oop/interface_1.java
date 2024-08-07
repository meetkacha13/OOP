import java.util.*;

interface A
{
	static int a = 5;
	public void methodA();
}

interface A1 extends A
{
	public void methodA1();
}

interface A2 extends A
{
	public void methodA2();
}

interface P1
{
	public void methodP1();
}

interface P2
{
	public void methodP2();
}

interface A12 extends A1 , A2
{
	public void methodA12();
}

class B implements A12
{
	public void methodA()
	{
		System.out.println("interface A : "+a);
	}

	public void methodA1()
	{
		System.out.println("interface A1 : "+a);
	}

	public void methodA2()
	{
		System.out.println("interface A2 : "+a);
	}

	public void methodP1()
	{
		System.out.println("interface P1 : "+a);
	}

	public void methodP2()
	{
		System.out.println("interface P2 : "+a);
	}

	public void methodA12()
	{
		System.out.println("interface A12 : "+a);
	}
}

public class interface_1
{
	public static void main(String[] args) 
	{
		B b = new B();
		b.methodA();
		b.methodA1();
		b.methodA2();
		b.methodP1();
		b.methodP2();
		b.methodA12();
	}
}