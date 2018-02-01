package Multithreading;
import java.lang.*;
import java.io.*;
import java.util.*;
class check
{
	public int check_palindrome(String str)
	{
		int result;
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		StringBuilder rev = sb.reverse();
		
		if(str.equals(rev.toString())){
			result = 1;
			System.out.println("hello");
			
		}
		else
		{
			result = 0;
		}
		
		
		
		
		return result;
		
	}
}
public class palindrome {
	
	public static void main(String[] args)
	{
	check ck = new check();
	 int a=ck.check_palindrome("dad");
	System.out.println(a);
	if(a==1)
	{
		System.out.println("yes!!!1 palindrome");
	}
	else
	{
		System.out.println("nope!...not a plaindrome");
	}
	}

}
