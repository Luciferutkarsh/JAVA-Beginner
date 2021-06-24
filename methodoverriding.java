// Method overriding 
class Parent
{
	int a=15,b=30;
	void display()
	{
		int c=a+b;
		System.out.println("The sum is "+c);
	}
}
class child extends Parent
{
	void display()
	{
		super.display(); //calling the method display from parent class
		int d=a*b;
		System.out.println("The product is "+d);		
	}
}
class M_Override
{
	public static void main(String a[])
	{
		child ob=new child();
		ob.display();
	}
}