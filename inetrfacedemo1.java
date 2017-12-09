import java.io.*;
interface demo1
{
	int i=10;
	void demo_display();
	
}
public class interface_demo implements demo1 {
	public void demo_display()
	{
		System.out.println("Iam the definition for the display interface"+i);
		
	}
	public static void main(String[] args)
	{
		interface_demo id=new interface_demo();
		id.demo_display();
	}

}
