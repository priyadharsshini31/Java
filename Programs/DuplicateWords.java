import java.io.*;
import java.util.*;
class check
{
	public void checkDuplicate(String str)
	{
		String[] words = str.split(" ");
		HashMap<String,Integer>hm= new HashMap<String,Integer>();
		for(String dup:words)
		{
			if(hm.containsKey(dup))
			{
				hm.put(dup, hm.get(dup)+1);
			}
			else
			{
				hm.put(dup, 1);
			}
		}
		Set<String> s = new HashSet<String>();
		s=hm.keySet();
		for(String wor : s)
		{
			if(hm.get(wor)>1)
				{
					System.out.println("The string"+ " "+wor+" "+"is repeated"+" "+hm.get(wor)+" "+"Times");
				}
		}
				
	}
}
public class duplicate {

	public static void main(String[] args)
	{
		check ck = new check();
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		ck.checkDuplicate(str);
		
	}
}
