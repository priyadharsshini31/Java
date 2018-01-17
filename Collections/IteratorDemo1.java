import java.io.*;
import java.util.*;
public class Iteratordemo1 {
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<=10;i++)
		{
			al.add(i);
		}
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
			int a = itr.next();
			System.out.println("The value is" + a);
			if(a%2==0)
			{
				itr.remove();
			}
			
		}
		System.out.println(al);
		
		
		
	}

}

