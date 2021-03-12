package Q5;

import java.util.Scanner;

public class RepeatStr {

	public static void main(String[] args) {
	Scanner scan1=new Scanner(System.in);
	System.out.println("Enter the input String");
	String str=scan1.next();
	System.out.println("Enter the integer n");
	int n=scan1.nextInt();
	
	String result;
	result=str.substring(str.length()-n,str.length());
	result=result.repeat(n);
	System.out.println("The resulting string is "+result);
	}

}
