package week4;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int m,n,p,q;
		int a[][]=new int [20][20];
		int b[][]=new int [20][20];
		int mul[][]=new int[20][20];
		System.out.println("Please enter number of rows of matrix 1: ");
		m=sc.nextInt();
		System.out.println("Please enter number of columns of matrix 1: ");
		n=sc.nextInt();
		System.out.println("Please enter elements of matrix 1: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Please enter number of rows of matrix 2: ");
		p=sc.nextInt();
		System.out.println("Please enter number of columns of matrix 2: ");
		q=sc.nextInt();
		System.out.println("Please enter elements of matrix 2: ");
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("The first matrix is: ");
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("The second matrix is: ");
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println(" ");
		}
		if(n!=p)
		{
			System.out.println("Cant multiply");
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<p;j++)
				{
					mul[i][j]=0;
					for(int k=0;k<n;k++)
					{
						mul[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
			System.out.println("The Multiplied matrix is: ");
			for(int i=0;i<p;i++)
			{
				for(int j=0;j<q;j++)
				{
					System.out.print(mul[i][j]+" ");
				}
				System.out.println(" ");
			}
		}

	}

}
