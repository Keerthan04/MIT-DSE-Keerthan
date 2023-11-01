package exception;
import java.util.*;
import java.lang.String;
class Invalid_File_Extn extends Exception
{
	public String toString()
	{
		return "The File Extensions are not same";
	}
}
class check
{
	void strcheck(String[] c) throws Invalid_File_Extn
	{
		String[] ext=new String[c.length];int flag=1;
		for(int i=0;i<c.length;i++)
		{
			int index=c[i].indexOf('.');
			ext[i]=c[i].substring(index+1);
		}
		for(int i=0;i<ext.length;i++)
		{
			if(!(ext[0].equals(ext[i])))
			{
				flag=0;
				throw new Invalid_File_Extn();
			}
		}
		if(flag==1)
		{
			System.out.println("The extensions of files are same");
		}
		
	}
}
public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number of extensions");
		int n=sc.nextInt();
		String[] a=new String[n];
		System.out.println("Please enter the extensions");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		check ob=new check();
		try
		{
			ob.strcheck(a);
		}
		catch(Invalid_File_Extn e)
		{
			System.out.println("Exception:"+e);
		}

	}

}
