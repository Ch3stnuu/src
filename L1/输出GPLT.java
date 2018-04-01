package L1;

import java.util.Scanner;

public class Êä³öGPLT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a[] = new int[4];
		String str[] = { "G", "P", "L", "T" };
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'G' || c == 'g')
				a[0]++;
			if (c == 'P' || c == 'p')
				a[1]++;
			if (c == 'L' || c == 'l')
				a[2]++;
			if (c == 'T' || c == 't')
				a[3]++;
		}

		while (true) {
			for (int i = 0; i < 4; i++) {
				if (a[i] > 0) {
					System.out.print(str[i]);
					a[i]--;
				}
			}
			if(a[0]==0&&a[1]==0&&a[2]==0&&a[3]==0)
				return;
		}
	}

}
