class Constructor1
{
int a, b;
Constructor1() //constructor
{
a=10;b=20;
}

void Display()
{
System.out.println(a+" "+b);
}
}

class Main_Num
{
public static void main(String args[])
{
Constructor1 ob=new Constructor1();
ob.Display();
}
}