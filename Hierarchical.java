class College
{
	void clgname()
	{
		System.out.println("Sanjivani College of Engineering.");
	}
}
class Dept1 extends College
{
	void dept1info()
	{
		System.out.println("This is IT department.");
	}
}
class Dept2 extends College
{
	void dept2info()
	{
		System.out.println("This is Computer department.");
	}
}
public class Hierarchical
{
	public static void main(String args[])
	{
		Dept1 d1 = new Dept1();
		d1.clgname();
		d1.dept1info();
		System.out.println("---------");
		Dept2 d2 = new Dept2();
		d2.clgname();
		d2.dept2info();
	}
}
