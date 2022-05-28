package Dsa_problem;
import java.util.*;
public class Replacepie {
		    public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        int t = sc.nextInt();
		        while(t-- > 0) {
		            String str = sc.next();// next kro
		            String ans = "";
		            replacePi(str,ans);
		        }
		    }
		    public static void replacePi(String str,String ans) {
		        if(str.length() == 0) {
		            System.out.println(ans);
		            return;
		        }
		        if(str.length()>=2 && str.charAt(0) == 'p' && str.charAt(1) == 'i') {//leght ki condtion Add kro
		            ans += '3';
		            ans += '.';
		            ans += '1';
		            ans += '4';
		            replacePi(str.substring(2),ans);
		        }
		        else {
		            char ch = str.charAt(0);
		            replacePi(str.substring(1),ans+ch);
		        }
		    }
		}