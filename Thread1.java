public class Thread1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String args[])
	{
		Thread1 a = new Thread1();
		Thread t = new Thread(a);	// thread class 
		t.start();
	}
}