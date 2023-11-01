package exception;
import java.util.*;
import java.lang.String;
class Studentlist
{
	Scanner sc=new Scanner(System.in);
	String name;int roll;String[] marks=new String[3];
	void getdata()
	{
		System.out.println("Please enter your name");
		name=sc.nextLine();
		System.out.println("Please enter your Roll Number");
		roll=sc.nextInt();
		System.out.println("Please enter 3 subject marks");
		try
		{
			for(int i=0;i<3;i++)
			{
				marks[i]=sc.next();
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
	void calcpercent()
	{
		int[] m=new int[3];int sum=0;char grade;int flag=1;
		try
		{
			for(int i=0;i<3;i++)
			{
				m[i]=Integer.parseInt(marks[i]);
				if(m[i]>100 || m[i]<0)
				{
					System.out.println("Invalide entry for marks");
					System.exit(0);
				}
			}
			for(int i=0;i<3;i++)
			{
				sum+=m[i];
				if(m[i]<36)
				{
					flag=0;
				}
			}
			if(flag==1)
			{
				System.out.println("Name: "+name);
				System.out.println("Roll: "+roll);
				grade='P';
				System.out.println("The percentage of marks is "+((sum/300.0)*100));
				System.out.println("The grade is "+ grade);
			}
			else
			{
				System.out.println("Name: "+name);
				System.out.println("Roll: "+roll);
				grade='F';
				System.out.println("The percentage of marks is "+((sum/300)*100));
				System.out.println("The grade is "+ grade);
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}
}
public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of students");
		int n=sc.nextInt();
		Studentlist[] ob=new Studentlist[n];
		for (int i = 0; i < n; i++) { 
            ob[i] = new Studentlist();
            ob[i].getdata();
            ob[i].calcpercent();
		}

	}

}
