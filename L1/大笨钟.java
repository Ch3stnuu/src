package L1;

import java.util.Scanner;

public class ¥Û±ø÷” {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dang = "Dang";
		String str = sc.nextLine();
		String[] s = str.split(":");
		int s0 = Integer.parseInt(s[0]);
		if (s[1].equals("00")) {
			if(s0 <= 12)
				System.out.println("Only " + str + ".  Too early to Dang.");
			else {
				for (int i = 0; i < s0 - 12; i++) {
					System.out.print(dang);
				}
				System.out.println();
			}
		} else {
			if(s0 <= 11)
				System.out.println("Only " + str + ".  Too early to Dang.");
			else {
				for (int i = 0; i < s0 - 12 + 1; i++) {
					System.out.print(dang);
				}
				System.out.println();
			}
		}
	}

}
