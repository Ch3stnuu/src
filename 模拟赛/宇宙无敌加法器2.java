package 模拟赛;

import java.util.Scanner;

public class 宇宙无敌加法器2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		String a = sc.nextLine();
		String b = sc.nextLine();
		while (a.length() != b.length()) {
			if (a.length() < b.length()) {
				a = "0" + a;
			} else if (b.length() < a.length()) {
				b = "0" + b;
			} 
		}
		String c = "";
		int len = a.length();
		int carry = 0;
		boolean flag = false;
		for (int i = 1; i <= len; i++) {
			int curA = a.charAt(a.length() - i) - 48;
			int curB = b.charAt(b.length() - i) - 48;
			int chushu = N.charAt(N.length() - i) - 48;
			if (chushu == 0)
				chushu = 10;
			
			int val = (curA + curB + carry) % chushu;
			c = val + c;
			carry = (curA + curB + carry) / chushu;
			if (i == len && carry != 0)
				flag = true;
		}
		if (flag)
			c =  carry + c;
		System.out.println(Long.parseLong(c));
		
	}

}
