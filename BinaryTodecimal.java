package Dsa_problem;
import java.util.*;
public class BinaryTodecimal {
  public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int mul=1;
		int ans=0;
		while(N>0)
		{
			int rem=N%10;
			ans=ans+mul*rem;
			 mul=mul*2;
			N/=10;
		}
		System.out.println(ans);		
			}
  }  