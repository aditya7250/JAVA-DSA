package Dsa_problem;

//public class boaardpath {

	import java.util.*;
	public class Main {
	    public static void main(String args[]) {
	      Scanner sc=new Scanner(System.in);
	        int N=sc.nextInt();
	        int M=sc.nextInt();
	       System.out.println("\n"+boardpath(M,N,0,""));
	    }
	    public static int boardpath(int M,int end,int curr,String ans) {
	        if(curr==end) {
	            System.out.print(ans+" ");
	            return 1;
	        }
	        if(curr>end) {
	            return 0;
	        }
	        int count=0;
	        for(int dice=1;dice<=M&& dice+curr<=end;dice++){//change
	           count=count+boardpath(M,end,curr+dice,ans+dice);
	        }
	        return count;
	    }
	}
