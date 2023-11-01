package week4;
import java.util.Scanner;
public class additional2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[20];
		int sum=0;
		int n,temp;
		System.out.println("ENter number of elements: ");
		n=sc.nextInt();
		System.out.println("Please enter your elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted array is:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("The largest element is:"+a[n-1]);
		System.out.println("The smallest element is:"+a[0]);
		
		
	}

}