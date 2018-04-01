package L1;

import java.util.ArrayList;
import java.util.Scanner;

public class Œ»”Æ {
	

	public static void main(String[] args) {
		String[] s = {"ChuiZi","Bu","JianDao"};
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String str = "";
		int count = 0;
		ArrayList<String> list = new ArrayList<String>();	
		while (true) {
			str = sc.nextLine();
			if (str.equals("End")) {
				break;
			}
			list.add(str);
		}
		for (int i = 0; i < list.size(); i++) {
			if (count == N) {
				count = 0;
				System.out.println(list.get(i));
			} else {
				count++;
				str = list.get(i);
				if (str.equals("JianDao")) 
					System.out.println("ChuiZi");
				if (str.equals("ChuiZi"))
					System.out.println("Bu");
				if (str.equals("Bu")) 
					System.out.println("JianDao");
			}
		}
		
		
		
		
		
//		
//		while (true) {
//			str = sc.nextLine();
//			count ++;
//			if (str.equals("End")) {
//				return;
//			}
//			if (str.equals("ChuiZi")) {
//				if (count == N + 1) {
//					System.out.println("ChuiZi");
//					count = 0;
//				} else {
//					System.out.println("Bu");
//				}
//				continue;
//			}
//			if (str.equals("Bu")) {
//				if (count == N + 1) {
//					System.out.println("Bu");
//					count = 0;
//				} else {
//					System.out.println("JianDao");
//				}
//				continue;
//			}
//			if (str.equals("JianDao")) {
//				if (count == N + 1) {
//					System.out.println("JianDao");
//					count = 0;
//				} else {
//					System.out.println("ChuiZi");
//				}
//				continue;
//			}
//		}
	}

}
