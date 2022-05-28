package Dsa_problem;
import java.util.*;
public class BookAlocation {
			public static void main(String args[]) {
				Scanner sc = new Scanner(System.in);
				int t = sc.nextInt();
				while (t-- > 0) {
					int nob = sc.nextInt();
					int nos = sc.nextInt();
					int[] pages = new int[nob];
					for (int i = 0; i < nob; i++) {
						pages[i] = sc.nextInt();
					}

					System.out.println(PagesAllocated(pages, nos));
				}
			}

			public static int PagesAllocated(int[] pages, int nos) {
				int lo = 0;
				int hi = 0;
				for (int i = 0; i < pages.length; i++) {
					hi = hi + pages[i];
				} 
				int ans = 0;
				while (lo <= hi) {
					int mid = (hi + lo) / 2;
					if (isPossible(pages, mid, nos) == true) {
						ans = mid;
						hi = mid - 1;
					} else {
						lo = mid + 1;
					}
				}
				return ans;
			}

			public static boolean isPossible(int[] pages, int mid, int nos) {
				int students = 1;
				int count_pages = 0;
				int i = 0;
				while (i < pages.length) {
					if (count_pages + pages[i] <= mid) {
						count_pages += pages[i];
						i++;
					} else {
						students++;
						count_pages = 0;
						if (students > nos) { 
							return false;
						}
					}

				}

				return true;
			}
		}
