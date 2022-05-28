package Dsa_problem;

//public class Gentrates {

	import java.util.*;
	public class Gentrates {
	    public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			gp(n,0,0,"");
		}
		public static void gp(int n,int open,int c,String ans) {
			if(open==n && c==n) {
				System.out.println(ans);
				return;
			}
			if(c<open) {
				gp(n,open,c+1,ans+")");
			}
			if(open<n) {
				gp(n,open+1,c,ans+"(");
			}
			
		}
	}