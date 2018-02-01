package Multithreading;
class pal_demo
{
	public int palindromeWithoutReversal(String str)
	{
		int a=0;
		int length=str.length();
		int mid=length/2 ;
		int last = length-1;
		for(int j=0;j<=mid;j++)
		{
			if(str.charAt(a)==str.charAt(last)){
			a++;
			last--;
			a=1;
		}
		else
		{
			a=0;
			break;
		}
		}
		
		
		
		
		return a;
		
		
		
		
	}
}

public class palindrome1 {
	public static void main(String[] args)
	{
		pal_demo pc = new pal_demo();
		int b=pc.palindromeWithoutReversal("daaaaaaad");
		if(b==1)
		{
			System.out.println("yes palindrome");
		}
		else
		{
			System.out.println("no");
		}
	}

}
