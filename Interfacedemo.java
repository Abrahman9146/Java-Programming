interface Brand
{
	void show();
}
interface Model
{
	void display();
}
class Car implements Brand, Model
{
	public void show()
	{
		System.out.println("Brand is Mercedes.");
	}
	public void display()
	{
		System.out.println("Model is AMG GT 63.");
	}
}
public class Interfacedemo
{
	public static void main(String args[])
	{
		Car c =new Car();
		c.show();
		c.display();
	}
}
