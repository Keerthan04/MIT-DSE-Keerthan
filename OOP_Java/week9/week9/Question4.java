package week9;
import java.util.*;
import java.lang.String;
import library.lib;
import book.bk;
import member.mem;
import transaction.trans;
public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);int a = 0;String na ="";
		while(true)
		{
			System.out.println("Please enter your choice");
			System.out.println("1.View Library book Details");
			System.out.println("2.View Book Details");
			System.out.println("3.Add Member details");
			System.out.println("4.Show Transaction Report of Library");
			System.out.println("5.Exit");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:
				lib ob=new lib();
				ob.booksavailable();
				break;
			case 2:
				bk ob1=new bk();
				a=ob1.bkPrices();
				break;
			case 3:
				mem ob2=new mem();
				na=ob2.getdata();
				ob2.showdata();
				break;
			case 4:
				trans.showtrans(1,a,na);
				break;
			case 5:
				System.exit(0);
			}
		}
		
}
}