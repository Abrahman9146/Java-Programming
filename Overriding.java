class Father
{
	void display()
	{
		System.out.println("This is Parent.");
	}
}
class Son extends Father
{
	void display()
	{
		System.out.println("This is Child.");
	}
}
public class Overriding
{
	public static void main(String args[])
	{
		Son s = new Son();
		s.display();
	}
}