package L1;

import java.util.Scanner;


public class N个数求和 {
	
	static class Fraction {
		long ra;
		long rb;
		static long gcd (long a, long b) {
			if (b == 0)
				return a;
			return gcd(b, a % b);
		}
		public Fraction(long a, long b) {
			this.ra = a;
			this.rb = b;
			long k = 1;
			if (b != 0)
				k = gcd(ra, rb);
			if (k > 1) {
				ra /= k;
				rb /= k;
			}
		}
		public Fraction add(Fraction x) {
			if (ra == 0 && rb == 0)
				return x;
			return new Fraction(((((rb*x.rb)/gcd(rb, x.rb))/rb)*ra +(((rb*x.rb)/gcd(rb, x.rb))/x.rb)*x.ra),(rb*x.rb)/gcd(rb, x.rb)) ;
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Fraction f1 = new Fraction(0, 0);
		while (n-- != 0) {
			String s = sc.next();
//			System.out.println(s);
			String[] str = s.split("/");
			long a = Long.parseLong(str[0]);
			long b = Long.parseLong(str[1]);
//			System.out.println(a + " " + b);
			f1 = f1.add(new Fraction(a, b));
		}
		if (f1.ra % f1.rb == 0) {
			System.out.println(f1.ra / f1.rb);
		} else {
			if (f1.ra > f1.rb) {
				System.out.println(f1.ra / f1.rb + " " + f1.ra % f1.rb + "/" + f1.rb);
			} else {
				System.out.println(f1.ra + "/" + f1.rb);
			}
		}
	}

}
