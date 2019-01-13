import java.io.*;
import java.text.*;
import java.util.*;

public class CCCQuestion3 {

	public static int palin(char[] word) {
		int x = 0;
		int y = word.length - 1;
		while (y > x) {
			if (word[x] != word[y]) {
				return 0;
			}
			++x;
			--y;
		}
		return 1;
	}

	public static void main(String str[]) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the word");
		String word = stdin.readLine();
		String[] letters = word.split("");

		int biggest = 0;
		String temp = "";

		for (int a = 0; a < letters.length; a++) {
			for (int b = a; b < letters.length; b++) {
				for (int c = a; c <= b; c++) {
					temp = temp + letters[c];
				}
				char[] templist = temp.toCharArray();
				int test = palin(templist);
				if (test == 1) {
					if (biggest <= temp.length()) {
						biggest = temp.length();
					}
				}
				temp = "";
			}
		}
		System.out.println(biggest);

	}
}