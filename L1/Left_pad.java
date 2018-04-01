package L1;

import java.util.Scanner;

public class Left_pad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] s = sc.nextLine().split(" ");
		String str = sc.nextLine();
		int a = Integer.parseInt(s[0]); 
		
		if (str.length() > a) {
			System.out.println(str.substring(str.length() - a));
		} else {
			int len = a - str.length();
			for (int i = 0; i < len; i++)
				System.out.print(s[1]);
			System.out.println(str);
		}
		
		
	}

}
