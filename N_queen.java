package Dsa_problem;

//public class N_queen {
//
//	public static void main(String[] args) {
	
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[][] board=new boolean[n][n];
        int count = n_queen(board,n,0,n,"");
        System.out.println();
        System.out.println(count);
    }
    public static int n_queen(boolean[][] board, int rq ,int row,int tq,String ans)
    {
        //positive base case
        if(rq==0){
           System.out.print(ans+" ");
           return 1;
        }
        //negative base case
        if(row>=tq)
        return 0;
        int count=0;
        //recursive calls
        for(int col=0;col<tq;col++)
        {
            if(is_safe(board,row,col,tq))
            {
                board[row][col]=true;
                count+= n_queen(board,rq-1,row+1,tq,ans+"{"+(row+1)+"-"+(col+1)+"} ");
                //backtrack
                board[row][col]=false;
            }
        }
        return count;
    }
    public static boolean is_safe(boolean[][] board, int row, int col,int n)
    {
        //check column
        int r=row;
        while(r>=0)
        {
            if(board[r][col]==true)
            return false;
            r--;
        }
        //check row
        r=row;
        int c=col;
        while(r>=0&& c<n)
        {
            if(board[r][c]==true)
            return false;
            r--;
            c++;
        }
        //check diagonal
        r=row;
        c=col;
        while(r>=0&&c>=0 )
        {if(board[r][c]==true)
        return false;
            c--;
            r--;
        }
        return true;
    }