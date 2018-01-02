import java.io.*;
import java.util.*;
public class Reverse {
	public static void main(String[] args)
	{
		String original;
		String[] words;
		String reverse="";
		Scanner sc = new Scanner(System.in);
		original=sc.nextLine();
		words=original.split("\\s");
		int j=words.length;
		System.out.println(j);
		for(int i=(j-1);i>=0;i--)
		{
			reverse = reverse +" " +  words[i];
		}
		System.out.println(reverse);
	}

}
