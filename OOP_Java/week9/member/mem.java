package member;
import java.util.Scanner;
import java.lang.String;

public class mem {
	Scanner sc=new Scanner(System.in);
	String name;int roll;
	public String getdata()
	{
		System.out.println("Please enter your Name");
		name=sc.nextLine();
		System.out.println("Please enter your Roll Number");
		roll=sc.nextInt();
		return name;
	}
	public void showdata()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
	}
	
}
