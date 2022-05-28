package Dsa_problem;

//public class Subset_Problem {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub

		import java.util.*;
     public class Main {
		    static int count = 0;
		    public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        int N=sc.nextInt();
		        int arr[]=new int[N];
		        for(int i=0;i<arr.length;i++) {
		            arr[i]=sc.nextInt();
		        }
		        int target=sc.nextInt();
		        sumofset(arr,0,"",0,target);
		        System.out.println();
		        System.out.println(count);
		    }
		    public static void sumofset(int arr[],int idx,String ans,int sos,int target) {
		        if(idx==arr.length) {
		            if(sos==target) {
		                System.out.print(ans+" ");
		                count++;
		            }
		           return;
		        }
		        sumofset(arr,idx+1,ans+arr[idx]+" ",sos+arr[idx],target);
		        sumofset(arr,idx+1,ans,sos,target);
		    }
		}