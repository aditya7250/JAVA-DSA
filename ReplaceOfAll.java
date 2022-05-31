package Dsa_problem;
import java.util.*;
public class ReplaceOfAll {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long mul = 1;
        long ans = 0;
        if(n==0) {
            ans=5;
        } 
           while (n>0) {
               int rem = (int) (n%10);
               if(rem == 0) {
                   ans = ans +5*mul;
               } else{
                   ans = ans + rem * mul;
               }
                 n/=10;
                 mul = mul * 10;
           }
             System.out.println(ans);
               }
               }
           
    