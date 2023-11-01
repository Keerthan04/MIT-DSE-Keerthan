package week7;
import java.util.Scanner;
import java.lang.String;
import java.lang.*;
class Account
{
	Scanner sc = new Scanner(System.in);
    String name;
    int accountNo;
    double balance=0;
    final double min=500;
    Account() {
        name="";
        accountNo=0;
    }
    void getdetails()
    {
    	System.out.println("Please enter your Name");
    	name=sc.nextLine();
    	System.out.println("Please enter your Account no");
    	accountNo=sc.nextInt();
    }
    void Dispdetails()
    {
    	System.out.println("Your details are:");
    	System.out.println("name is"+name);
    	System.out.println("account no"+accountNo);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
    }
    void Dispbalance()
    {
    	System.out.println("The balance is"+balance);
    }
    void intrest()
    {
    	System.out.println(" the intrest rate is 2%");
    	System.out.println("please enter the time period for calculation");
    	Dispbalance();
    	double n=sc.nextDouble();
    	double ci=(balance*(Math.pow(1.0+(2.0/100), n)));
    	System.out.println("The ci will be"+ci);
    }
    void withdraw(double amount) {
    	Dispbalance();
    	if(penalty()==0) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
	            if(penalty()!=0)
	            	System.out.println("You have balance less than minimum as your are imposed a tax of 5000Rs ");
	        } else {
	            System.out.println("Insufficient funds. Withdrawal failed.");
	        }
    	}
    	else
    	{
    		System.out.println("You have balance less than minimum os your are imposed a tax of 5000Rs");
    	}
    }
    int penalty()
    {
    	if(balance<min)
    	{
    		return 1;
    	}
    	else
    		return 0;
    }
}
class current extends Account
{
	Scanner sc=new Scanner(System.in);
	current()
	{
		getdetails();
		Dispdetails();
		todo();
	}
	void todo(){int ch;
		while(true)
		{
			System.out.println("Welcome to your Current account");
			System.out.println("enter your choice");
			System.out.println("1.Deposit");
			System.out.println("2.Diplaye balance");
			System.out.println("3.See ur intrestt");
			System.out.println("4.withdraw");
			System.out.println("5.Exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter amount to deposit");
				double am=sc.nextDouble();
				deposit(am);break;
			case 2:
				Dispbalance();break;
			case 3:
				intrest();break;
			case 4:
				System.out.println("Enter amount to withraw");
				double amo=sc.nextDouble();
				withdraw(amo);break;
			case 5:
				System.exit(0);
			
			}
		}
	}
}
class savings extends Account
{
	Scanner sc=new Scanner(System.in);
	savings()
	{
		getdetails();
		Dispdetails();
		todo();
	}
	void todo(){int ch;
		while(true)
		{
			System.out.println("Welcome to your savings account");
			System.out.println("enter your choice");
			System.out.println("1.Deposit");
			System.out.println("2.Diplaye balance");
			System.out.println("3.See ur intrestt");
			System.out.println("4.withdraw");
			System.out.println("5.Exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter amount to deposit");
				double am=sc.nextDouble();
				deposit(am);break;
			case 2:
				Dispbalance();break;
			case 3:
				intrest();break;
			case 4:
				System.out.println("Enter amount to withraw");
				double amo=sc.nextDouble();
				withdraw(amo);break;
			case 5:
				System.exit(0);
			
			}
		}
	}
}
public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your type of account");
		System.out.println("1.Current Account");
		System.out.println("2.Savings Account");
		int ch=sc.nextInt();
		if(ch==1) {
			current ob=new current();}
		else {
			savings ob=new savings();}

	}

}
