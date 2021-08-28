package algorithm.d0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1018_체스판다시칠하기 {
	static char [][]board;
	static int min=Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(in.readLine()," ");
		int n=Integer.parseInt(token.nextToken());
		int m=Integer.parseInt(token.nextToken());
		board=new char[n][m];
		for(int i=0;i<n;i++) {
			String sa[]=in.readLine().split("");
			for(int j=0;j<m;j++)board[i][j]=sa[j].charAt(0);
			
		}
		for(int i=0;i<n-7;i++) {
			for(int j=0;j<m-7;j++) {
				dfs(i,j);
			}
		}
		System.out.println(min);
	}
	public static void dfs(int x, int y) {
		//System.out.println(x+" "+y);
		//System.out.println(x+" "+y);
		int a=0,b=0;
		char A='W';
		char B='B';
		for(int i=x;i<x+8;i++) {
			if(A=='W')A='B';
			else A='W';
			if(B=='W')B='B';
			else B='W';
			for(int j=y;j<y+8;j++) {
				//System.out.println(a+" "+b+" "+i+" "+j);
				if(board[i][j]!=A) {
					a++;
				}
				if(board[i][j]!=B)b++;
				
				if(A=='W')A='B';
				else A='W';
				if(B=='W')B='B';
				else B='W';
			}
		}
		
		//System.out.println(a);
		//System.out.println(b);
		int result=Math.min(a, b);
		min=Math.min(result, min);
	}

}
