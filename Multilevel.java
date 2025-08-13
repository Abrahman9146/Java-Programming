class Student
{
	int roll=91;
	String name="AB";
	void display()
	{
		System.out.println("Roll no is : "+roll);
		System.out.println("Name is : "+name);
	}
}
class Sem1 extends Student
{
	String Sub1="Chemistry";
	String Sub2="C";
	String Sub3="ITE";
	void subjects1()
	{
		System.out.println("Semester 1");
		System.out.println(Sub1+" "+Sub2+" "+Sub3);
	}
}
class Sem2 extends Sem1
{
	String Sub1="Physics";			
	String Sub2="Python";
	String Sub3="DSA";
	void subjects2()
	{
		System.out.println("Semester 2");
		System.out.println(Sub1+" "+Sub2+" "+Sub3);
	}
}

public class Multilevel
{
	public static void main(String args[])
	{
		System.out.println("---------");
		Student s = new Student();
		s.display();
		System.out.println("---------");
		Sem1 m =new Sem1();
		m.display();
		m.subjects1();
		System.out.println("---------");
		Sem2 n =new Sem2();
		n.display();
		n.subjects1();
		n.subjects2();
		System.out.println("---------");

	}
}	
