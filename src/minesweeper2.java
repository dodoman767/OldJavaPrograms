import java.io.*;
import java.text.*;
import java.util.*;

public class minesweeper2 {
 
	//  for(int d = 0; d < minefield.length;d++){
	//	for(int c = 0; c < minefield[0].length;c++){
	//	System.out.print("  "+minefield[d][c]);}System.out.println("\n");}
	
	public static void main (String str[]) throws IOException
    {
		BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
		DecimalFormat df = new DecimalFormat ("#.########");
		Random gen = new Random ();
	
		System.out.println("\n\nMinesweeper\n");
		
		int xlength = 8, ylength = 8; //defines the display and actual fields
		int bombcount = (int)(xlength*ylength*0.26);
		int[][] minefield = new int[xlength+2][ylength+2];
		int[][] knownfield = new int[xlength][ylength];
		
		for (int a = 0; a < bombcount; a++) //generates bombs randomly
		{
			int xran, yran;
				do{
			xran = gen.nextInt(minefield.length-2);
			yran = gen.nextInt(minefield[0].length-2);
				} while (minefield[xran+1][yran+1] == 9);
			minefield[xran+1][yran+1] = 9;
		}
	
		
		for (int b = 1; b < minefield.length-1;b++){ //Giving identity to each cell
			for (int c = 1; c < minefield[0].length-1;c++){
				
			if (minefield[b][c] ==0)
			{
				int counter = 0;
				if (minefield[b+1][c-1] ==9)
				{counter++;}
				if (minefield[b+1][c] ==9)
				{counter++;}
				if (minefield[b+1][c+1] ==9)
				{counter++;}
				if (minefield[b-1][c-1] ==9)
				{counter++;}
				if (minefield[b-1][c] ==9)
				{counter++;}
				if (minefield[b-1][c+1] ==9)
				{counter++;}
				if (minefield[b][c+1] ==9)
				{counter++;}
				if (minefield[b][c-1] ==9)
				{counter++;}
				minefield[b][c] = counter;
			}}}
			
			for(int d = 1; d < minefield.length-1;d++){ //print out minefield
				for(int e = 1; e < minefield[0].length-1;e++){
				System.out.print("  "+minefield[d][e]);}System.out.println("\n");}
		
			
			
			
			
			
			
		int xcoord,ycoord;
		while (true){
		System.out.println("Enter a coordinate [e.g. '3,6']");
		String coord = stdin.readLine();
		String[] coordS = coord.split(",");
		xcoord = Integer.parseInt(coordS[0])+ 2; 
		ycoord = Integer.parseInt(coordS[1])+ 2;
		//ADD IMPROVEMENT HERE: if player hits bomb on first move
		
		if (minefield[xcoord-2][ycoord-2] == 9) // If bomb is clicked on
		{
			for(int d = 1; d < minefield.length-1;d++){
				for(int c = 1; c < minefield[0].length-1;c++){
				System.out.print("  "+minefield[d][c]);}System.out.println("\n");}
			System.out.println("\n\nYou've lost!\n");
			break;
		}
		else
		{
			knownfield[xcoord-3][ycoord-3] = minefield [xcoord-2][ycoord-2];
			for(int e = 0; e < knownfield.length;e++){
				for(int f = 0; f < knownfield[0].length;f++){
				System.out.print("  "+knownfield[e][f]);}
				System.out.println("\n");}
		
			
		}
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		}	
}
