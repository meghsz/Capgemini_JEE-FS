package Q4;
/*
 *  Given two strings, a and b, create a bigger string made of the first char of a, the first char 
of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of 
the result.
mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
public String mixString(String a, String b) {
 
}*/

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		
		System.out.println("enter string a and b");
		//String a="abc";
		//String b="xyz";
		Scanner scan1=new Scanner(System.in);
		String a=scan1.next();
		String b=scan1.next();
		String n="";
		int count=0;
		if(a.length()<=b.length())
		{	 count = a.length();
		for(int i=0;i<count;i++)
		{
			n+=a.charAt(i);
			n+=b.charAt(i);	
		}
		n+=b.substring(count,b.length());
		System.out.println(n);
		}
		else
		{
			 count = b.length();
				for(int i=0;i<count;i++)
				{
					n+=a.charAt(i);
					n+=b.charAt(i);	
				}
				n+=a.substring(count,a.length());
				System.out.println(n);
				}
		}
			
		
	}
