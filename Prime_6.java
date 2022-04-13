
package Prime_Question;

import java.util.Scanner;

//public class Prime_6 {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n,r;
   System.out.print("Enter any number");
   Scanner ref= new Scanner(System.in);
   n= ref.nextInt();
   while(n>0)
   {
	   r=n%10;
	   System.out.print(r);
	   n=n/10;
   }
   }
	}
*/


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
   
    for(int i = 1, c=1; c <= n1;i++){
        int val = 3 * i + 2;
        if(val % n2 != 0){
            System.out.println(val+" ");
            c++;
        }
    }
}

