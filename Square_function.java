package Eassy_java21;
import java.util.*;
public class Square_function {
    public static int square(int num) {
    	int square= num*num;
    	return square;
         }
    
    
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in) ;
		int a = sc.nextInt();
		int result;
		result=square(a);
		System.out.println("The square of number is :" + result);
		

	}

}
