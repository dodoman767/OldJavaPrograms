import java.io.*;
import java.text.*;
import java.util.*;

public class CCCQuestion1 {

	public static void main(String str[]) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.########");
		Random generator = new Random();

		String[] WL = new String[6];
		int counter = 0;

		System.out.println("Enter the wins and losses");

		for (int i = 0; i < 6; i++) {
			WL[i] = stdin.readLine();
		}

		for (int j = 0; j < 6; j++) {
			if (WL[j].equals("W")) {
				counter++;
			}
		}

		if (counter < 1) {
			System.out.println("-1");
		} else if (counter > 4) {
			System.out.println("1");
		} else if (counter > 2) {
			System.out.println("2");
		} else if (counter > 0) {
			System.out.println("3");
		}

	}

}
