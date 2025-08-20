public class Overloading2
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public int add(int a, int b, int c)
	{
		return a+b+c;
	}
	public int add(int a)
	{
		int b =10;
		return a+b;
	}
	public static void main(String args[])
	{
		Overloading2 o = new Overloading2();
		System.out.println("Sum of two (one is fixed to 10) integers is: "+o.add(8));
		System.out.println("Sum of two integers is: "+o.add(1,5));
		System.out.println("Sum of three integers is: "+o.add(2,5,7));
	}
}