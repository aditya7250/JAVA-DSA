package Dsa_problem;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		char grid[][] = new char[N][M];
		for (int i = 0; i < grid.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				grid[i][j] = s.charAt(j);
			}
		}
		int ans[][] = new int[N][M];
		printpath(grid, 0, 0, ans);
	}

	static boolean flag = false; // for printing the first solution which is rightmost path

	public static void printpath(char grid[][], int cr, int cc, int ans[][]) {

		if (cc == grid[0].length - 1 && cr == grid.length - 1 && flag == false) { // flag=false implies that till now
																					// you not get solution then run
			if (grid[cr][cc] == 'O') {
				// if you find your first solution
				flag = true; // mark that you printed your ans
				ans[cr][cc] = 1;
				display(ans);
				ans[cr][cc] = 0;
			}
			return;
		}
		// avoid unnecessary run if you find your solution already
		if (cc < 0 || cc >= grid[0].length || cr < 0 || cr >= grid.length || grid[cr][cc] == 'X' || flag == true) {
			return;
		}
		// right path first then down
		int r[] = { 0, 1 };
		int c[] = { 1, 0 };

		grid[cr][cc] = 'X';
		ans[cr][cc] = 1;

		for (int i = 0; i < c.length; i++) {
			printpath(grid, cr + r[i], cc + c[i], ans);
		}

		grid[cr][cc] = 'O';
		ans[cr][cc] = 0;

	}

	public static void display(int ans[][]) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println(); // newline after printing each row
		}

		System.out.println();
	}
}