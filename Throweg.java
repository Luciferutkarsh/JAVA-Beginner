class Throweg
{
	void check(String s1)
	{
		char ch;
		ch=s1.charAt(0);
		if(ch=='A')
		{
			System.out.println("Valid ID ");
		}
		else
		{
			try
			{
				throw new ArithmeticException();      // Generating an exception
			}
			catch(ArithmeticException e)
			{
				System.out.println("Invalid iD");
			}
		}
	}
}
class TCT
{
	public static void main(String a[])
	{
		Throweg ob=new Throweg();
		ob.check("Atkarsh");
	}
}