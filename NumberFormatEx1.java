public class NumberFormatEx1
{
	public static void main(String args[])
	{
		String name = "Abdullah";
		try
		{
		int num = Integer.parseInt("Abdullah");
		System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("It is Number Format Exception."+e);
		}
	}
}