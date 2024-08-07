import java.util.*;

class student
{
	int n, id_no, no_sub, sub_code[], sub_credits[], sub_grade[], spi;
	student(int id_no, int no_sub, int sub_code[], int sub_credits[], int sub_grade[])
	{
		this.id_no = id_no;
		this.no_sub = no_sub;
		this.sub_code = sub_code;
		this.sub_credits = sub_credits;
		this.sub_grade = sub_grade;
	}
	int calculateSPI()
	{
		int total_credits=0;
		int totalweight=0;

		for (int i=0;i<no_sub;i++) 
		{
			total_credits+=sub_credits[i];
			totalweight+=sub_grade[i]*sub_credits[i];
		}
		spi = totalweight / total_credits;
		return spi;
	}
}

class pra_6_1
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		//int n;
		
		//command line argument
		System.out.println("enter number of students : ");
		int n = Integer.parseInt(args[0]);
		student st[] = new student[n];

		for (int i=0;i<n;i++) 
		{
			System.out.println("enter id : ");
			int id_no = s.nextInt();

			System.out.println("enter no of subject : ");
			int no_sub = s.nextInt();			

			int[] code = new int[no_sub];
			int[] credit = new int[no_sub];
			int[] grade = new int[no_sub];

			for (int j=0;j<no_sub;j++) 
			{
				System.out.println("enter subject code : ");
				code[j] = s.nextInt();

				System.out.println("enter subject credit : ");
				credit[j] = s.nextInt();

				System.out.println("enter subject grade : ");
				grade[j] = s.nextInt();				
			}
			st[i] = new student(id_no, no_sub, code, credit, grade);
			int res = st[i].calculateSPI();
			System.out.println("spi = "+res);
		}
	}
}