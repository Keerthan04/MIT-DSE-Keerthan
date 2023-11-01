package exception;
import java.util.Scanner;
import java.lang.Exception;
import java.lang.String;
public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a;
		int b = 0;
		System.out.println("Please enter a number");
		a=sc.next();
		try
		{
			b=Integer.parseInt(a);
		}
		catch( NumberFormatException e)
		{
			System.out.println(e);
		}
		System.out.println("The number after formating is " +b);
		sc.close();
	}

}
