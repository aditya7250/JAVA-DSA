package Dsa_problem;
import java.util.*;
public class BostonNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int temp = n;
        int num = 0;
        for(int i=2;i<=n;) {
            if(n % i == 0) {
                num = num + sumDigits(i);
                n = n / i;
            }
            else {
                i++;
            }
        }
        int sum_digits = sumDigits(temp);
        if(sum_digits == num) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
    public static int sumDigits(int n) {
        int sum = 0;
        while(n!=0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }