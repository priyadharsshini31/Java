package Multithreading;
import java.io.*;
import java.util.*;
import java.lang.*;
class myThread5 extends Thread
{
	public void run()
	{
		System.out.println("am the last thread"+Thread.currentThread().getPriority());
		
	}
}
class myThread4 extends Thread
{
	
	public void run()
	{
		System.out.println("Am a thread "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(9);
	
	myThread5 mt5 = new myThread5();
	mt5.start();
	}
}
public class demo7 {

	public static void main(String[] args)
	{
		Thread.currentThread().setPriority(6);
		myThread4 mt = new myThread4();
		mt.start();
		
	}
}
