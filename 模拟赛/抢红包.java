package Ä£ÄâÈü;

import java.util.Arrays;
import java.util.Scanner;

public class ÇÀºì°ü {
	static class Person implements Comparable<Person>{
		double money = 0;
		int hongbaoCount = 0;
		int no = 0;
		
		public Person(int id) {
			this.no = id;
		}

		public Person(double money, int hongbaoCount, int no) {
			this.money = money;
			this.hongbaoCount = hongbaoCount;
			this.no = no;
		}

		@Override
		public int compareTo(Person o) {
			if (this.money > o.money) {
				return 1;
			} else if (this.money < o.money){
				return -1;
			} else {
				if (this.hongbaoCount > o.hongbaoCount)
					return 1;
				else if (this.hongbaoCount < o.hongbaoCount)
					return -1;
				else {
					return this.no > o.no ? -1 : 1;
				}
			}
		}
	}
	
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); 
		Person[] persons = new Person[N + 1];
		for (int i = 0; i <= N; i++) {
			persons[i] = new Person(i);
		}
		for (int i = 1; i <= N; i++) {
			int k = sc.nextInt();
			while (k-- != 0) {
				int nId = sc.nextInt();
				int p = sc.nextInt();
				persons[nId].money += p;
				persons[nId].hongbaoCount++;
				persons[i].money -= p;
			}
		}
		Arrays.sort(persons);
		for (int i = persons.length - 1; i >= 0 ; i--) {
			if (persons[i].no == 0)
				continue;
			System.out.printf("%d %.2f",persons[i].no, persons[i].money / 100);
			System.out.println();
		}
	}

}
