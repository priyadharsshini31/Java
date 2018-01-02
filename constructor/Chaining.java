import java.io.*;
public class Chainingdemo1 {
	Chainingdemo1()
	{
		this(3,4);
		System.out.println("this is no arg constructor");
	}
	Chainingdemo1(int x,int y)
	{
		System.out.println(x + y);
	}
public static void main(String[] args)
{
	Chainingdemo1 cd = new Chainingdemo1();
	
	
}
	

}
