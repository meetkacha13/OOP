/*Write a program to accept a line and check how many consonants and 
vowels are there in line*/

//not complete....error in 24th line

import java.util.*;
import java.io.*;

public class pra_4_1
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("enter string : ");
		String str = s.next();
		int v=0, c=0;
		str = str.toLowerCase();

		String[] vowel={"a","e","i","o","u"};

		for (int i=0;i<str.length() ;i++ ) 
		{
			if (str.charAt[i]==vowel) 
			{
				v++;
			}
			else
			{
				c++;
			}
		}
		System.out.println("Vowel = "+v);
		System.out.println("Consonant = "+c);
	}
}