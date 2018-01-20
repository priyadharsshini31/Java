package Multithreading;
import java.io.*;
import java.util.*;
class myRunnable1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i+Thread.currentThread().getName());
		}
	}
}

public class demo4 {
	public static void main(String[] args)
	{
		myRunnable1 mr = new myRunnable1();
		Thread t = new Thread(mr);
		Thread t1= new Thread(mr);
		t.start();
		t1.start();
	}

}
