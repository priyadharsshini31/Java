import java.io.*;
class Copydemo
{
	String name;
	int age;
	Copydemo()
	{
		
	}
	Copydemo(String name, int age){
		this.name=name;
		this.age=age;
		
	}
	Copydemo(Copydemo c)
	{
		System.out.println(c.name);
		System.out.println(c.age);
	}
}
public class Copyconstructor {
	public static void main(String[] args)
	{
		Copydemo c1 = new Copydemo("Priya", 23);
		Copydemo c2 = new Copydemo();
		c2.name=c1.name;
		c2.age=c1.age;
		System.out.println("Name" + c2.age);
		System.out.println("age" + c2.name);
	}

}
