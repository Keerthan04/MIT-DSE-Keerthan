package exception;
import java.util.Scanner;
import java.lang.Exception;
import java.lang.String;
public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		System.out.println("Please enter the array elements");
		try
		{
			for(int i=0;i<4;i++)
			{
				a[i]=sc.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

	}

}
