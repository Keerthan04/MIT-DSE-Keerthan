package book;
import java.util.Scanner;
import java.lang.String;

public class bk {
	public int bkPrices()
	{
		Scanner sc=new Scanner(System.in);
		
		
			System.out.println("1.The Price for DA is Rs 120");
	
		
			System.out.println("2.The Price for OOP is Rs 220");
	
	
			System.out.println("3.The Price for C++ is Rs 250");
		
	
			System.out.println("4.The Price for DCN is Rs 150");
			
		
			System.out.println("5.The Price for Maths is Rs 130");
			System.out.println("Please enter the Book number which you want to buy");
			int num=sc.nextInt();
			return num;
		}
	}

