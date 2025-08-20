public class Overloading1
{
	public void add()
	{
		int a=9,b=4;
		int c=a+b;
		System.out.println("Sum is: "+c);
	}
	public int add(int a, int b)
	{
		return a+b;
	}
	public float add(float a, float b)
	{
		return a+b;
	}
	public double add(double a, double b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		Overloading1 o = new Overloading1();
		o.add();
		System.out.println("Sum of integers is: "+o.add(9,5));
		System.out.println("Sum of floats is: "+o.add(56.5f,8.9f));
		System.out.println("Sum of doubles is: "+o.add(2.6,7.1));
	}
}