package Dsa_problem;
import java.util.*;
public class PatternNumberLadder {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
     int n = sc.nextInt();
    for(int i=1; i<=n; i++){
          for(int j=1; j<=i; j++){
              count=count+1;
              System.out.print(count+"    ");
          }
          System.out.println( );
          }
    }
}
 


