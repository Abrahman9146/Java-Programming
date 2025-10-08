public class NullException
{
	public static void main(String args[])
	{
		String name="Abdurrahman";
		System.out.println(name.length());
		String a = null;
		System.out.println(a.charAt(0));
		for(int i=0;i<name.length();i++)
		{
			System.out.println(name.charAt(i));
		}

	}
}