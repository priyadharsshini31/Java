import java.io.*;
import java.util.*;
public class dupliacteWords {
	public static void main(String[] args)
	{
		String str;
		String[] words;
		int count=1;
		Scanner sc = new Scanner(System.in);
		str= sc.nextLine();
		words=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j]="noo";
				}
			}
			if(words[i]!="noo")
			{
				System.out.println(words[i]+"----"+count);
				count=1;
			}
			
		}
		
	}

}

