import java.util.HashSet;
import java.io.*;
public class firstrepeatedcharacter {
	public static void calculate(char[] str)
	{
		HashSet<Character> hs = new HashSet<>();
		for(int i=0;i<str.length;i++)
		{
			char c = str[i];
			if(hs.contains(c))
			{
				System.out.println("The first repeating character is" +" " + c);
				return ;
			}
			else
			{
				hs.add(c);
			}
			
		}
	}
	public static void main(String[] args)
	{
		String str1 = "geeksforgeeks";
		char[] str = str1.toCharArray();
		calculate(str);
	}
}
