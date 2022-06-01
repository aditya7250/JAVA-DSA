package Dsa_problem;
import java.util.Scanner;
public class HollowRombusLadder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();		
		for (int i = 1 ; i <= rows; i++ ) 
		{
			for (int j = 1 ; j <= rows - i; j++ ) 
			{
				System.out.print(" ");
			}
			for (int k = 1 ; k <= rows; k++ ) 
			{
				if (i == 1 || i == rows || k == 1 || k == rows) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}