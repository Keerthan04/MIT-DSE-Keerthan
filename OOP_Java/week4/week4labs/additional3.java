package week4;
import java.util.Scanner;
public class additional3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int m,n,count=0;
		int a[][]=new int [20][20];
		
		System.out.println("Please enter number of rows of matrix ");
		m=sc.nextInt();
		System.out.println("Please enter number of columns of matrix ");
		n=sc.nextInt();
		System.out.println("Please enter elements of matrix ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Please enter element to search ");
		int ele=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(ele==a[i][j])
				{
					count++;
				}
			}
		}
		System.out.println("the number of occurences of element entered is: "+count);
	}
}
