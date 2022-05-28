package Dsa_problem;
import java.util.*;
public class StringCompression {
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
       String s=sc.next();
       String res="";
       int i=0;
       while(i<s.length())
       {
            char y=s.charAt(i);
            int sum=1;
            res+=Character.toString(y);
            i++;
            while(i<s.length() && s.charAt(i)==y)
            {
                sum++;
                i++;
            }
            res+=Integer.toString(sum);
       }
       System.out.println(res);
    }
}