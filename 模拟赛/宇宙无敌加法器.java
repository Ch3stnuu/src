package 模拟赛;

import java.util.Scanner;

public class 宇宙无敌加法器 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = "";
		int len = Math.max(a.length(), b.length());
		int jinwei = 0;
		for (int i = 1; i <= len; i++) {
			int cura = 0;
			int curb = 0;
			if (a.length() - i >= 0)
				cura = a.charAt(a.length() - i) - 48;
			if (b.length() - i >= 0)
				curb = b.charAt(b.length() - i) - 48;
			int sum = cura + curb + jinwei;
			int chushu;
			if (i <= 20)
				chushu = N.charAt(N.length() - i) - 48;
			else {
				chushu = 10;
			}
			if (chushu == 0) 
				chushu = 10;
			jinwei = sum / chushu;
			int cur = sum % chushu;
			c = cur + c;
		}
		int i = 0;
		for (; i < c.length(); i++) {
			if (c.charAt(i) != '0')
				break;
		}
		if (c.substring(i).length() == 0)
			System.out.println(0);
		else System.out.println(c.substring(i));
	}

}
