import java.util.Scanner;
class calculater01
{
	public static void add()
	{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the first value");
	int num1=s.nextInt();
	System.out.println("Enter the second value");
	int num2=s.nextInt();
	System.out.println("add is"+(num1+num2));
	}
 	public static void sub()
	{
		Scanner s=new Scanner(System.in);
	System.out.println("Enter the first value");
	int num1=s.nextInt();
	System.out.println("Enter the second value");
	int num2=s.nextInt();
	System.out.println("sub is"+(num1-num2));
	}
	public static void mul()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the first value");
	int num1=s.nextInt();
	System.out.println("Enter the second value");
	int num2=s.nextInt();
	System.out.println("mul is"+(num1*num2));
	}
	public static void div()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the first value");
	int num1=s.nextInt();
	System.out.println("Enter the second value");
	int num2=s.nextInt();
	System.out.println("div is"+(num1/num2));
	}
	public static void main(String[] args)
{


add();
sub();
div();
mul();
}
}
	












