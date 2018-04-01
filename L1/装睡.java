package L1;

import java.util.Scanner;

public class װ˯ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while (n-- != 0) {
			String[] s = sc.nextLine().split(" ");
			if(Integer.parseInt(s[1]) < 15 || Integer.parseInt(s[1]) > 20 || Integer.parseInt(s[2]) < 50 || Integer.parseInt(s[2]) > 70) {
				System.out.println(s[0]);
			}
		}
		
	}

}
