package Q6;

import java.util.Scanner;

public class Repeatstrq6 {

	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter the input String");
		String str=scan1.next();
		System.out.println("Enter the integer n initial value");
		int n=scan1.nextInt();
		
		String result ="";
		while(n!=0)
		{
			result+=str.substring(0,n);
			n-=1;
		}
		
		System.out.println("The resulting string is "+result);
		
	}

}
