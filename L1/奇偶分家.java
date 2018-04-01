package L1;

import java.util.Scanner;

public class ∆Ê≈º∑÷º“ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cur;
		int count = 0;
		for (int i = 0; i < N; i++) {
			cur = sc.nextInt();
			if (cur % 2 == 0)
				count++;
		}
		System.out.println(N-count + " " + count);
			
	}

}
