package week4;
import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[20];
		int sum=0;
		int n,flag=1;
		System.out.println("ENter number of elements: ");
		n=sc.nextInt();
		if(n%2==0)
			flag=0;
		else
			flag=1;
		System.out.println("Please enter your elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(flag==1)
		{
			System.out.println("The length is odd");
			sum=a[0]+a[n-1]+a[((n+1)/2)-1];
			System.out.println("Sum is: "+sum);
			
		}
		else
		{
			System.out.println("The length is even");
			sum=a[0]+a[n-1];
			System.out.println("The sum is: "+sum);
		}

	}

}
