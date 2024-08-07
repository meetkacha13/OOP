//multithreading program 1

import java.util.*;

class runnabledemo implements Runnable
{
	Thread t;

	runnabledemo()
	{
		t = new Thread(this,"MyThread");
		t.start();
	}

	public void run()
	{
		try
		{
			for (int i=1;i<=5 ;i++ ) 
			{
				System.out.println("good morning");
				t.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("exception = "+e.toString());
		}
	}
}

class multithreading
{
	public static void main(String[] args) 		
	{
		new runnabledemo();

		try
		{
			for (int i=1;i<=5 ;i++ ) 
			{
				System.out.println("good night");
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			System.out.println("exception = "+e.toString());
		}
	}
}