package Multithreading;
import java.util.*;
import java.lang.*;
import java.io.*;
class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("Am a thread that is running");
	}
	
}
public class demo1  {
	public static void main(String[] args)
	{
		System.out.println("Am the main thread, And I will execute first");
		MyRunnable mr = new MyRunnable();
		Thread th = new Thread(mr);
		th.start();
		
	}

}
