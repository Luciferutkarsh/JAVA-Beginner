
class nomatch extends Exception
{
	try
}

class Throweg
{
	void check(String s1)throws nomatch
	{
		char ch;
		ch=s1.charAt(0);
		if(ch=='M')
		{
			System.out.println("Valid iD");
		}
		else
		{
			throw new nomatch();
		}
	}
}
class user_exp
{
	public static void main(String args[])
	{
		Throweg ob=new Throweg();
		try
		{
			ob.check(args[0]);
		}
		catch(nomatch e)
		{
			System.out.println(" Invalid id");
		}
		finally
		{
			System.out.println("THANK- You");
		}
	}
}