package week4;
import java.util.Scanner;
public class question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a[]=new float[20];
		float sum=0;
		int n;
		System.out.println("ENter number of elements: ");
		n=sc.nextInt();
		System.out.println("Please enter your elements as float: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextFloat();
			
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The sum of elements of array is: "+sum);
		

	}

}
