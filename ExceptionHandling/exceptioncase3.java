import java.io.*;
public class exceptioncase2 {
	public static void main(String[] args)
	{
		int[] arr= new int[3];
		try
		{
			int index=arr[3];
			//will not be executed
			System.out.println("inside try");
		}
		catch(ArrayIndexOutOfBoundsException ax)
		{
			System.out.println(ax.getMessage());
		}
		finally
		{
			System.out.println("I will be executed no matter what");
		}
		System.out.println("outside try catch");
		
	}

}
