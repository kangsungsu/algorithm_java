package algorithm.d0929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_4485_녹색옷입은애가젤다지 {
	static int n;
	static int map[][];
	static boolean visited[][];
	static int sum=0;
	static int max=Integer.MAX_VALUE;
	static int dx[]= {0,1,0,-1};
	static int dy[]= {1,0,-1,0};
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int t=1;
		while(true) {
			n=Integer.parseInt(in.readLine());
			if(n==0)break;
			map=new int[n][n];
			visited=new boolean[n][n];
	
			for(int i=0;i<n;i++) {
				
				StringTokenizer token=new StringTokenizer(in.readLine());
				for(int j=0;j<n;j++) {
					map[i][j]=Integer.parseInt(token.nextToken());
				}
			}
			sum=map[0][0];
			visited[0][0]=true;
			max=Integer.MAX_VALUE;
			dfs(0,0);
			System.out.println("Problem "+t+++": "+max);
		}
	}
	
	public static class Point{
		int x,y;
		boolean nMap[][];
		
	}
	public static void dfs(int x,int y) {
		if(max<sum)return;
		if(x==n-1 && y==n-1) {
			//System.out.println(sum);
			if(sum<max)max=sum;
			return;
		}
		for(int i=0;i<4;i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			if(nx<0||nx>=n|| ny<0||ny>=n||visited[nx][ny])continue;
			sum+=map[nx][ny];
			visited[nx][ny]=true;
			dfs(nx,ny);
			sum-=map[nx][ny];
			visited[nx][ny]=false;
		}
		return;
		
	}
	

}
