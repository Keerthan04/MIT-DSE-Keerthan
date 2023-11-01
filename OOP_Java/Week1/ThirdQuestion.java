package Week1;

import java.util.Scanner;

public class ThirdQuestion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Registration number");
		int reg=sc.nextInt();
		int year=reg/10000000;
		System.out.println("Your Year of admission is 20"+year);

	}

}
