package week2;
import java.util.Scanner;
public class Question2Conversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		double number;
		char c;
		System.out.println("Please enter a number");
		num=sc.nextInt();
		System.out.println("Please enter a number");
		number=sc.nextDouble();
		System.out.println("Please enter a character");
		c=sc.next().charAt(0);
		byte bytnum = (byte)(num);
		int intchar = (int)(c);
		byte bytdou = (byte)(number);
		int dou=(int)(number);
		System.out.println("After Integer to byte conversion: "+bytnum);
		System.out.println("After character to int conversion: "+intchar);
		System.out.println("After double to byte conversion: "+bytdou);
		System.out.println("After integer to double conversion: "+dou);
		
		

	}

}
