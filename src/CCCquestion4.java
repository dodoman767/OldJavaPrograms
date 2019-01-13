import java.io.*;
import java.text.*;
import java.util.*;

public class CCCquestion4 {

	public static void main(String str[]) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.########");
		Random generator = new Random();

		System.out.println("Enter time");
		String time = stdin.readLine();
		String[] hourmin = (time.split(":"));
		int hour, minute;
		hour = Integer.parseInt(hourmin[0]);
		minute = Integer.parseInt(hourmin[1]);

		minute = hour * 60 + minute;

		int distanceleft = 120;
		int timespent = 0;
		int currenttime = minute;

		// 420 - 600 and 900 - 1140

		do {

			if (currenttime > 420 && currenttime < 600) {
				timespent = timespent + 10;
				distanceleft = distanceleft - 5;
				currenttime = currenttime + 10;
			} else if (currenttime > 900 && currenttime < 1140) {
				timespent = timespent + 10;
				distanceleft = distanceleft - 5;
				currenttime = currenttime + 10;
			} else {
				timespent = timespent + 10;
				distanceleft = distanceleft - 10;
				currenttime = currenttime + 10;
			}

		} while (distanceleft > 0);

		minute = minute + timespent;
		hour = minute / 60;
		minute = minute % 60;

		if (hour > 23) {
			hour = hour % 24;
		}

		System.out.println(hour + ":" + minute);

	}
}
