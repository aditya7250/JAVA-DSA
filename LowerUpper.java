package Dsa_problem;
import java.util.*;
public class LowerUpper {

	public static void main(String[] args) {
	
       Scanner sc =new Scanner(System.in);
        char n = sc.next().charAt(0);
        if(n >='a' && n <= 'z') {
            System.out.println("lowercase");
        } else if(n >= 'A' && n <= 'Z') {
            System.out.println("UPPERCASE");
        } else {
            System.out.println("Invalid");//small change
        }
    }
}
    