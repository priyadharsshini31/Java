import java.io.*;
public class exceptioncase1 {
	public static void main(String[] args)
	{
		int[] arr = new int[4];
		try 
		{
			int index= arr[4];
			//following statements will not be executed
			System.out.println(index);
			System.out.println("inside try block");
		}
		catch(ArrayIndexOutOfBoundsException ax)
		{
			System.out.println("Tried to access an index not there");
			System.out.println(ax.getMessage());
			}
		System.out.println("rest of the program will execute normally");
	}


}
