import java.io.*;
class constructor
{
	String name;
	int number;
	constructor()
	{
		System.out.println("I was invoked during object creation");
	}
}
public class Constructordemo1 {
	
public static void main(String[] args)
{
	constructor cd =new constructor();
	System.out.println("Name:" + cd.name);
	System.out.println("Number:" + cd.number);
}

}

