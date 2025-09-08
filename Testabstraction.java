abstract class BankAccount
{
	double amount=0;
	public void getDetails(String name,int phone)
	{
		System.out.println("Name is : "+name+" Phone no. is : "+phone);
	}
	public abstract void deposite();
	public abstract void withdrawal();
	public abstract void getBalance();
}
class Saving extends BankAccount
{
	public void deposite(double d)
	{
		System.out.println(d+" Deposited");
		amount+=d;
	}
	public void withdrawal(double w)
	{
		System.out.println(w+" withdrawal");
		amount-=w;
	}
	public void getBalance()
	{
		System.out.println("Total balance is : "+amount);
	}
}
public class Testabstraction
{
	public static void main(String args[])
	{
		Saving s = new Saving();
		s.getDetails("Ab",92);
		s.deposite(450000);
		s.getBalance();
	}
}



