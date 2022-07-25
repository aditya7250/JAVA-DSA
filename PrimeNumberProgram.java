package Assignment5;

public class PrimeNumberProgram {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a no.: ");
		int n=sc.nextInt();
		if(n<2) {
			System.out.println("Invalid Number");
		}else {
		boolean Ans = prime(n);
//		System.out.println(Ans);
		
		if (Ans) {
			System.out.println(n+" is a prime");
		}else {
			  System.out.println(n+" is not Prime ");
		}
	}
	}
	  public static boolean prime(int n) {
		 for(int i=2; i<n; i++) {
			  if (n%i==0) {
				  return false;
			  }
		 }
		 return true;
		   
	  }
}