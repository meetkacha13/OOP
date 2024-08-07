/*to print given array in reverse order*/

import java.util.*;

public class pra_4_3
{
	public static void main(String[] args) 
	{
		int arr[] = new int[]{1,2,3,4,5};
		int rev[] = new int[arr.length];

		//store reverse element
		for (int i=0;i<arr.length ;i++ ) 
		{
			rev[arr.length-1-i]=arr[i];
		}

		//for print reverse array
		for (int i=0;i<rev.length ;i++ ) 
		{
			System.out.println("index "+i+" = "+rev[i]);
		}
	}
}