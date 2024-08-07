import java.util.*;



 
public class student
{
		String name;
		float spi; 
		int sem;

		void printstudent()
		{
			System.out.println("your name is : "+name);
			System.out.println("your spi is : "+spi);
			System.out.println("your sem is : "+sem);
		}

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		student s=new student();
		s.name=sc.nextLine();
		s.spi=sc.nextFloat(); 
		s.sem=sc.nextInt();
		
		s.printstudent();
	}
}