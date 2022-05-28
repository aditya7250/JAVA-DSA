package Dsa_problem;
import java.util.*;
public class NeumanLove {
	    public static void main(String args[]) {
	       Scanner sc=new Scanner(System.in);
	      int t=sc.nextInt();
	   while(t>0) {
	        long n=sc.nextInt();
	        long mult=1;
	        long ans=0;
	        while(n>0) {
	            long rem=n%10;
	            ans= ans+(mult*rem);
	            mult=mult*2;
	            n=n/10;
	        }
	        System.out.println(ans);
	    t--;
	   }
	    }
	}