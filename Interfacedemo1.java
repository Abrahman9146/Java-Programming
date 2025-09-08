interface Sports
{
	void basketball();
}
interface Acadmics
{
	void performance();
}
class Student implements Sports, Acadmics
{
	public void basketball()
	{
		System.out.println("He likes to play basketball.");
	}
	public void performance()
	{
		System.out.println("He is good performer in all subjects.");
	}
}
public class Interfacedemo1
{
	public static void main(String args[])
	{
		Student s =new Student();
		s.basketball();
		s.performance();
	}
}
