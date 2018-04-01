package L1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Гізт {
	
	static String listToString (ArrayList<Integer> list) {
		
		String s = "";
		for (int i = 0; i < list.size() - 1; i++) {
			s += list.get(i) + ",";
		}
		s += list.get(list.size() - 1);
		return s;
	} 

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean[] a = new boolean[10];
		for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i) - 48] = true;
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 9; i >= 0; i--) {
			if (a[i]) {
				list.add(i);
			}
		}
		String result1 = "int[] arr = new int[]{" + listToString(list) + "};";
		System.out.println(result1);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0 ; i < s.length(); i++) {
			list1.add(list.indexOf(s.charAt(i) - 48));
		}
		String result2 = "int[] index = new int[]{" + listToString(list1) + "};";
		System.out.println(result2);
	
	}

}
