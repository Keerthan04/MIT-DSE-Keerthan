package week2;

import java.util.Scanner;

public class Question5Company {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double hrsworked,hrrate,salary;
		System.out.println("Please enter the number of hours worked");
		hrsworked=sc.nextInt();
		System.out.println("Please enter the hourly rate");
		hrrate=sc.nextInt();
		if(hrsworked>40)
		{
			salary=((40*hrrate)+(0.5*hrrate*(hrsworked-40)));
			System.out.println("The Salary is "+salary);
		}
		else if(hrsworked<=40)
		{
			salary=(hrrate*hrsworked);
			System.out.println("The Salary is "+salary);
		}
		else
		{
			System.out.println("Invalid input to hours");
		}

	}

}
