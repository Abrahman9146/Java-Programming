public class Student
{
	int rollno;
	String name;
public static void main(String args[])
{
	Student s=new Student();		//Student() acts as default constructor
	System.out.println("Student Information");
	System.out.println("Student Roll No: "+s.rollno);	//use object name because roll no and name are non static var
	System.out.println("Student Name: "+s.name);
}
}