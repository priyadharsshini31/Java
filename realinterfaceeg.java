import java.io.*;
interface garden_plants
{
	void water_calc(double ltr);
	void manure_calc(double kg);
}
class ladysfinger implements garden_plants
{
	public void water_calc(double ltr)
	{
		System.out.println("water for ladysfinger" +
	ltr*30);
	}
	public void manure_calc(double kg)
	{
		System.out.println("manure for ladysfinger" + kg*30);
	}
}
class brinjal implements garden_plants
{
	public void water_calc(double ltr)
	{
		System.out.println("water for brinjal" + ltr*30);
	}
	public void manure_calc(double kg)
	{
		System.out.println("manure for brinjal" + kg*30);
	}
	
}
public class Real_word_interface {
	public static void main(String[] args)
	{
		brinjal b = new brinjal();
		b.water_calc(0.5);
		b.manure_calc(0.3);
		ladysfinger lf = new ladysfinger();
		lf.water_calc(0.3);
		lf.manure_calc(0.5);
		
	}

}
