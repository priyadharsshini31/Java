import java.io.*;
import java.util.*;
public class Lengthdemo1 {
	public static void main(String[] args)
	{
		String original;
		int i=0;
		int length=0;
		Scanner sc = new Scanner(System.in);
		original=sc.nextLine();
		try
		{
			for(i=0;;i++)
			{
				original.charAt(i);
				//length++;
			}
		}
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println("The length is" + i);
		}
	}

}
