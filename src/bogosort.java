

import java.io.*;
import java.text.*;
import java.util.*;

public class bogosort {

	
	public static void main (String str[]) throws IOException
    {
		BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
		Random generator = new Random();
		
		System.out.println("How numbers many to organize?\n[TIP]having more than 10 unique numbers may be too much for most computers to handle effectively");
		int amount = Integer.parseInt(stdin.readLine());
		double[] numberset = new double [amount];
		System.out.println("Type the numbers");
		
		int placement = 0;
		
		while (placement <= amount-1)
		{
		numberset[placement] = Double.parseDouble(stdin.readLine());
		placement++;
		}
		int counter = 0;int works=1;
		do
		{
			
			double temp; int x, y;
			x = generator.nextInt(amount);
			y = generator.nextInt(amount);
			if (amount < 8)
			{
		System.out.println(x + " swapped with " + y+ "\n");
		System.out.println("Bogo-ing...");}
			temp = numberset[x];
			numberset[x] = numberset[y];
			numberset[y] = temp;
			counter++; works=1;
			for (int i=0;i<(amount-1);i++)
			{ 
				
				if(numberset[i]>numberset[i+1])
				{
					works =0; 
				}
			}
		}while (works==0);
		for (int i = 0; i < (placement);i++)
		{System.out.println(numberset[i]);}
			System.out.println("done after "+amount+" swaps");
}
}