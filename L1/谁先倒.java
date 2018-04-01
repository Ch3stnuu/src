package L1;

import java.util.Scanner;

public class Ë­ÏÈµ¹ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countA = 0;
		int countB = 0;
		int A = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		
		
		
		int ahan,ahua,bhan,bhua,hanSum;
		
		while (N-- != 0) {
			ahan = sc.nextInt();
			ahua = sc.nextInt();
			bhan = sc.nextInt();
			bhua = sc.nextInt();
			hanSum = ahan + bhan;
			if (ahua == hanSum && bhua != hanSum) {
				countA++;
				if (countA > A) {
					System.out.println("A");
					System.out.println(countB);
					return;
				}
			} else if (ahua != hanSum && bhua == hanSum) {
				countB++;
				if (countB > B) {
					System.out.println("B");
					System.out.println(countA);
					return;
				}
			} 
		}
	}

}
