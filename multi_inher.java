class A
{
int a=50;
}
class B extends A // B is the child class of A
{
	int b=a*a;
}
class C extends B  //C is the grandchild of class A
{
void display()
{
System.out.println("The value of a="+a);
System.out.println("The value of b= "+b);
}
}
class Multi_Inherit
{
	public static void main(String args[])
	{
		C ob=new C(); //creating object of class C to
					
					ob.display();
	}
}
