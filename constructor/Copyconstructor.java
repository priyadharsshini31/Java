import java.io.*;
class Copydemo
{
	String name;
	int age;
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
		Copydemo c2 = new Copydemo(c1);
	}

}
