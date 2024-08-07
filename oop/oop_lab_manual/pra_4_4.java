/*to find length of string and print second half of the 
string*/

import java.util.*;

public class pra_4_4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		
		int len = str.length();
		int halfLen = len / 2;
		
		System.out.printf("Length of the string: %d\n", len);
		System.out.printf("Second half of the string: %s\n", str.substring(halfLen));
	}
}