package Dsa_problem;
import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<arr.length;i++)//change( we have to run for 0 to N-1)
        {
             arr[i]=sc.nextInt();
        }
        Reverse(arr);
        for(int k=0;k<arr.length;k++){//traverse from 0 to arr.length-1
             System.out.println(arr[k]);//print in next line
        }
    }
    public static void Reverse(int [] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }//added this bracket
    }
}