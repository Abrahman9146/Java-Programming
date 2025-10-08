import java.util.*;
public class ThrowsExample
{
	public void checkAge(int age) throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("You are not allowed to vote.");
		}
		else
		{
			System.out.println("Valid user");
		}
		System.out.println("Welcome to voting management system.");
	}
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		ThrowsExample a = new ThrowsExample();
		a.checkAge(age);
	}
}

