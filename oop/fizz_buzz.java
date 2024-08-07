//fizz buzz print 

//incomplete

class FizzBuzz implements Runnable
{
	Thread t;

	FizzBuzz()
	{
		t = new Thread(this,"MyThread");
		t.start();
	}

	public void run()
	{
		try
		{
			public void fizzbuzz()
			{
				System.out.println("fizzbuzz");
			}

			public void fizz()
			{
				System.out.println("fizz");
			}

			public void buzz()
			{
				System.out.println("buzz");
			}

			public void number(int n)
			{
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println("exception = "+e);
		}
	}
}

class fizz_buzz
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("enter number : ");
		int n = s.nextInt();

		new FizzBuzz();

		try
		{
			for (int i = 0;i<=n ;i++ ) 
			{
				if (i%3==0 && i%5==0) 
				{
					Thread.fizzbuzz();
				}
				else if(i%3==0)
				{
					Thread.fizz();
				}
				else if(i%5==0)
				{
					Thread.buzz();
				}
				else
				{
					Thread.number();
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("exception = "+e);
		}
	}
}