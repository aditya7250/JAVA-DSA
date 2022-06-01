package Dsa_problem;
import java.util.*;
public class MirrorStarPattern {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

         int row=1;
            int star=1;
            int space=n/2;

            
            while(row<=n)
            {

                int k=1;
                while(k<=space)
                {
                    System.out.print(" \t");
                    k++;
                }

                int j=1;
                while(j<=star)
                {
                    System.out.print("*\t");
                    j++;
                }

                if(row <= n/2){
                    space=space-1;
                star=star+2;
                }
                else{
                    space=space+1;
                    star=star-2;
                }
				row=row+1;
                System.out.println("\n");
                
                
            }
    }
}