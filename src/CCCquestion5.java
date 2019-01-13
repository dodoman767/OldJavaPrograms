import java.io.*;
import java.lang.reflect.Array;
import java.text.*;
import java.util.*;

public class CCCquestion5 {

	public static void sort(int[] intArray) {

		int n = intArray.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

				if (intArray[j - 1] > intArray[j]) {
					temp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = temp;
				}

			}
		}
	}

	public static void main(String str[]) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.########");

		System.out.println("question/people/dmojistan/pegland");
		int question = Integer.parseInt(stdin.readLine());
		int people = Integer.parseInt(stdin.readLine());
		String wholedmo = stdin.readLine();
		String wholepeg = stdin.readLine();
		String[] dmo = wholedmo.split(" ");
		String[] peg = wholepeg.split(" ");
		int[] dmoints = new int[people];
		int[] pegints = new int[people];

		for (int a = 0; a < people; a++) {
			dmoints[a] = Integer.parseInt(dmo[a]);
			pegints[a] = Integer.parseInt(peg[a]);
		}

		int[] total = new int[dmoints.length + pegints.length];
		
		for (int d = 0; d < dmoints.length; d++)
		{
			total[d] = dmoints[d];
		}
		for (int e = dmoints.length; e < dmoints.length+pegints.length; e++)
		{
			total[e] = pegints[e-dmoints.length];
		}
		
		
		sort(total);
		//for (int z = 0; z < total.length;z++)
		//{System.out.println(total[z]);}

		int min = 0;
		for (int g = 1 ; g < total.length; g = g+2)
		{
			min = min+total[g];
		}
		int max = 0;
		for (int h = total.length / 2; h < total.length;h++)
		{
			max = max + total[h];
		}
		
		if (question == 1) {System.out.println(min);}
		if (question == 2) {System.out.println(max);}
	}
}