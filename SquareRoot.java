package Dsa_problem;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[]args ) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(root(n));
	}
	public static long root(long n) {
		long lo = 0;  // 0 is also possible square root
		long hi = n;
		long ans = 0;
		while (lo <= hi) {
			long mid = (hi+lo)/ 2;
			if (mid*mid<=n) {
				ans = mid;
				lo = mid+1;
			}
			else {
			hi= mid - 1;
			}
		}
		return ans;
	}
}