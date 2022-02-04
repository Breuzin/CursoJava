package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt(); // número de linhas
		int n = sc.nextInt(); // número de colunas

		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.print("Left: ");
						System.out.println(mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.print("Top: ");
						System.out.println(mat[i - 1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.print("Right: ");
						System.out.println(mat[i][j + 1]);
					}
					if (i < mat.length-1) {
						System.out.print("Down: ");
						System.out.println(mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}

}
