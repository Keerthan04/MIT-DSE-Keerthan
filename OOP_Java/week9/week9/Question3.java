package week9;
import java.util.Scanner;
import java.lang.String;
interface Movable
{
	void move();
}
interface Resizable
{
	void resize();
}
class ShapeTransformer implements Movable,Resizable
{
	public void move()
	{
		System.out.println("The Shape was Successfully Moved");
	}
	public void resize()
	{
		System.out.println("The Shape was Successfully Resized");
	}
}
public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the choice of shape transform");
		System.out.println("1.Move");
		System.out.println("2.Resize");
		int n=sc.nextInt();
		ShapeTransformer ob=new ShapeTransformer();
		if(n==1)
		{
			ob.move();
		}
		if(n==2)
		{
			ob.resize();
		}

	}

}
