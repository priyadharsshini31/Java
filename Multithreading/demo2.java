package Multithreading;
import java.io.*;
import java.util.*;
import java.lang.*;
class MyThread extends Thread
{
	public void run(){
		System.out.println("Am a thread created by extending the Thread class");
	}
	
}

public class demo2 {
	public static void main(String[] args)
	{
	System.out.println("Am the main thread");
	
	MyThread mt = new MyThread();
	mt.start();
	}
	

}
