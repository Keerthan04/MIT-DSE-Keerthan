package week9;
import java.util.Scanner;
import java.lang.String;
interface Shape
{
	double pi=3.14;
	void area();
	void perimeter();
}
class Circle implements Shape
{
	Scanner sc=new Scanner(System.in);
	double radius;double a,p;
	Circle()
	{
		try
		{
			System.out.println("Please enter the radius");
			radius=sc.nextDouble();
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}
	public void area()
	{
		a=pi*radius*radius;
		System.out.println("The area of the circle is: "+a);
	}
	public void perimeter()
	{
		p=2*pi*radius;
		System.out.println("The perimeter of the circle is: "+p);
	}
}
class Rectangle implements Shape
{
	Scanner sc=new Scanner(System.in);
	double length,breadth;double a,p;
	Rectangle()
	{
		try
		{
			System.out.println("Please enter the length");
			length=sc.nextDouble();
			System.out.println("Please enter the breadth");
			breadth=sc.nextDouble();
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}
	public void area()
	{
		a=length*breadth;
		System.out.println("The area of the circle is: "+a);
	}
	public void perimeter()
	{
		p=2*(length+breadth);
		System.out.println("The perimeter of the circle is: "+p);
	}
}
public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the choice of shape");
		System.out.println("1.Circle");
		System.out.println("2.Rectangle");
		int n=sc.nextInt();
		if(n==1)
		{
			Circle ob=new Circle();
			ob.area();
			ob.perimeter();
		}
		if(n==2)
		{
			Rectangle ob=new Rectangle();
			ob.area();
			ob.perimeter();
		}

	}

}
