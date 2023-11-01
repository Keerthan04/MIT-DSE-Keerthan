package week2;
import java.util.Scanner;
public class Question3add {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,carry;
		System.out.println("Please eneter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		while (b != 0)
		{
	        carry = a&b;
	        a = a^b; 
	        b = carry<<1;
		}
		if((a^1)== a+1)
		{
			System.out.println("The sum "+a+" is even");
	
		}
		else
			System.out.println("The sum "+a+" is odd");

	}

}
