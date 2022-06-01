package Dsa_problem;
import java.util.*;
public class Pattern_Mountain {
	
	public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nod = 1;
        int count = 1;
        int sp = n+1;

        for(int i = 1; i<=n; i++){

            for(int j = 1; j<=nod; j++){
                System.out.print(count+"\t");
                count++;
            }
            
            if(i==n){
                count--;
                nod--;                             
            }
            
            for(int j = 1; j<=sp; j++){
                System.out.print("\t");
            }
            
            for(int j = nod; j>=1; j--){
                count--;
                System.out.print(count+"\t");                
            }
            nod++;
            sp-=2;
            System.out.println();
        }
    }
}
