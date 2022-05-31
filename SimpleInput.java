package Dsa_problem;
import java.util.*;
public class SimpleInput {
    public static void main(String args[]) {
  int sum = 0;
Scanner sc = new Scanner(System.in);
while( true){
      int n = sc.nextInt();
      sum+=n;
      if(sum<0){
          break;
      }
        System.out.println(n);
}
    }
}