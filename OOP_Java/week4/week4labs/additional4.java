package week4;
import java.util.Scanner;
public class additional4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[20];
		int b[]=new int[20];
		int c[]=new int[20];
		int sum=0;
		int m,n,temp;
		System.out.println("ENter number of elements of array1: ");
		m=sc.nextInt();
		System.out.println("Please enter your elements of array1: ");
		for(int i=0;i<m;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("ENter number of elements of array2: ");
		n=sc.nextInt();
		System.out.println("Please enter your elements of array2: ");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			c[i]=a[i];
		}
		for(int i=m;i<(n+m);i++)
		{
			c[i]=b[i];
		}
		int count=m+n;
		for(int i=0;i<count-1;i++)
		{
			for(int j=0;j<count-i-1;j++)
			{
				if(c[j]>c[j+1])
				{
					temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
		for(int i=0;i<(n+m);i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
