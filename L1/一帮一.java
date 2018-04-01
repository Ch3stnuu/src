package L1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class “ª∞Ô“ª {
	
	public static void main(String[] args) {
		ArrayDeque<String> maleDeque= new ArrayDeque<String>();
		ArrayDeque<String> femaleDeque= new ArrayDeque<String>();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	
		int[] sexArray = new int[N];
		int sex;
		String name;
		for (int i = 0; i < N; i++) {
			sex = sc.nextInt();
			name = sc.next();
			sexArray[i] = sex;
			if(sex == 0) {
				femaleDeque.add(name);
			} else {
				maleDeque.add(name);
			}
		}
//		System.out.println(femaleDeque.pollFirst());
//		System.out.println(femaleDeque.pollLast());
//		System.out.println(maleDeque.pollFirst());
//		System.out.println(maleDeque.pollLast());
		for (int i = 0; ; i++) {
			if(sexArray[i] == 0) {
				System.out.print(femaleDeque.pollFirst()+" ");
				System.out.println(maleDeque.pollLast());
			} else {
				System.out.print(maleDeque.pollFirst()+" ");
				System.out.println(femaleDeque.pollLast());
			}
			if(femaleDeque.size() == 0)
				return;
		}
			
	}

}
