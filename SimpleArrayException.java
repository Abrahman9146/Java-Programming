public class SimpleArrayException
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5};
		try
		{
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You are trying to access 6th element and the size of array is 5");
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}

	}
}