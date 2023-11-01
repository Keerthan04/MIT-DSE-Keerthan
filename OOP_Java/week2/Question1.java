package week2;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int year;
		boolean isleap= false;
		System.out.println("Please enter the year");
		year=sc.nextInt();
		if((year%4)!=0)
		{
			isleap=false;
		}
		else if(year%100!=0)
		{
			isleap=true;
		}
		else if(year%400!=0)
		{
			isleap=false;
		}
		else
			isleap=true;
		if(isleap)
		{
			System.out.println("The year "+ year + "is a leap year ");
		}
		else
			System.out.println("The year " +year +" is not leap year");		
		
	}

}
