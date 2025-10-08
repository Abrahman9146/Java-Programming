public class ArrayExceptions1
{
	public static void main(String args[])
	{
		int arr [] = {2,4,6,8,10,12,14,16,18,20};
		try
		{
		System.out.println(arr[10]);
		}
		catch (Exception e)
		{
			System.out.println("Array size is 10 and you are trying to access 11th element.");
		}
		System.out.println(arr[4]);
		System.out.println(arr[8]);
	}
}