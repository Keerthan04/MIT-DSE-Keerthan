package week7;
import java.util.Scanner;
import java.lang.String;
abstract class Area
{
	double side,base,height;
	abstract double area();
	abstract void getdet();
}
class square extends Area
{
	Scanner sc=new Scanner(System.in);
	void getdet()
	{
		System.out.println("please enter side of the square");
		side=sc.nextDouble();
	}
	double area()
	{
		double area=side*side;
		return area;
	}
}
class triangle extends Area
{
	Scanner sc=new Scanner(System.in);
	void getdet()
	{
		System.out.println("please enter base of the triangle");
		base=sc.nextDouble();
		System.out.println("please enter height of the triangle");
		height=sc.nextDouble();
	}
	double area()
	{
		double area=(0.5*base*height);
		return area;
	}
}
public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your choice to calculate area");
		System.out.println("1.Square");
		System.out.println("2.Triangle");
		int ch=sc.nextInt();
		if(ch==1)
		{
			Area ob=new square();
			ob.getdet();
			double a=ob.area();
			System.out.println("the Area of square is"+a);
		}
		if(ch==2)
		{
			Area ob=new triangle();
			ob.getdet();
			double a=ob.area();
			System.out.println("the Area of triangle is"+a);
		}
	}
}
