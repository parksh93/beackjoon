package bronze;

import java.util.Scanner;

public class Alarm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if (min < 45) {
			int m = 45 - min;
			if (hour == 0) {
				hour = 23;
			}else {
				hour -= 1;				
			}
			min = 60 - m;
			System.out.println(hour + " " + min);
		}else {
			System.out.println(hour + " " + (min - 45));
		}
	}
}
