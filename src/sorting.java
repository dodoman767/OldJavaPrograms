import java.io.*;

public class sorting {			//merge sort
	
	public static void main (String[] args) throws IOException {
		
		BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));

		
		System.out.println("\nEnter numbers separated by spaces");
		String set = stdin.readLine();
		String[]digits = set.split(" ");
		int[] numbers = new int[digits.length];
		
		for(int i = 0; i < digits.length; i++)
		numbers[i] = Integer.parseInt(digits[i]);
			
		
		int number = numbers.length;
		int[] tempo = new int[number];
		split(0, number - 1, numbers, tempo, number);
		
		for (int jnf = 0; jnf < numbers.length; jnf ++)
			System.out.print(numbers[jnf]+" ");
		
	}
		  
		  public static void split(int bot, int top, int[] numbers, int[]tempo, int number) {
		   if (bot < top) {
		      int mid = (top + bot) / 2;
		     split(bot, mid, numbers, tempo, number);
		     split(mid + 1, top, numbers, tempo, number);
		      join(bot, mid, top, numbers, tempo, number);  }}

		  
		  public static void join(int bot, int mid, int top, int[] numbers, int[]tempo, int number) {
			  for (int i = bot; i <= top; i++) {
		      tempo[i] = numbers[i];  }

		    int i = bot, j = mid + 1, k = bot;
		    
		    while (i <= mid && j <= top) {
		      if (tempo[i] <= tempo[j]) {
		        numbers[k] = tempo[i];  i++;
		      } else {  numbers[k] = tempo[j];
		        j++; } k++;  }
		    
		    while (i <= mid) {
		      numbers[k] = tempo[i];
		      k++;   i++;   }  }
		  

} 
