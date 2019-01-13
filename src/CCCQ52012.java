import java.io.*;
import java.text.*;
import java.util.*;

public class CCCQ52012 {
 
	public static void main (String str[]) throws IOException
    {
		BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
		DecimalFormat df = new DecimalFormat ("#.########");
		Random gen = new Random ();
		
		System.out.println("Please enter the number of coins");
		int amount = Integer.parseInt(stdin.readLine());
		System.out.println("Please enter the list of coins [  e.g. '1 4 2 3 6 5 8 7'  ]");
		String[] list = (stdin.readLine()).split(" ");
		
	
    
    
    
}}