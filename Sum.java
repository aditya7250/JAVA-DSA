package Dsa_problem;
import java.util.*;
public class Sum {

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int j=0;
        int arr2[]=new int[N];
        while(j<t)
        {
            int needed=sc.nextInt();
            int y=(N-needed);
            for(int i=0;i<N;i++)
            {
                int pos=(i+y)%N;
                arr2[i]=arr[i]+arr[pos];
            }
            //arr=arr2;// you cant copy elements of one array to another like this. 
            for(int i=0;i<N;i++){
                arr[i]=arr2[i];
            }
           //next prep
           j++;
        }
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}