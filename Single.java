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
public class Single
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
	}
}	
