import java.io.*;
class Test1
{
	public void display()
	{
		this.show();
		System.out.println("Back to display");
	}
	public void show()
	{
		System.out.println("Am invoked from this");
	}
}
public class Thisdemo2 {
	public static void main(String[] args)
	{
		Test1 t = new Test1();
		t.display();
	}

}
