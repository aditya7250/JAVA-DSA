package Dsa_problem;

//public class Genrates1 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		import java.util.*;
		public class Genrates1 {
		   public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        int t=sc.nextInt();
		        while (t--!=0){
		            String s=sc.next();
		            generateString(s,"");
		            System.out.println();
		        }
		    }
		    private static void generateString(String s, String s1) {
		        if(s.length()==0){
		            System.out.print(s1+" ");
		            return;
		        }
		        char ch=s.charAt(0);
		        if(ch=='?'){
		            generateString(s.substring(1),s1+0);
		            generateString(s.substring(1),s1+1);
		        }
		        else {
		            generateString(s.substring(1), s1 + ch);
		        }
		    }
		}