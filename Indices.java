package Dsa_problem;
import java.util.Scanner;
public class Indices {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     //    int[] arr = {2, 13, 7, 5, 3, 4, 5, 6, 9, 3};
     int n = sc.nextInt();
     int[] arr = new int[n];
     for (int i = 0; i < arr.length; i++) {
         arr[i] = sc.nextInt();
     }
     int item = sc.nextInt();
     FirstIndex(arr, 0, item);
 }
 public static void  FirstIndex(int[] arr, int i, int item) {
     if (i == arr.length) {
         return ;
     }
     if (arr[i] == item) {
         System.out.print(i + " ");
     }
      FirstIndex(arr, i + 1, item);
 }
}
