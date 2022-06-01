package Dsa_problem;
import java.util.Scanner;
public class PatternTringle {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
		int nsp=n-1;
		int i=1;
		while(i<=n) {
			int s=1;
			while(s<=nsp) {
				System.out.print("  ");
				s++;
			}
			int j=1;
			int p=i;
			while(j<=2*i-1) {
				System.out.print(p+" ");
				
				if(j<i) {
					p++;
				}
				else {
					p--;
				}
				j++;
			}
			nsp--;
			i++;
			System.out.println();
		}
    }
}