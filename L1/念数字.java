package L1;

import java.util.Scanner;

public class ÄîÊý×Ö {
	
//	0: ling
//	1: yi
//	2: er
//	3: san
//	4: si
//	5: wu
//	6: liu
//	7: qi
//	8: ba
//	9: jiu
	static String s[] = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if (str.charAt(0) == '-') {
			System.out.print("fu");
		} else {
			System.out.print(s[str.charAt(0) - 48]);
		}
		
		for (int i = 1; i < str.length(); i++) {
			System.out.print(" " + s[str.charAt(i) - 48]);
		}
		System.out.println();

	}

}
