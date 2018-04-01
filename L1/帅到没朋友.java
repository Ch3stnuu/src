package L1;

import java.util.Scanner;

public class ÀßµΩ√ª≈Û”— {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean a[] = new boolean[99999+1];
		
		int k;
		while (N--  != 0) {
			k = sc.nextInt();
			if (k == 1) {
				sc.nextInt();
				continue;
			}
			while (k-- != 0) {
				int p = sc.nextInt();
				a[p] = true;
			}
		}
		boolean count = false;
		int M = sc.nextInt();
		int p;
		while (M-- != 0) {
			p = sc.nextInt();
			if (!a[p]) {
				if(!count)
					System.out.printf("%05d",p);
				else
					System.out.printf(" %05d" ,p);
				a[p] = true;
				count = true;
			}
		}
		if(!count) {
			System.out.println("No one is handsome");
		} else {
			System.out.println();
		}
		
	}

}
