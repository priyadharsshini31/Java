package Multithreading;
import java.util.*;

public class white {
	public static void main(String[] args)
	{
		String str;
		String replace1;
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		str=sc.nextLine();
		replace1=str.replaceAll(" ", "%s");
		System.out.println("The string is"+replace1);
		
	}

}
