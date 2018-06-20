class toggle
{
	public void reverseAndToggle(String str)
	{
		String result="";
		String[] arr = str.split(" ");
		for(String w : arr)
		{
			StringBuilder sb = new StringBuilder(w);
			
			String s1=sb.reverse().toString();
			String s2 = s1.substring(0,1).toUpperCase()+s1.substring(1).toLowerCase();
			result+=" "+s2;
		}
		System.out.println(result);
	}
}
public class reverseToggle {
	public static void main(String[] args)
	{
		toggle tg = new toggle();
		tg.reverseAndToggle("my name is priya");
	}
	

}
