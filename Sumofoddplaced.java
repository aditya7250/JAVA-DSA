package Dsa_problem;
import java.util.*;
public class Sumofoddplaced {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddSum=0;
        int evenSum=0;
        int num=n;
        int c=1;
        while(num!=0) {
            int rem = num%10;
            if(c%2==0){
                evenSum+=rem;
            }else{
                oddSum+=rem;
            }
            num=num/10;
            c++;
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
    