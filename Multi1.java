class Multi1 extends Thread
{
public void run() {
	for(int i=0;i<3;i++)
	{
		System.out.println("Task1 -> count: "+i);
	}	
}
public static void main(String args[]) {
		Multi1 t1 = new Multi1();
		Multi1 t2 = new Multi1();
		Multi1 t3 = new Multi1();
		

		t1.start();
		t2.start();
		t3.start();
}
}