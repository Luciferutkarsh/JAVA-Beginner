// program to display variable overriding in java
class A
{
	int a=10;
}
class B extends A
{
	int a=20;
	void disp()
	{
		System.out.println(a);//20
		System.out.println(super.a);//10
	}
}
class C
{
	public static void main(String a[])
	{
		B ob=new B();
		ob.disp();
	}
}
// In order to access the parent class variable we need the help of super keyword