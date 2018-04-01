package L1;

import java.util.HashSet;
import java.util.Scanner;

public class ³öÉúÄê {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int n = sc.nextInt();
		String s = "";
		HashSet<Integer> set;
		for (int i = y; ; i++) {
			set = new HashSet<Integer>();
			s = "" + i;
			int len = s.length();
			if (len < 4) {
				for (int k = 0; k < 4 - len; k++) {
					s = "0" + s;
				}
			}
			for (int j = 0; j < s.length(); j++)
				set.add(s.charAt(j) - 48);
			if (set.size() == n) {
				System.out.println(i - y + " " + s);
				return;
			}
		}
	}

}
