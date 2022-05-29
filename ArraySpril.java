package Dsa_problem;
import java.util.*;
public class ArraySpril {

	public static void main(String[] args) {
	
		    Scanner sc = new Scanner(System.in);
		    int row = sc.nextInt();
		    int clm = sc.nextInt();
		    int[][] arr = new int[row][clm];
		    for (int i = 0; i < arr.length; i++) {
		        for (int j = 0; j < arr[0].length; j++) {
		            arr[i][j] = sc.nextInt();
		        }
		    }
		printSpiral(arr);
		}
		public static void printSpiral(int[][] arr) {
		    int minr = 0;
		    int maxr = arr.length - 1;
		    int minc = 0;
		    int maxc = arr[0].length - 1;
		    int total = arr.length * arr[0].length;
		    int count = 0;
		    while (count < total) {
		    for (int i = minr; i <= maxr && count < total; i++) {
		        System.out.print(arr[i][minc] + ", ");
		        count++;
		    }
		    minc++;// minc ko inc hoga
		        for (int i = minc; i <= maxc && count < total; i++) {
		            System.out.print(arr[maxr][i] + ", ");
		            count++;
		        }
		        maxr--;// maxr cover hua h isko changes kro
		        for (int i = maxr; i >= minr && count < total; i--) {
		            System.out.print(arr[i][maxc] + ", ");
		            count++;
		        }
		        maxc--;// max col colcover hua h isko changes kro
		        for (int i = maxc; i >= minc && count < total; i--) {
		            System.out.print(arr[minr][i] + ", ");
		            count++;
		        }
		        minr++;// minr cover hua h isko changes kro
		}
		    System.out.print("END");
		}
		}