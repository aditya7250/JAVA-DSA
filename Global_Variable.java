package Array_Java;

public class Global_Variable {
    static int val = 100;//for global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Hey");
   int x= 60;
   fun(x);
   System.out.println(val);
	}
	
	 public static void fun(int x) {
		 int a=90;
		 System.out.println(x);
		 int val= 40;//local variable
		 System.out.println(val);
	 }
	 
	 public static void fun2(int x) {
		  int a2 = 50;
		  System.out.println(x);
		 
	 }

}
