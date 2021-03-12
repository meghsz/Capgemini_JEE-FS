package Q3;

import java.util.Scanner;
class NullPointerException extends Exception
{

	@Override
	public String toString() {
		return "Entry Missing";
	} 
}
class LengthException extends Exception{

	@Override
	public String toString() {
		return "name should be minimum 3 characters ";
	}
}
class Employee
{
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public boolean Validation() throws Exception
	{
		boolean check=false;
		if(firstName.length()==0 || lastName.length()==0) 
		{check=false;
			throw new NullPointerException();
		}
		else if(firstName.length()<3 || lastName.length()<3)
				{check=false;
			throw new LengthException();}
		else {
			check=true;
			return check;
		//System.out.println("valid name");
		}
}
}
public class q3 {

	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName=scan.nextLine();
		System.out.println("Enter Last Name");
		String lastName=scan.nextLine();
		boolean check=false;
		Employee obj=new Employee(firstName, lastName);
		//obj.Validation();
		try {
			check=obj.Validation();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		if(check) {
			System.out.println("Name Registered Successfully");
		}
}

}