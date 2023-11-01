package Week1;

import java.util.Scanner;

public class SecondQuestion {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter cost of travel:");
		int cost=sc.nextInt();
		if (cost<=50)
		{
			int dist=cost/10;
			System.out.println("The total distance Travelled is "+dist);
		}
		else if(cost<=(50+(8*15)))
		{
			int actcost=(cost-50)/8;
			System.out.println("The total distance travelled is "+(5+actcost));
		}
		else if(cost<=(50+(8*15)+(5*25)))
		{
			int actcost2=(cost-170)/5;
			System.out.println("The total distance travelled is "+(20+actcost2));
		}

	}

}
