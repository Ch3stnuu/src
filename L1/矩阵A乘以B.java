package L1;

import java.util.Scanner;

public class æÿ’ÛA≥À“‘B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Ra = sc.nextInt();
		int Ca = sc.nextInt();
		int[][] A = new int[Ra][Ca];
		for (int i = 0; i < Ra; i++)
			for (int j = 0; j < Ca; j++)
				A[i][j] = sc.nextInt();
		
		int Rb = sc.nextInt();
		int Cb = sc.nextInt();
		int[][] B = new int[Rb][Cb];
		for (int i = 0; i < Rb; i++)
			for (int j = 0; j < Cb; j++)
				B[i][j] = sc.nextInt();
		
		if(Ca != Rb) {
			System.out.println("Error: " + Ca + " != " + Rb);
			return;
		}
		int[][] C = new int[Ra][Cb];
		for (int i = 0; i < Ra; i++) {
			for (int j = 0; j < Ca; j++) {
				if (A[i][j] == 0) 
					continue;
				for (int k = 0; k < Cb; k++)
					C[i][k] += A[i][j] * B[j][k]; 
			}
		}
		System.out.println(Ra + " " + Cb);
		for (int i = 0; i < Ra; i++) {
			for (int j = 0; j < Cb; j++) {
				if(j == 0)
					System.out.print(C[i][j]);
				else {
					System.out.print(" " + C[i][j]);
				}
			}
			System.out.println();
		}
	}

}
