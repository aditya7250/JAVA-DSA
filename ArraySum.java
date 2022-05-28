package Dsa_problem;
import java.util.*;
public class ArraySum {
		    public static void main (String args[]) {
		 Scanner sc=new Scanner (System.in);
		        int N=sc.nextInt();
		        int arr[]=new int [N];
		        for(int i=0;i<arr.length;i++) {
		            arr[i]=sc.nextInt();
		        }
		        int M=sc.nextInt();
		        int brr[]=new int [M];
		        for(int j=0;j<brr.length;j++) {
		            brr[j]=sc.nextInt();
		        }
		        int[] ans=new int[N>M?N:M];
		        int carry=0;
		        int i=arr.length-1;
		        int j=brr.length-1;
		        int k=ans.length-1;
		        while(k>=0) {
		            int sum=carry;
		            if(i>=0) {
		                sum+=arr[i];
		            }
		            if(j>=0) {
		                sum+=brr[j];
		            }
		            int q=sum/10;
		            int r=sum%10;
		            ans[k]=r;
		            carry=q;
		            i--;
		            j--;
		            k--;
		        }
		        if(carry!=0) {
		            System.out.print(carry+", ");//change
		        }
		        for(int val:ans) {
		            System.out.print(val +", ");
		        }
		       System.out.println("END");
		    }
		}
