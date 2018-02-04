package Multithreading;
import java.util.*;


public class whitespace {
public static void main(String[] args)
{
	String str;
	StringBuffer replace = new StringBuffer();
	System.out.println("Enter the string you want to replace");
	Scanner sc = new Scanner(System.in);
	str= sc.nextLine();
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)!=' ')
		{
			replace.append(str.charAt(i));
		}
	}
	System.out.println("The replaces string without spaces is"+" " + replace);
	
	
	
}
}
