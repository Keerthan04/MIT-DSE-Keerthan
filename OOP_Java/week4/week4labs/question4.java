package week4;
import java.util.Scanner;
public class question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {12, 67, 87, 34, 90, 23, 67, 88};
		int temp,n=8;
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
		for(int i=0;i<8;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}

}
