
public class ArrayMaxiumValue {

	public static void main(String[] args) {
		int[] arr = { 10, -3, 90, 7, -9, 79, -18, 902 };
		System.out.println(Maxium(arr));

	}

	public static int Maxium(int[] arr) {

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		return max;

	}

}
