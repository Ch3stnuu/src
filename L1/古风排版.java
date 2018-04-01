package L1;

import java.util.Scanner;

public class ¹Å·çÅÅ°æ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int len = s.length();
		if (len % N == 0) {
			for (int i = N; i >= 1; i--) {
				for (int j = len - i; j >= 0; j -= N) {
					System.out.print(s.charAt(j));
				}
				System.out.println();
			}
		}
		else {
			int l = N - len % N;
			for (int i = 0; i < l; i++) {
				s += " ";
			}
			len = s.length();
			for (int i = N; i >= 1; i--) {
				for (int j = len - i; j >= 0; j -= N) {
					System.out.print(s.charAt(j));
				}
				System.out.println();
			}
			
		}
	}

}
