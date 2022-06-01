package Dsa_problem;
import java.util.*;
public class PatternRombus {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int star = 1;
        int space = n-1;
        int row = 1;
        int val = 1;
        while (row<=2*n-1){
            //space
            int i = 1;
            while(i<= space) {
                System.out.print("  ");
                i++;
            }
        
            // star
            int j = 1;
            int p = val;
            while (j<=star) {
                System.out.print(p +" ");
                //vertical mirror 
                if (j<=star/2){
                p++;
                }
                else{
                    p--;
                }
                j++;
            }

            //next row
            if (row<n){
                space--;
                star+=2;
                val++;
            }else{
                space++;
                star-= 2;
                val--;
            } 
             System.out.println();
             row++;
        }
            
    }
}
