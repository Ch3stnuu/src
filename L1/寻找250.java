package L1;

import java.math.BigInteger;
import java.util.Scanner;

public class я╟ур250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		BigInteger big = BigInteger.ONE;
		BigInteger xBig = new BigInteger("" + x);
		for (int i = 1;;i++) {
			if(big.mod(xBig) == BigInteger.ZERO) {
				System.out.println(big.divide(xBig) + " " + i);
				return;
			}
			big = big.multiply(BigInteger.TEN).add(BigInteger.ONE);
		}
		
	}

}
