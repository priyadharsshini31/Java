import java.util.Arrays;

class checkAnagram
{
	public void checkstringAnagram(String str,String str1)
	{
		char[] arr= str.toCharArray();
		char[] arr1 = str1.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
		if(Arrays.equals(arr,arr1))
		{
			System.out.println("They are anagrams");
		}
		else
		{
			System.out.println("They are not anagrams");
		}
	
		
	}
}
public class Anagram {
	public static void main(String[] args)
	{
		checkAnagram ca = new checkAnagram();
		ca.checkstringAnagram("priya is a good gal", "ayirp a si lag oodg");
		ca.checkstringAnagram("dhgfd", "hcjqgdyuq");
	}

}
