package L1;

import java.util.Scanner;

public class ´òÓ¡É³Â© {

	public static void main(String[] args) {
		int a[] = new int[1000];
		int b[] = new int[1000];
		a[1] = b[1] = 1;

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int N = Integer.parseInt(s.substring(0, s.length() - 2));
		s = s.substring(s.length() - 1, s.length());

		int curI = 2;
		for (;; curI++) {
			b[curI] = b[curI - 1] + 2;
			a[curI] = a[curI - 1] + 2 * b[curI];
			if (a[curI] > N) {
				curI--;
				break;
			}
		}
		for (int i = curI; i >= 1; i--) {
			if (i == curI) {
				for (int j = 0; j < b[i]; j++)
					System.out.print(s);
			} else {
				for (int j = 0; j < (b[curI] - b[i]) / 2; j++)
					System.out.print(" ");
				for (int j = 0; j < b[i]; j++)
					System.out.print(s);
			}
			System.out.println();
		}
		for (int i = 2; i <= curI; i++) {
			if (i == curI) {
				for (int j = 0; j < b[i]; j++)
					System.out.print(s);
			} else {
				for (int j = 0; j < (b[curI] - b[i]) / 2; j++)
					System.out.print(" ");
				for (int j = 0; j < b[i]; j++)
					System.out.print(s);
			}
			System.out.println();
		}
		
//		System.out.println(curI);
		System.out.println(N - a[curI]);

	}

}
