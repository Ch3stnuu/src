package L1;

import java.util.Scanner;

public class ÅĞ¶ÏËØÊı {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (N-- != 0) {
			int c = sc.nextInt();
			if (c == 1 || c == 0) {
				System.out.println("No");
				continue;
			}
			int len = (int)Math.sqrt(c);
			boolean flag = false;
			for ( int i = 2; i <= len; i++) {
				if(c % i == 0) {
					flag = true;
					System.out.println("No");
					break;
				}
			}
			if(!flag)
				System.out.println("Yes");
		}
		
		
		
	}

}
