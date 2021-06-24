// More than one Child is derived from the parent class

class A
{
int a=10, b=15, c=20;
}
class B extends A
{
	void calc()
	{
		int x=a+b+c;
		System.out.println("The sum is ="+x);
	}
}
class C extends A
{
	void calc1()
	{
		int y=a*b*c;
		System.out.println("The product is ="+y);
	}
}
class HR_Inherit
{
	public static void main(String args[])
	{
	B ob=new B();
	ob.calc();
	C ob1=new C();
	ob1.calc1();
	}
}