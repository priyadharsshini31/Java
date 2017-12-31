import java.io.*;
class allways
{
	public void  divide() throws ArithmeticException
	{
		
			
		
		int c = 15/0;
		
		
		
		
	}
	public void illegal() throws ArrayIndexOutOfBoundsException
	{
		int[] arr = new int[5];
		
			System.out.println(arr[5]);
			
		
	
}
}

 class codereductionthrows {
	public static void main (String[] args)
	{
		try{
			allways a = new allways();
			a.divide();
			a.illegal();
		}
		catch(ArithmeticException aex)
		{
			aex.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException aiex)
		{
			aiex.getMessage();
		}
	}
}



