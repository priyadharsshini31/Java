import java.io.*;
import java.util.Scanner;
public class Count {
	public static void main(String[] args)
	{
		String original;
		String[] words;
		int length=0;
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		words=original.split("\\s");
		length=words.length;
		System.out.println("There are" +" " + length +" " + "words in the string");
		}

}
