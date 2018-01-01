import java.io.*;
class priya
{
	String name;
	int age;
    priya()
	{
		System.out.println("am going to initialize deafult values");
	}
	priya(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
}
class Parameterized {
	public static void main(String[] args)
	{
		
	
	priya d = new priya();
	System.out.println("Name:" + d.name);
	System.out.println("Age" + d.age);
	priya d1 = new priya("Priya",25);
	System.out.println("Name:" + d1.name);
	System.out.println("Age" + d1.age);
	
	
	

}
}
