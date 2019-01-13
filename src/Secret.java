import java.io.*;
import java.text.*;
import java.util.*;

public class Secret {
	
	public static void binary(String number)
	{
		
	}
	
	public static void main (String str[]) throws IOException
    {
		BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
		DecimalFormat df = new DecimalFormat ("#.########");
		Random generator = new Random ();
		
		String[] orginal = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String[] keyboard = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
		int type, rotvalue = 0;
		
		System.out.println("What type of encryption is it?\n[1]ROT\n[2]Morse\n[3]Alphakey\n[4]Inverse");
		type = Integer.parseInt(stdin.readLine());	// TYPE OF TRANSLATION
		
		if (type == 1)	// ROT CODE KEY NUMBER
		{
		System.out.println("Enter ROT value");
		rotvalue = Integer.parseInt(stdin.readLine());
		}
		
		System.out.println("Enter encrypted code"); // INPUT OF MESSAGE
		String message = stdin.readLine();
		
		String[]lettersinString =  message.split("");
		String[]letters = new String[lettersinString.length]; // ARRAY OF THE LETTERS
		for (int a = 0; a < letters.length; a++)
    {letters[a] = (lettersinString[a]);}
		
		
		for (int m = 0; m < letters.length; m++){ // FOR EACH LETTER
		
		if (type ==1) //ROT 
		{
			
			
		}
		
		
		
		
		} // for loop of letter changing
		for (int z = 0; z < letters.length; z++)
			System.out.print(letters[z]);
}
}