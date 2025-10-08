public class NullException1
{
	public static void main(String args[])
	{
		String name="Abdullah";
		System.out.println(name.charAt(2));
		String a = null;
		try
		{
		System.out.println(a.charAt(0));
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer Exception.");
		}
		for(int i=0;i<name.length();i++)
		{
			System.out.println(name.charAt(i));
		}
	}
}