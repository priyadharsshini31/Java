import java.util.*;
public class userdefinedexception4 {
	int f;
	public void divide(int a , int b)
	{
		int c;
		
		try
		{
			c = a/b;
		}
		catch(ArithmeticException ex)
		{
			ex.printStackTrace();
			
		}
	}
	public void illegaldivide(int d, int e)throws myexception 
	{
		if(e<=10)
		{
			myexception me = new myexception("This is an illegal divide");
			throw me;
			
		}
		else
		{
		f = d/e;
		}
		
	}
	public static void main(String[] args)
	{
		userdefinedexception4 ue = new userdefinedexception4();
		ue.divide(10,0);
		try{
			
		
		ue.illegaldivide(10, 10);
		}
		catch(myexception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	

}
class myexception extends Exception
{
	myexception(String str)
	{
		super(str);
	}
}
