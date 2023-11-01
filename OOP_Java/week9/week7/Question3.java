package week7;
import java.util.Scanner;
import java.lang.String;
class Book
{
	String bkname;
	double price;
	int id;
	Book()
	{
		bkname="";
		price=0;
		id=0;
	}
}
class getmethods extends Book
{
	Scanner sc=new Scanner(System.in);
	void getid()
	{
		System.out.println("please enter ur book id");
		id=sc.nextInt();
	}
	void getname()
	{
		System.out.println("please enter ur book Name");
		bkname=sc.next();
	}
	void getprice()
	{
		System.out.println("please enter ur book price");
		price=sc.nextDouble();
	}
	void printdetails()
	{
		System.out.println("YOur book details are");
		System.out.println("Name:"+bkname);
		System.out.println("Id:"+id);
		System.out.println("Price:"+price);
	}
}
public class Question3 {

	public static void main(String[] args) {
		getmethods ob=new getmethods();
		ob.getid();
		ob.getname();
		ob.getprice();
		ob.printdetails();
	}

}
