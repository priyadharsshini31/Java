import java.util.Scanner;

class addition
{
	public void matrixadd()
	{
		System.out.println("Enter the rows and columns of the matrix");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		int arr[][]= new int[row][column];
		int arr1[][] = new int[row][column];
		int sum[][]= new int[row][column];
		System.out.println("Enter the first array");
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the second array");
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				sum[i][j]=arr[i][j]+arr1[i][j];
			}
		
	}
		System.out.println("the added array is");
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println("\n");
		}
}
}
public class matrixAddition {
	public static void main(String[] args)
	{
		addition add = new addition();
		add.matrixadd();
	}

}
