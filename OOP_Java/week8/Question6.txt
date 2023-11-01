package exception;
import java.util.Scanner;
class MyCustomException extends Exception {
 public MyCustomException(String message) {
     super(message);
 }
}

public class Question6 {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     try {
    	 System.out.println("Please enter your age");
         int age = sc.nextInt();
         if (age < 18) {
             throw new MyCustomException("You must be at least 18 years old.");
         }
         else
         {
        	 System.out.println("You are eligible to vote");
         }
         
     } catch (MyCustomException e) {
         System.out.println("Custom Exception Caught: " + e);
     }
 }
}

