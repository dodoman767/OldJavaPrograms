import java.io.*;
import java.text.*;
import java.util.*;

public class CCCq2 {
	
	public static void main (String str[]) throws IOException
    {
		BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
		DecimalFormat df = new DecimalFormat ("#.########");
		Random gen = new Random ();

		String[] nearestconsonant = {"","a","c","d","f","e","g","h","j","i","k","l","m","n","p","o","q","r","s","t","v","u","w","x","y","z","z"+ "",};
		String[] nearestvowel = {"","a","a","a","e","e","e","e","i","i","i","i","i","o","o","o","o","o","o","u","u","u","u","u","u","u","u"};
		
		System.out.println("Give me the word");
		String[] letter = stdin.readLine().split("");

		
		for (int i = 0; i <letter.length;i++)
		{
		int position = 0;
			if (letter[i] .equals("a") || letter[i] .equals("e") ||letter[i] .equals("i")||letter[i] .equals("o") ||letter[i] .equals("u"))
				{System.out.print(letter[i]);
				}
			else {
				if (letter[i].equals("b"))
				{position = 2;}
				if (letter[i].equals("c"))
				{position = 3;}
				if (letter[i].equals("d"))
				{position = 4;}
				if (letter[i].equals("f"))
				{position = 6;}
				if (letter[i].equals("g"))
				{position = 7;}
				if (letter[i].equals("h"))
				{position = 8;}
				if (letter[i].equals("j"))
				{position = 10;}
				if (letter[i].equals("k"))
				{position = 11;}
				if (letter[i].equals("l"))
				{position = 12;}
				if (letter[i].equals("m"))
				{position = 13;}
				if (letter[i].equals("n"))
				{position = 14;}
				if (letter[i].equals("p"))
				{position = 16;}
				if (letter[i].equals("q"))
				{position = 17;}
				if (letter[i].equals("r"))
				{position = 18;}
				if (letter[i].equals("s"))
				{position = 19;}
				if (letter[i].equals("t"))
				{position = 20;}
				if (letter[i].equals("v"))
				{position = 22;}
				if (letter[i].equals("w"))
				{position = 23;}
				if (letter[i].equals("x"))
				{position = 24;}
				if (letter[i].equals("y"))
				{position = 25;}
				if (letter[i].equals("z"))
				{position = 26;}
				
				System.out.print(letter[i]+nearestvowel[position]+nearestconsonant[position]);
			}
			
			
		}
		
		
    }
}