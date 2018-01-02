import java.io.*;
class base
{
	{
		System.out.println("am the first init block");
	}
	{
		System.out.println("am the second init block");
	}
	base()
	
	{
		this (3,4);
		System.out.println("am a no arg constructor");
	}
	base(int x , int y)
	{
		System.out.println(x*y);
	}
	
}
public class Chainingdemo2 {
	
	Chainingdemo2()
	{
		super();
	}
	public static void main(String[] args)
	{
		base b = new base();
	}

}
