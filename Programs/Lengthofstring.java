import java.util.*;
public class Length {
	//String original;
	public static void main(String[] args)
	{
		String original;
		char[] letters;
		int count=0;
		Scanner sc = new Scanner(System.in);
		original=sc.nextLine();
		letters = original.toCharArray();
		for(char c :letters)
		{
			count++;
		}
		System.out.println("The number of letters in the String is" + count);
		
	}

}
