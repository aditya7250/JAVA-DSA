package Dsa_problem;
import java.util.Scanner;
public class ArrayTarget {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target=sc.nextInt();
        TargetSum(arr,target);
    }
    private static void TargetSum(int[] arr, int target) {
        // TODO Auto-generated method stub
        for(int i=0;i<arr.length;i++) {    // need to iterate all elements for making pairs
            for(int j=i+1;j<arr.length;j++) {    // +1 for subsequent elements to last so we make all pairs
                if(arr[i]+arr[j]==target) {
                  System.out.println(Math.min(arr[i],arr[j])+" and "+Math.max(arr[j],arr[i]));
                }
            }
        }
        
    }
}
    
