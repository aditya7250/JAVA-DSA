package Dsa_problem;
import java.util.*;
     public class Main {


		

		    public static void main(String args[]) {
		        Scanner sc=new Scanner(System.in);
		        int n= sc.nextInt();
		        int arr[]=new int[n];
		        for (int i=0;i<n;i++){
		            arr[i]= sc.nextInt();
		        }
		        int m=sc.nextInt();
		        int i= arr.length-1;
		        System.out.print(findingIndex(arr,m,i));
		        }
		    private static int findingIndex(int[] arr, int m,int i) {
		        if(i<0)
		        {
		            return -1;
		       }
		        if(arr[i]==m)
		        {
		            return i;
		        }
		       return  findingIndex(arr,m,i-1);
		    }

		}
