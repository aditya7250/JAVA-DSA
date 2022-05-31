package Dsa_problem;
import java.util.*;
public class ChewbaccaNumber {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long a=n;
		long j=0;
		long i=1;
		long ans=0;
		while(a>0) {
			j++;
			a=a/10;
		}
		while(n>0) {
			long r=n%10;
			if(r==9&&i==j)
				ans+=(long)(Math.pow(10, i-1)*r);
		
			else if(r>4) {
			ans+=(long)(Math.pow(10, i-1)*(9-r));
			}
			else {
				ans+=(long)(Math.pow(10, i-1)*r);
			}
			i++;
			n=n/10;
		}
		System.out.println(ans);
    }
}