//student division using if-else ladder
import java.util.*;

public class pra_3_1
{
	public static void main(String[] args) 
	{
		int s1, s2, s3, s4, s5;
		int per;
		Scanner s= new Scanner(System.in);

		System.out.println("enter subject 1 marks : ");
		s1 = s.nextInt();
		System.out.println("enter subject 2 marks : ");
		s2 = s.nextInt();
		System.out.println("enter subject 3 marks : ");
		s3 = s.nextInt();
		System.out.println("enter subject 4 marks : ");
		s4 = s.nextInt();
		System.out.println("enter subject 5 marks : ");
		s5 = s.nextInt();

		per = (s1+s2+s3+s4+s5)*100/500;
		System.out.println("percentage = "+per);

		if (per >= 60) 
		{
			System.out.println("first division");
		}
		else if (per >= 50 & per <= 59)
		{
			System.out.println("second division");
		}
		else if (per >= 40 & per <= 49)
		{
			System.out.println("third division");
		}
		else if (per < 40) 
		{
			System.out.println("fail");
		}
	}
}