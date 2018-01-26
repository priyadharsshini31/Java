package Multithreading;
import java.io.*;
import java.util.*;
import java.lang.*;
class shared
{
	shared s1;
	shared s2;
	
	synchronized public void test1(shared s2)
	{
		System.out.println("s1 object has acquired the lock");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			
		}
		s2.test2(this);
		System.out.println("end");
	}
	synchronized public void test2(shared s1)
	{
		System.out.println("s2 object has acquired the lock");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			
		}
		s1.test1(this);
		System.out.println("dead");
	}
	
}
class thread2 extends Thread
{
	shared s1;
	shared s2;
	thread2(shared s1, shared s2)
	{
		this.s1 = s1;
		this.s2 = s2;
		
	}
	public void run()
	{
		s1.test1(s2);
	}
}
class thread3 extends Thread
{
	shared s1;
	shared s2;
	thread3(shared s1, shared s2)
	{
		this.s1 = s1;
		this.s2 = s2;
		
	}
	public void run()
	{
		s2.test2(s1);
	}
}
public class demo11 {
	public static void main(String[] args)
	{
		shared s1 = new shared();
		shared s2 = new shared();
		thread2 t2 = new thread2(s1,s2);
		t2.start();
		thread3 t3 = new thread3(s1,s2);
		t3.start();
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie)
		{
			
		}
		
	}

}
