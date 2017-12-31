import java.io.*;
public class throwsdemo {
	public static void main(String[] args)throws IOException
	{
		 FileReader file = new FileReader("C:\\test\\a.txt");
	        BufferedReader fileInput = new BufferedReader(file);
	         
	        
	        for (int counter = 0; counter < 3; counter++) 
	            System.out.println(fileInput.readLine());
	         
	        fileInput.close();
          
	        /*if file not present , just throw the exception and JVM handles it . 
	         * throws does not gurantee abnormal termination of the program and is just to convice 
	         * the compiler. Always handle the exception. Throws mainly used for declaring the exception
	         */
	     
	}

}
