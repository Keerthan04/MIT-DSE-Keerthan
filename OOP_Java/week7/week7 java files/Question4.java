package week7;
import java.util.Scanner;
import java.lang.String;
class Student
{
	String name;
	int id;
	int marks[]=new int[5];
	Student()
	{
		name="";
		id=0;
	}
}
class calc extends Student
{
	Scanner sc=new Scanner(System.in);
	void getname()
	{
		System.out.println("Please enter your name");
		name=sc.nextLine();
		System.out.println("Please enter your id");
		id=sc.nextInt();
	}
	void getmarks()
	{
		int total=0;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter subject "+(i+1)+" marks");
			marks[i]=sc.nextInt();
			if(marks[i]>100)
			{
				System.out.println("please enter a valid marks input.....terminating");
				System.exit(0);
			}
			total+=marks[i];
		}
		System.out.println("Total marks is"+total);
	}
	void details()
	{
		System.out.println(" Your details are");
		System.out.println(" your name"+name);
		System.out.println(" your id"+id);
		System.out.println(" your marks are");
		for(int i=0;i<5;i++)
		{
			System.out.println("subject "+(i+1)+" mark:"+marks[i]);
		}
	}
	void checkfail()
	{
		int flag=0;
		for(int i=0;i<5;i++)
		{
			if(marks[i]<40)
			{
				flag=1;
			}
		}
		if(flag==1)
			System.out.println("You have failed as u have marks less than 40 in atleast one subject");
		else
			System.out.println("You have Passed");
	}
}
public class Question4 {

	public static void main(String[] args) {
		calc ob=new calc();
		ob.getname();
		ob.getmarks();
		ob.details();
		ob.checkfail();
	}

}
