import java.util.HashMap;

public class sumimp {
	public static void calculate(int arr1[],int arr2[],int x) {
		HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
		for(int i : arr1)
		{
			hm.put(i,0);
		}
		for(int j : arr2)
		{
			if(hm.containsKey(x-j))
			{
				System.out.println(x-j + " "+ j);
			}
		}
		
		
	}
	public static void main(String[] args)
	{
		int arr1[]= {1,3,5,7,9};
		int arr2[]= {5,3,1,3,4};
		int x =6;
		calculate(arr1,arr2,x);
	}

}
