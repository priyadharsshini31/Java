package Multithreading;
import java.io.*;
import java.util.*;
class thread1 extends Thread
{
	public void run()
	{
		System.out.println("Am a new thread");
	}
}
public class demo3 {
	public static void main(String[] args)
	{
		System.out.println("am a sep stack");
		method1();
	}
	static void method1()
	{
		thread1 t1 = new thread1();
		System.out.println("the next line starts a new stack for the new threada");
		t1.start();
	}

}
