package week9;
import java.util.Scanner;
import java.lang.String;
interface Sports
{
	void getNumberOfGoals();
	void dispTeam();
}
class hockey implements Sports
{
	Scanner sc=new Scanner(System.in);
	int num;String name;
	public void getNumberOfGoals()
	{
		try
		{
			System.out.println("Please enter Team Name");
			name=sc.nextLine();
			System.out.println("Please enter number of goals");
			num=sc.nextInt();
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}
	public void dispTeam()
	{
		System.out.println("Your Team Name is: "+name);
		System.out.println("The number of goals scored by Team "+name+" is: "+num);
	}
}
class football implements Sports
{
	Scanner sc=new Scanner(System.in);
	int num;String name;
	public void getNumberOfGoals()
	{
		try
		{
			System.out.println("Please enter Team Name");
			name=sc.nextLine();
			System.out.println("Please enter number of goals");
			num=sc.nextInt();
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}
	public void dispTeam()
	{
		System.out.println("Your Team Name is: "+name);
		System.out.println("The number of goals scored by Team "+name+" is: "+num);
	}
}
public class Question1 {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter sports");
		System.out.println("1.hockey");
		System.out.println("2.football");
		int n=sc.nextInt();
		if(n==1)
		{
			hockey ob=new hockey();
			ob.getNumberOfGoals();
			ob.dispTeam();
		}
		if(n==2)
		{
			football ob=new football();
			ob.getNumberOfGoals();
			ob.dispTeam();
		}
		
	}

}
