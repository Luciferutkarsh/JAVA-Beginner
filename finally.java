// program to display use of FinallyBlock
class try_catch
{
	public static void main(String args[])
	{
			int x=12;
			int y=0;
		try
		{
			int z=x/y;
			System.out.println("\n The result is "+z);
		}
		catch(Exception e)
		{
			System.out.println("Division by zero not possible ");
		}
		finally
		{
			System.out.println("THANK-YOU ");
		}
	}
}