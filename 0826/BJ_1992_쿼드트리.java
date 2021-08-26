package algorithm.d0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1992_쿼드트리 {
	static int [][]arr;
	static int n;
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(in.readLine());
		//sb.append("(");
		arr=new int[n][n];
		for(int i=0;i<n;i++) {
			String []sa=in.readLine().split("");
			for(int j=0;j<n;j++) {
				arr[i][j]=Integer.parseInt(sa[j]);
				
			}
			
		}
		
		solution(n,0,0);
		System.out.println(sb.toString());
		
	}
	static void solution(int cnt,int x,int y) {
		//System.out.println(cnt+" "+x+" "+y);
		if(cnt==1) {
			sb.append(arr[x][y]);
			return;
		}
		int temp=arr[x][y];
		boolean check = false;
		outer:for(int i=x;i<cnt+x;i++) {
			for(int j=y;j<cnt+y;j++) {
				if(arr[i][j]!=temp) {
					check=true;
					break outer;
				}
			}
		}
		//System.out.println(check);
		//System.out.println(sb.toString());
		if(check==false) {
			sb.append(temp);
			return;
		}
		sb.append("(");
		solution(cnt/2,x,y);
		solution(cnt/2,x,y+cnt/2);
		solution(cnt/2,x+cnt/2,y);
		
		solution(cnt/2,x+cnt/2,y+cnt/2);
		sb.append(")");
	}

}
