public class Student1
{
	int rollno;
	String name;
public Student1()	//Student() is default constructor
{
	rollno=91;
	name="Abdullah";
	//System.out.println("Student Information");
	//System.out.println("Student Roll No: "+rollno);
	//System.out.println("Student Name: "+name);

}
public static void main(String args[])
{
	Student1 s=new Student1();		
	System.out.println("Student Information");
	System.out.println("Student Roll No: "+s.rollno);
	System.out.println("Student Name: "+s.name);
}
}