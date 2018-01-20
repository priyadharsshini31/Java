package Multithreading;
import java.io.*;
import java.lang.*;
import java.util.*;
class myThread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			
		
		System.out.println(i+Thread.currentThread().getName());
		}
		
	}
}
public class demo5 {
	public static void main(String[] args)
	{
	myThread2 t1 = new myThread2();
	myThread2 t2 = new myThread2();
	myThread2 t3 = new myThread2();
	t1.start();
	try{
	t1.join();
	}
	catch(InterruptedException ie)
	{
		System.out.println("caught an exception");
	}
	t2.start();
	t3.start();
	
	}
	
	

}
