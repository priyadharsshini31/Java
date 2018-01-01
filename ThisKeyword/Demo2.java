import java.io.*;
class Test
{
	int no;
	int roll;
	Test()
	{
		this(10,20);
	}
	Test(int no, int roll)
	{
		this.no=no;
		this.roll=roll;
	}
	public void display()
	{
		System.out.println("Number" + no );
		System.out.println("Roll" + roll);
	}
}
public class Thisdemo1 {
	public static void main(String[] args)
	{
		Test t = new Test();
		t.display();
	}
	

}
