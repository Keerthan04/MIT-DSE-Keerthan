package transaction;
import java.util.*;
import java.lang.String;

public class trans {
	static String t="";
	public static void showtrans(int n,int m,String na)
	{
		
		if(n==1 && m!=0 && na!="")
		{
			Date d=new Date();
			t+="Book "+m+" Borrowed by  "+na+" on "+d.toString()+"\n";
			System.out.println("The Transaction report");
			System.out.println(t);
		}
		
	}
	

}
