package L1;

import java.util.Scanner;

public class 到底有多二 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length();
		double d = 1.0;
		if (s.charAt(0) == '-') {
			d *= 1.5;
			len--;
		}
		if (s.charAt(s.length() - 1) % 2 == 0) {
			d *= 2.0;
		}
		int count = 0;
		for (int i = 0; i < s.length() ; i++)
			if (s.charAt(i) == '2')
				count++;
		System.out.printf("%.2f%%",count / (1.0 * len) * d * 100);
		
	}

}
