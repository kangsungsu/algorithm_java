package algorithm.d0819;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ_1987_알파벳 {
	static int[]dx= {0,1,0,-1};
	static int[]dy= {1,0,-1,0};
	static char[][]arr;
	static int r,c;
	static int max=1;
	static ArrayList<Character> list=new ArrayList<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(in.readLine()," ");
		r=Integer.parseInt(token.nextToken());
		c=Integer.parseInt(token.nextToken());
		arr=new char[r][c];
		for(int i=0;i<r;i++) {
			String sa[]=in.readLine().split("");
			for(int j=0;j<c;j++) {
				arr[i][j]=sa[j].charAt(0);
				
			}
		}
		
		list.add(arr[0][0]);
		
		dfs(0,0);
		System.out.println(max);
	}
	static void dfs(int x,int y) {
		for(int i=0;i<4;i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			if(nx<0 || nx>=r || ny<0 ||ny>=c)continue;
			if(list.contains(arr[nx][ny])) {
				continue;
			}
			list.add(arr[nx][ny]);
			max=max>list.size()?max:list.size();
			dfs(nx,ny);
			list.remove(list.size()-1);
			
		}
	}

}
