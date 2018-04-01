package L1;

import java.util.Scanner;

public class µãÔÞ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] t = new int[1001];
		int N = sc.nextInt();
		while (N-- != 0) {
			int k = sc.nextInt();
			while (k-- != 0) {
				t[sc.nextInt()]++;
			}
		}
		int max = -1;
		int cur = -1;
		for (int i = 1000; i >= 1; i--) {
			if(t[i] > max) {
				max = t[i];
				cur = i;
			}
		}
		System.out.println(cur + " " + max);
		
	}

}
