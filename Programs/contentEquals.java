package Multithreading;
import java.util.*;
import java.lang.*;

public class contentEquals {
	public static void main(String[] args)
	{
		String orig="hello" ;
		StringBuffer sb = new StringBuffer("hello");
		StringBuilder sb1= new StringBuilder("hello1");
		if(orig.contentEquals(sb))
		{
			System.out.println("yes both are equal");
		}
		else
		{
			System.out.println("no");
		}
		if(orig.contentEquals(sb1))
		{
			System.out.println("yes both are equal");
		}
		else
		{
			System.out.println("no");
		}
		
		
	}

}
