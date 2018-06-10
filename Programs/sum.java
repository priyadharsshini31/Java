import java.util.*;
import java.io.*;
public class sum
{
	public static void calculate(int arr1[],int arr2[],int x)
	{
		int result = 0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				result = arr1[i] + arr2[j];
				if(result == x)
				{
					System.out.println(arr1[i]+ " "+ arr2[j]);
					
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int arr1[]= {1,3,5,7,9};
		int arr2[] = {3,4,5,6,1};
		int x =6;
		calculate(arr1,arr2,x);
	}
}
