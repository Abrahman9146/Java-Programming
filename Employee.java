public class Employee
{
	int Empid;
	String name;
	int salary;
public Employee(int id,String n,int sal)
{
	Empid=id;
	name=n;
	salary=sal;
	System.out.println("Employee Information");
	System.out.println("Employee id: "+Empid);
	System.out.println("Employee Name: "+name);
	System.out.println("Employee salary: "+salary);

}
public Employee(Employee obj)
{
	Empid=obj.Empid;
	name=obj.n;
	salary=obj.sal;
	System.out.println("Employee Information");
	System.out.println("Employee id: "+Empid);
	System.out.println("Employee Name: "+name);
	System.out.println("Employee salary: "+salary);

}

public static void main(String args[])
{
	
	Employee e=new Employee(91,"AB",450000);
	Employee e1=new Employee(e);			//copying of constructor
	
}
}