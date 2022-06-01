package Dsa_problem;
import java.util.*;
public class Gcd {

	public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();    

    while (n1 % n2 != 0)
    {
      int remainder = n1 % n2;
      n1 = n2;
      n2 = remainder;
    }
    int gcd = n2;   
    System.out.println(gcd);
    
  }
}