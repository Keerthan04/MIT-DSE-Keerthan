package exception;
import java.util.*;
import java.lang.String;
class MyException extends Exception
{
	public String toString()
	{
		return "Please enter a numeric value";
	}
}
public class Question1 {
	static int j=0;
	
	static void check(String b,int[] d) throws MyException
	{
		char c[]=b.toCharArray();
		for (int i=0;i<c.length;i++)
		{
			if(c[i]>='0' && c[i]<='9')
			{
				d[j++]=(c[i]-'0');
			}
			else
				throw new MyException();
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		String s="";
		System.out.println("Please enter three numbers");
		for(int i=0;i<3;i++)
		{
			s=sc.next();
			try
			{
				check(s,a);
			}
			catch(MyException e)
			{
				System.out.println("Exception:"+e);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			
		}
		for(int i=0;i<3;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
