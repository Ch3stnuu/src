package L1;

import java.util.Scanner;

public class ���°���һ�𻭷��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String c = sc.next();
		String s = "";
		for (int i = 0 ; i < n; i++)
			s += c;
		for (int i = 0; i < (n + 1) / 2; i++)
			System.out.println(s);
	}

}
