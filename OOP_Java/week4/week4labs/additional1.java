package week4;
import java.util.Scanner;
public class additional1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[20];
		int b[]=new int[20];
		int sum=0;
		int n,prime,flag=0,count=0;
		System.out.println("ENter number of elements: ");
		n=sc.nextInt();
		System.out.println("Please enter your elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			prime=a[i];
			flag=1;
			if(prime==1)
			{
				break;
			}
			else if(prime==2)
			{
				b[i]=prime;
				count++;
			}
			
			else
			{
				for(int k=2;k<prime;k++)
				{
					if(prime%k==0)
					{
						flag=0;
					}
				}
				if(flag==1)
				{
					b[i]=prime;
					count++;
				}
				else
				{
					break;
				}
			}
		}
		System.out.println("Array of prime numbers is: ");
		for(int i=0;i<count;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
