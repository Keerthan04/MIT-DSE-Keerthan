package Week1;

import java.util.Scanner;

public class GreatestInteger {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter Second number");
		int b=sc.nextInt();
		System.out.println("Enter Third number");
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println("The greatest among three is: "+a);
		}
		else if(b>c) {
			System.out.println("The greatest among three is:"+b);
		}
		else {
			System.out.println("The greatest among three is:"+c);

	}

}
}
