package Apnacollege_Array;

//public class Problem_9 {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements : ");
        // input by user one by one
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // output showing on the screen...

        System.out.println("These are the elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // maximum of value...
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum value is : " + max);

    }
}
