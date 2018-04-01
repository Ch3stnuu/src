package L1;

import java.util.Scanner;

public class 到底是不是太胖了 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int H,W;
		double standard;
		while (N-- != 0) {
			H = sc.nextInt();
			W = sc.nextInt();
			standard = (H - 100) * 0.9 * 2  ; 
			if (Math.abs(W - standard) < standard * 0.1) {
				System.out.println("You are wan mei!");
			} else if (W > standard) {
				System.out.println("You are tai pang le!");
			} else {
				System.out.println("You are tai shou le!");
			}
		}
	}

}
