import java.util.*;
public class ThrowExample
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age<18)
		{
			System.out.println("You are not allowed to vote.");
			throw new ArithmeticException("Invalid User");
		}
		else
		{
			System.out.println("Valid user");
		}
		System.out.println("Welcome to voting management system.");
	}
}

