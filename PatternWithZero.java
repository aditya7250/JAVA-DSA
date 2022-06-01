package Dsa_problem;
import java.util.Scanner;
public class PatternWithZero {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int star = 1;
	int row = 1;
	// int value=row;
	while (row <= n) {
		int i = 1;
		int value = row;
		while (i <= star) {
			if (i == 1 || i == star) {
				System.out.print(value + " ");
			} else {
				System.out.print(0 + " ");
			}
			i = i + 1;
		}
		star = star + 1;
		row = row + 1;
		System.out.println();
	}
}
}
