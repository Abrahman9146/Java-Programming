import java.util.*;
public class Student3
{
	int rollno;
	String name;
public Student3(int rn,String n)	//Student() is parameterized constructor
{
	rollno=rn;
	name=n;
	System.out.println("Student Information");
	System.out.println("Student Roll No: "+rollno);
	System.out.println("Student Name: "+name);

}
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Roll No.: ");
	int roll = sc.nextInt();
	System.out.println("Enter Name.: ");
	String n = sc.next();
	
	Student3 s=new Student3(roll,n);		
	
}
}