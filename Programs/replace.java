class replacechar
{
	public void replacechar(String str)
	{
		String str1 = str.replace("a", "");
		System.out.println("removing all a" +" "+str1);	
		System.out.println("Now am going to remove a charcter at 5th position");
		System.out.println(str1.substring(0, 5)+ str1.substring(6));
		}
}
public class replace {
	public static void main(String[] args)
	{
		replacechar rc = new replacechar();
		rc.replacechar("priyadharsshini");


	}

}
