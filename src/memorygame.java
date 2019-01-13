
import java.io.*;
import java.util.*;

public class memorygame {

	 public static void main (String str[]) throws IOException
	    {
		BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
		Random generator = new Random();
		while (true) {
		int difficultyMemory;
		do {
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  Pick a difficulty [0-5]");
		difficultyMemory = Integer.parseInt(stdin.readLine()); } while (difficultyMemory < 0 || difficultyMemory > 5 );
		
		String typeMemory = "";
		do {
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n What is your topic of choice? \n Animals \n Colors \n Substances \n Warning! they come quick, and you have to remember in order\n ");
		typeMemory = stdin.readLine().toLowerCase(); } while (!typeMemory.equals("animals") && !typeMemory.equals("animal") && !typeMemory.equals("colors") && !typeMemory.equals("color") && !typeMemory.equals("substances") && !typeMemory.equals("substance"));

		
		String[] animals = new String [24];
		animals [0] = "ARMADILLO" ; 
		animals [1] = "BABOON" ;
		animals [2] = "CRANE" ;
		animals [3] = "DEER" ;
		animals [4] = "ELEPHANT" ;
		animals [5] = "FOX" ;
		animals [6] = "GORILLA" ;
		animals [7] = "HAWK" ;
		animals [8] = "IGUANA" ;
		animals [9] = "JAGUAR" ;
		animals [10] = "KANGAROO" ;
		animals [11] = "LIZARD" ;
		animals [12] = "MANTIS" ;
		animals [13] = "NILE CROCODILE" ;
		animals [14] = "OCELOT" ;
		animals [15] = "PORCUPINE" ;
		animals [16] = "QUAIL" ;
		animals [17] = "RABBIT" ;
		animals [18] = "SEAL" ;
		animals [19] = "TIGER" ; 
		animals [20] = "VULTURE" ;
		animals [21] = "WOMBAT" ;
		animals [22] = "YAK" ;
		animals [23] = "ZEBRA" ;

		String[] colors = new String [26];
		colors [0] = "MAROON" ; 
		colors [1] = "CRIMSON" ; 
		colors [2] = "PLUM" ; 
		colors [3] = "INDIGO" ; 
		colors [4] = "LAVENDER" ; 
		colors [5] = "MAUVE" ; 
		colors [6] = "PUCE" ; 
		colors [7] = "FUCHSIA" ; 
		colors [8] = "SALMON" ; 
		colors [9] = "HOT PINK" ; 
		colors [10] = "CORAL" ; 
		colors [11] = "GOLD" ; 
		colors [12] = "LIME" ; 
		colors [13] = "GREEN APPLE" ; 
		colors [14] = "OLIVE" ; 
		colors [15] = "FOREST GREEN" ; 
		colors [16] = "TEAL" ; 
		colors [17] = "AQUAMARINE" ;
		colors [18] = "CYAN" ;
		colors [19] = "AZURE" ;
		colors [20] = "ROYAL BLUE" ;
		colors [21] = "NAVY" ;
		colors [22] = "CHARCOAL" ;
		colors [23] = "SILVER" ;
		colors [24] = "BEIGE" ;
		colors [25] = "MUSTARD" ;
		
		String[] substances = new String [25];
		substances [0] = "GOLD" ;
		substances [1] = "BLEACH" ;
		substances [2] = "BRIMSTONE" ;
		substances [3] = "LIMESTONE" ;
		substances [4] = "POTASH" ;
		substances [5] = "SALT" ;
		substances [6] = "SUGAR" ;
		substances [7] = "GLUCOSE" ;
		substances [8] = "PHOSPHATE" ;
		substances [9] = "URANIUM" ;
		substances [10] = "TUNGSTEN" ;
		substances [11] = "POLONIUM" ;
		substances [12] = "ASTITINE" ;
		substances [13] = "TERBIUM" ;
		substances [14] = "OSMIUM" ;
		substances [15] = "METHANE" ;
		substances [16] = "AMMONIUM" ;
		substances [17] = "CARBON DIOXIDE" ;
		substances [18] = "CHLORINE" ;
		substances [19] = "FLOURINE" ;
		substances [20] = "SULPHATE" ;
		substances [21] = "INK" ;
		substances [22] = "RESINIFERATOXIN" ;
		substances [23] = "VINEGAR" ;
		substances [24] = "BAKING SODA" ;
	       
		int counterMemory = difficultyMemory * 2 + 2 ;
		
		String[] verifyMemory = new String [30];
		String[] verifyMemory2 = new String [30];
		int verifyNumber = 0;
	       
		while (counterMemory > 0) {     
		
			if (typeMemory.equals("animal")||typeMemory.equals("animals")) { /////////////////////
		int randomMemory = generator.nextInt (24) ; 
		System.out.println( (animals [randomMemory]));

		verifyMemory [verifyNumber] = (animals [randomMemory]); 
		verifyNumber++; verifyMemory2 = verifyMemory;
		
		try { Thread.sleep(1000); } catch (InterruptedException ie) {}}
		
		else if (typeMemory.equals("substance")||typeMemory.equals("substances")) { //////////////////////
		int randomMemory = generator.nextInt (25) ; 
		System.out.println((substances [randomMemory]));

		verifyMemory [verifyNumber] = (substances [randomMemory]); 
		verifyNumber++; verifyMemory2 = verifyMemory;
		
		try { Thread.sleep(1000); } catch (InterruptedException ie) {}}
		
		else if (typeMemory.equals("color")||typeMemory.equals("colors")) { ///////////////////////////
		int randomMemory = generator.nextInt (25 ) ; 
		System.out.println(". " + (colors [randomMemory]));

		verifyMemory [verifyNumber] = (colors [randomMemory]);  //this is where it stores the random into array
		verifyNumber++; verifyMemory2 = verifyMemory;
		
		try { Thread.sleep(1000); } catch (InterruptedException ie) {}}
		
		
		counterMemory--;}
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		System.out.println("Enter what you remember in order! [ don't worry about caps ])" );
		String[] answerMemory = new String [12];
		for (int i = 0; i <= (difficultyMemory * 2 + 1); i++)
		{
		answerMemory [i] = stdin.readLine().toLowerCase();
		System.out.println("Okay, we saved number: "+ (i+1) +" as " + (answerMemory [i]));

		}
		//checker
		System.out.println("   ^ Your answers above ^\n");
		System.out.println(" v Correct answers below v ");
		int xxyxyxxxyxx = (difficultyMemory * 2 + 1);
		System.out.println("--------------------------------------------------------------------------------------------");
		for  (int i = 0; i <= xxyxyxxxyxx; i++)
		{
		System.out.println("\n"+(i+1)+". "+(verifyMemory [i]));
		}
		// check for score
		System.out.println("--------------------------------------------------------------------------------------------");
	       int howmanycorrectanswers = 0;
	       try { Thread.sleep(1000); } catch (InterruptedException ie) {}
		for (int i = 0 ; i <= (difficultyMemory * 2 + 1); i ++) 
		{
		if (answerMemory[i].equals(verifyMemory[i].toLowerCase()))
		{
		System.out.println("\nQuestion " + (i+1) + " was correct");
		howmanycorrectanswers++;
		}
		else 
		{
		System.out.println("\nQuestion " + (i+1) + " wasn't correct");
		}	       }
		System.out.println("--------------------------------------------------------------------------------------------");
	       System.out.println (" \n\n\n " + howmanycorrectanswers + " out of : "+ (difficultyMemory * 2 + 2));
	       try { Thread.sleep(10000); } catch (InterruptedException ie) {}
	    } 
	}
}

	
	
	

	

