import java.io.*;
import java.text.*;
import java.util.*;

public class CCCQuestion2 {

	public static void main(String str[]) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.########");
		Random generator = new Random();

		System.out.println("Enter the numbers");

		String[][] fours = { { "0", "0", "0", "0" }, { "0", "0", "0", "0" }, { "0", "0", "0", "0" },
				{ "0", "0", "0", "0" } };

		for (int i = 0; i < 4; i++) {
			String temp = stdin.readLine();
			fours[i] = temp.split(" ");
		}

		for (int z = 0; z < 4; z++) {
			for (int y = 0; y < 4; y++) {
			}
		}

		int istrue = 0;
		int[] sum = new int[4];

		for (int a = 0; a < 4; a++) {
			for (int b = 0; b < 4; b++) {

				sum[a] = Integer.parseInt(fours[a][b]) + sum[a];
			}
		}

		if (sum[0] == sum[1] && sum[1] == sum[2] && sum[2] == sum[3]) {
			istrue = 1;
		} else {
			istrue = 0;
		}

		sum[0] = 0;
		sum[1] = 0;
		sum[2] = 0;
		sum[3] = 0;

		for (int c = 0; c < 4; c++) {
			for (int d = 0; d < 4; d++) {

				sum[c] = Integer.parseInt(fours[d][c]) + sum[c];
			}
		}

		if (sum[0] == sum[1] && sum[1] == sum[2] && sum[2] == sum[3]) {
			istrue = 1;
		} else {
			istrue = 0;
		}

		if (istrue == 0) {
			System.out.println("not magic");
		}
		if (istrue == 1) {
			System.out.println("magic");
		}
	}

}