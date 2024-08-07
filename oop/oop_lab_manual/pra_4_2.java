/*creates and initializes a four integer element array. 
Calculate and display the average of its values.*/

import java.util.*;

public class pra_4_2
{
	public static void main(String[] args) 
	{
		int ar[]= new int[]{1,2,3,4};
		int sum=0;

		for (int i=0;i<ar.length;i++ ) 
		{
			sum = sum + ar[i];
		}

		double avg = sum / 4;

		System.out.println("average = "+avg);
		
	}
}