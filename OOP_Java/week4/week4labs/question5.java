package week4;
import java.util.Scanner;
public class question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {12, 67, 87, 34, 90, 23, 67, 88};
		int n=8;
		double sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		double avg=sum/n;
		System.out.println("The sum of elements is: "+sum);
		System.out.println("The average of elements is: "+avg);

	}

}
