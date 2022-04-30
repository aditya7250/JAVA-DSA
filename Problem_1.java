package Apnacollege_Array;

import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // int [] marks = new int[3];
  // int marks[]= new int [3];
   
   //marks[0]=95;//physics
   //marks[1]=90;//chemistry
   //marks[2]=85;//math
   
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int numbers[]= new int[size];
   for(int i =0; i<size; i++) {
       System.out.println(numbers[i]);
	}
}

}