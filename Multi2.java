public class Multi2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<3;i++)
		System.out.println("Thread "+Thread.currentThread().getName()+" is running");
	}
	public static void main(String args[])
	{
		Multi2 a = new Multi2();
		Thread t1 = new Thread(a,"AB");	// thread class
		Thread t2 = new Thread(a,"ED");
		Thread t3 = new Thread(a,"MD");
		t1.start();
		t2.start();
		t3.start();
	}
}