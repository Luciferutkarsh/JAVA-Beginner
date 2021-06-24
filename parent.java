class A // Parent Class
{
	int i=10;
}
class B extends A    // Inheriting a parent class
{
	void disp()
	{
		System.out.println(i);
	}
}
class si
{
	public static void main(String a[])
	{
		B ob=new B();
		ob.disp();
	}
}