import java.io.*;
import java.text.*;
import java.util.*;


public class gameoflife {

	
	
	public static void main (String str[]) throws IOException
    {
		BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
		DecimalFormat df = new DecimalFormat ("#.########");
		Random generator = new Random ();
	
		System.out.println("duration/speed/sidelength/startingpositions\n\n");
		int duration = Integer.parseInt(stdin.readLine());
		int speed = Integer.parseInt(stdin.readLine());
		int width = Integer.parseInt(stdin.readLine());
		String[][] board = new String[width][width];

		String[] lines = (stdin.readLine().split("/"));
		for (int t = 0; t <width; t++)
		{
			board[t] = lines[t].split(" ");
		}
		
		//for(int w = 0; w < width; w++)
		//{
		//	System.out.println("Enter line #" + w);
		//	board[w] = (stdin.readLine()).split(" ");
		//}

		
////////////////////////////////////////////////////////////////////////////////////
		for(int a=0;a<board[0].length;a++)
		{
			for(int b=0;b<board.length;b++)
			{
				System.out.print(board[a][b]+" ");
				
			}
			System.out.println();
		}
////////////////////////////////////////////////////////////////////////////////////
		
		String[][] temp = new String[width+2][width+2]; //The sub board has a border around for checking
		for (String[] row: temp)
		    Arrays.fill(row, "0");//filler variables for the outside
		
		while (duration > 0){ System.out.println("\n\n\n\n\n\n\n\n\n");
			
			duration--;
		for(int c=0;c<board.length;c++) //Sub board copying main board
		{for(int d=0;d<board.length;d++)
		{temp[c+1][d+1] = board[c][d];}}
		
		int counter;
		for(int c=0;c<board.length;c++) //checking main board against sub board
		{for(int d=0;d<board.length;d++)
		{
			counter = 0;
			if (temp[c][d+2].equals("1"))
			{counter++;}
			if (temp[c+1][d+2].equals("1"))
			{counter++;}
			if (temp[c+2][d+2].equals("1"))
			{counter++;}
			if (temp[c+0][d+1].equals("1"))
			{counter++;}
			if (temp[c+2][d+1].equals("1"))
			{counter++;}
			if (temp[c][d].equals("1"))
			{counter++;}
			if (temp[c+1][d].equals("1"))
			{counter++;}
			if (temp[c+2][d].equals("1"))
			{counter++;}
			
		
		if (temp[c+1][d+1].equals("1"))
		{
			if (counter==3||counter==2)
			{
				board[c][d]="1";
			}
			else 
			{
				board[c][d]="0";
			}
		}
		if (temp[c+1][d+1].equals("0"))
		{
			if (counter==3)
			{
				board[c][d]="1";
			}
			else 
			{
				board[c][d]="0";
			}
		}
		}}
////////////////////////////////////////////////////////////////////////////////////
for(int a=0;a<board.length;a++)
{
for(int b=0;b<board.length;b++)
{
	if (board[a][b].equals("1"))
System.out.print(" # ");
	else
	{System.out.print(" . ");}

}
System.out.println();
}
////////////////////////////////////////////////////////////////////////////////////
		 try
		    {
			Thread.sleep (speed);
		    }
		    catch (InterruptedException ex)
		    {
			Thread.currentThread ().interrupt ();
		    }
		 
		}
		
		
		
		
		
		
}}