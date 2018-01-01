import java.io.*;
class overloading
{
	String name;
	int age;
	int phone;
	
	overloading(String name)
	{
		this.name = name;
		
	}
	overloading(int age,int phone)
	{
		this.age= age;
		this.phone=phone;
	}
	overloading(int phone, String name)
	{
		this.phone=phone;
		this.name = name;
	}
}
public class constructoroverloading {
	public static void main(String[] args)
{
	overloading ol = new overloading("priya");
	System.out.println("Name:"+ol.name);
	System.out.println("Age" +ol.age);
	System.out.println("Phone"+ol.phone);
	overloading ol1 = new overloading(97899, "priya");
	System.out.println("Name:"+ol1.name);
	System.out.println("Age" +ol1.age);
	System.out.println("Phone"+ol1.phone);
	overloading ol2 = new overloading(25,97899);
	System.out.println("Name:"+ol2.name);
	System.out.println("Age" +ol2.age);
	System.out.println("Phone"+ol2.phone);
	
	
}
}
