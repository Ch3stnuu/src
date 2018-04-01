package L1;

import java.util.Scanner;

public class ‘ƒ¿¿ “ {
	
	static class yue {
		String jieOrHuan = "";
		int time = 0;
		
		public yue() {			
		}

		public yue(String jieOrHuan, int time) {
			this.jieOrHuan = jieOrHuan;
			this.time = time;
		}
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		while (N-- !=0) {
			yue[] a = new yue [1001];
			for (int i = 0; i < 1001; i++)
				a[i] = new yue();
			String[] s;
			int index, time, count = 0, timeSume = 0;
			while (true) {
				s = sc.nextLine().split(" ");
				index = Integer.parseInt(s[0]);
				time = Integer.parseInt(s[2].substring(0, 2)) * 60 + Integer.parseInt(s[2].substring(3)); 
				if (index == 0) {
					break;
				}
				if (s[1].equals("S")) {
					a[index].time = time;
					a[index].jieOrHuan = "S";
				} else {
					if(a[index].jieOrHuan.equals("S")) {
						count++;
						timeSume += time - a[index].time;
						a[index].jieOrHuan = "";
					} 
				}
			}
			if (count != 0) {
				if (count == 1) {
					System.out.println(count + " " + timeSume  / count);
				}
				else {
					System.out.println(count + " " + (timeSume + 1) / count);
				}
					
			}
			else 
				System.out.println("0 0");
			
		}
	}

}
