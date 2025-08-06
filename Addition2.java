import java.util.*;
public class Addition2
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements number: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		System.out.print("Sum is:"+sum);
	}


}