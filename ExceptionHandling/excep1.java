import java.io.*;
class excep1
{
	public static int divide(int a , int b )
	{
		int res=0;
		try{
		
		res = a/b;
		
	}
		catch(ArithmeticException ex)
		
		{
			System.out.println("you have attempted to divide a number by 0");
	        System.out.println(ex.getMessage());	
		}
	
	return res;
	}
	public static void main(String[] args)
	{
		int result = divide(12,0);
		System.out.println(result);
	}
}
