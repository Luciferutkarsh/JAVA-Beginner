// When a child class member overrides parent class memeber in child class
//then, in order to access the hidden parent class memeber we use super keyword.
class func_overload
{
	void disp()
	{
		System.out.printfln(" No Argument ");
	}
	void disp(int x)
	{
		System.out.println(x);
	}
	void disp(int x, int y)
	{
		System.out.println(x+" "+y);
	}
}
class m_overload
{
	public static void main(String a[])
	{
		func_overload ob=new function();
		ob.disp(50,60);
		ob.disp();
		ob.disp(90);
	}
}