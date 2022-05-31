package Dsa_problem;
import java.util.Scanner;
public class Conversion {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int min_far =sc.nextInt();
        int max_far = sc.nextInt();
        int steps = sc.nextInt();
        float frac = 5.0f/9;

         for(int i=min_far; i<=max_far; i+=steps){
             System.out.print(i + " ");
             int celsius = 0;
             int diff = i - 32;
             celsius =(int) (frac * diff);
             System.out.print(celsius);
             System.out.println();
         }
    }