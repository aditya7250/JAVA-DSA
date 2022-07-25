package Assignment5;

public class SquareProgram {
		 static int square(int a) { 
			  int square = a*a;
			  return square;
		 }
		   public static void main (String[]args) {
			   java.util.Scanner sc=new java.util. Scanner( System.in );
				
				System.out.println("Enter a no.: ");
				    int a = sc.nextInt();
				      int Ans = square(a);
				      System.out.println("Square of "+a +" is "+ Ans);
			   }
}
