package Apnacollege_Array;

public class Problem_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   float [] marks = {20f , 25.5f , 67.6f , 78.9f, 100.0f};
      float sum = 0;
      for (float element:marks) {
    	  sum = sum+element;
      }
        System.out.println("The value of sum is "+ sum);
	}

}
