package Multithreading;
import java.util.*;
public class reversewords {
	public static void main(String[] args)
	{
		String str;
		String[] words;
		StringBuffer sb = new StringBuffer();
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		str=sc.nextLine();
		words= str.split(" ");
		for(int j=words.length-1;j>=0;j--)
		{
			sb.append(words[j]+" ");
		}
		System.out.println("The reversed word is"+sb);
		
		
	}

}
