package L1;

import java.util.Scanner;

public class 正整数A加B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String str[] = s.split(" ");
		if (str.length > 2) {
			System.out.println("? + ? = ?");
			return;
		}
		boolean flag = false;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) < '0' || str[i].charAt(j) > '9') {
					str[i] = "?";
					flag = true;
					break;
				}
			}
		}
		if (!flag) {
			int a = (Integer.parseInt(str[0]));
			int b = (Integer.parseInt(str[1]));
			String  abs = a + b + "";
			if(a > 1000 || a < 1) {
				str[0] = "?";
				abs = "?";
			}
			if(b > 1000 || b < 1) {
				str[1] = "?";
				abs = "?";
			}
			System.out.println(str[0] +" + "+ str[1] + " = " + abs);
		} else {
			System.out.println(str[0] +" + "+ str[1] + " = ?");
		}
		
		
	}

}
