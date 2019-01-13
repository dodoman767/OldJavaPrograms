import java.io.*;
import java.util.*;
import java.text.*;

public class cayleyq25 {

	public static void main (String str[]) throws IOException
    {
		BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
		DecimalFormat df = new DecimalFormat ("#.########");
		Random gen = new Random ();
		
		double counter = 0;
		double anticounter = 0;
		
		// a = 1; e = 2; b = 3; c = 4; d = 5;
		for (double a = 2; a <= 3; a++){ // only vowels so 2-4
		for (double b = 1; b <= 5; b++){
		for (double c = 1; c <= 5; c++){
		for (double d = 1; d <= 5; d++){
		for (double e = 1; e <= 5; e++){
		for (double f = 1; f <= 5; f++){
		for (double g = 1; g <= 5; g++){
		for (double h = 1; h <= 5; h++){
		for (double i = 1; i <= 5; i++){
		for (double j = 1; j <= 5; j++){
												
		//double number = (j)+(10*i)+(100*h)+(1000*g)+(10000*f)+(100000*e)+(1000000*d)+(10000000*c)+(100000000*b)+(a*1000000000);
		double[]digits = {a, b, c, d, e, f, g, h, i, j};
			
		boolean work = true;
		
		for (int z = 0; z < digits.length-1; z++) //test for same letter
		{
			if (digits[z] == digits[z+1])
			{
				work = false;
				//System.out.println(digits[z]+ " " + digits[z+1]);
			}
		}
		
		for (int z = 0; z < digits.length-1; z++) //test for vowel repeat
		{
			if (digits[z] == 1 || digits[z] == 2)
			{
				if (digits[z+1] == 1 || digits[z+1] == 2)
				{
					work = false;
					//System.out.println(digits[z] + " " + digits[z+1]);
				}
			}
		}
		
		if (work == true)
		{
			counter++;
			//System.out.println(number);
		}
		else 
		{
			anticounter++;
		}
		
		
		}}}}}}}}}}
		System.out.println(counter);
		System.out.println(anticounter);
		System.out.println(counter+anticounter);
		
		
		
		
		
		
		
		
		
}}