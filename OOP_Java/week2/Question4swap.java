package week2;
import java.util.Scanner;
public class Question4swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a;
		int b;
		System.out.println("Enter an string:");
		a=sc.nextLine();
		System.out.println("Enter an integer:");
		b=sc.nextInt();
		String c = a;
		a= String.valueOf(b);
		b=Integer.parseInt(c);
		
		System.out.println("string = "+ a);
		System.out.println("int = "+b);
		

	}

}
