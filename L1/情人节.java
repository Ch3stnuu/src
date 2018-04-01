package L1;

import java.util.Scanner;

public class ÇéÈË½Ú {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String A = "";
		String B = "";
		String C = "";
		while (true) {
			count++;
			C = sc.nextLine();
			if (count == 2) {
				A = C;
			}
			if (count == 14) {
				B = C;
			}
			if (C.equals(".")) {
				if (count > 14) {
					System.out.println(A + " and " + B + " are inviting you to dinner...");
				} else if (count <= 14 && count > 2) {
					System.out.println(A + " is the only one for you...");
				} else {
					System.out.println("Momo... No one is for you ...");
				}
				return;
			}
		}
	}

}
