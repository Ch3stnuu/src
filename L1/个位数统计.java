package L1;

import java.util.Scanner;

public class 个位数统计 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a[] = new int [10];
		for(int i = 0; i < s.length(); i++) {
			a[(s.charAt(i))-48]++;
		}
		for(int i = 0; i < 10; i++)
			if(a[i] != 0)
				System.out.println(i + ":" + a[i]);
	}

}
