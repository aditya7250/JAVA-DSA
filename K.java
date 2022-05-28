package Dsa_problem;

import java.util.Scanner;

public class K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt(); // take input of value for which you want to find first index of
		System.out.println(FistIndex(arr, 0, m)); // call and print the index
	}

	public static int FistIndex(int[] arr, int i, int item) {
		if (i == arr.length) {
			return -1;
		}
		if (arr[i] == item) {
			return i;
		}
		return FistIndex(arr, i + 1, item);

	}

}
