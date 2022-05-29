package Dsa_problem;
import java.util.*;
public class PairOfRose {

	public static void main(String[] args) {
	
		         Scanner sc=new Scanner(System.in);
		         int t=sc.nextInt();
		         for(int i=0;i<t;i++){
		             int n=sc.nextInt();
		             int []arr=new int[n];
		             for(int j=0;j<n;j++){
		                   arr[j]=sc.nextInt();
		              }
		          Arrays.sort(arr);//change
		          int m=sc.nextInt();
		          pair_of_roses(arr,m);
		         }

		    }
		    public static void pair_of_roses(int[]arr,int m){
		        int temp1=0;
		        int temp2=0;
		        for(int i=0;i<arr.length;i++){
		            for(int j=i+1;j<arr.length;j++){
		                if(arr[i]+arr[j]==m){
		                   temp1=arr[i];
		                   temp2=arr[j];
		                }
		            }
		        }
		        System.out.println("Deepak should buy roses whose prices are "+ temp1 +" and "+temp2+".");
		    }
		}