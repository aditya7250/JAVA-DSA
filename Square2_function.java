package Eassy_java21;

public class Square2_function {
  public static int getsquare(int x) {
	  return  x*x;
  }	
	public static void main(String[] args) {
      for (int i=1; i<=10; i++) {
    	   int result = getsquare(i);
    	   System.out.println("The square of a number:" + i + " is " +result);
      }

	}

}
