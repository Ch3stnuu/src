package L1;

import java.util.Scanner;

public class 查验身份证 {
	
	static int a[] = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
	static int z[] = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		boolean mainFlag = false;
		while (N-- != 0) {
			String s = sc.nextLine();
			int sum = 0;
			boolean flag = false;
			for (int i = 0; i < 17; i++) {
				char c = s.charAt(i);
				if(c < '0' || c > '9') {
					flag = true;
					break;
				}
				sum += (c - 48) * a[i] % 11;
			}
			if (flag) {
				System.out.println(s);
				continue;
			}
			if (z[sum % 11]  != s.charAt(17)) {
				mainFlag = true;
				System.out.println(s);
			}
		}
		if(!mainFlag)
			System.out.println("All passed");
	}

}
