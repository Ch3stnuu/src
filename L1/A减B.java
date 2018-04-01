package L1;

import java.util.Scanner;

public class A¼õB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String c = sc.nextLine();
		for (int i = 0; i < c.length(); i++) {
			s = s.replace("" + c.charAt(i),"");
		}
		System.out.println(s);	
		
	}

}
