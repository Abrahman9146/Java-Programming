public class Student2
{
	int rollno;
	String name;
public Student2(int rn,String n)	//Student() is parameterized constructor
{
	rollno=rn;
	name=n;
	System.out.println("Student Information");
	System.out.println("Student Roll No: "+rollno);
	System.out.println("Student Name: "+name);

}
public static void main(String args[])
{
	Student2 s=new Student2(91,"AB");		
	
}
}