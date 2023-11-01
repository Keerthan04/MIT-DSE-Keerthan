package Week1;

import java.util.Scanner;

public class FourtQuestion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your year of birth");
		int dob=sc.nextInt();
		int ret=dob+60;
		System.out.println("Your Retiring year is "+ret);

	}

}
