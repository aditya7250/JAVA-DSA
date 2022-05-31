package Dsa_problem;
import java.util.*;
public class RevisingQuardticEqution {
    public static void main(String args[]) {
 Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int discriminant=(int)Math.pow(b, 2)-4*a*c;
        if(discriminant>0) {
            int root1=(-b+(int)Math.sqrt(discriminant))/(2*a);
            int root2=(-b-(int)Math.sqrt(discriminant))/(2*a);
            System.out.println("Real and Distinct");
            System.out.println(Math.min(root1,root2)+" "+Math.max(root1,root2));
        }
        else if(discriminant==0) {
            int root=-b/(2*a);
            System.out.println("Real and Equal");
            System.out.println(root+" "+root);
        }
        else {
            int realpart=-b/(2*a);
            int imgPart=(int)Math.sqrt(-discriminant)/(2*a);
             System.out.println("Imaginary");
            //System.out.println("no need to print the root");
        }
    }
}