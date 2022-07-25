package Assignment5;

public class SimpleInterestProgram {
		static double si(double p,double r,int t) {
			return p*r*t/100;
		}
		public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			
			System.out.println("Enter Principle Amount: ");
			double p=sc.nextDouble();
			System.out.println("Enter Rate Of Interest: ");
			double r=sc.nextDouble();
			System.out.println("Enter Time Period: ");
			int t=sc.nextInt();
			
			double result=si(p,r,t);
			System.out.println("Simple Interest: "+result);
		}
	}
