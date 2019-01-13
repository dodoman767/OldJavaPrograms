import java.io.*;
import java.text.*;
import java.util.*;

public class cayleyq24 {


	public static void main (String str[]) throws IOException
    {
		BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
		DecimalFormat df = new DecimalFormat ("#.########");
		Random gen = new Random ();
		
		double q, sum = 0;
		double[] qlist = new double[50];
		int counter = 0;
		
		for (int z = 0; z< 50; z++)
			qlist[z] = 0;
		
		for (int b = 1; b <=10; b++)
		{ for (int a = 1; a <= 250; a++)
		{
			q = (a/b);
			
			if(25 > q && q > 23.8874821937)
			{
				System.out.println(a+" / "+b);
				sum = sum + q;
				counter++;
			}
			
			
		}
		}
		System.out.println(sum);
}}
