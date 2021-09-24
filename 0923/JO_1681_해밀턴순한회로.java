package algorithm.d0923;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JO_1681_해밀턴순한회로 {
	static int n;
	static int [][]map;
	static boolean []visited;
	static int output=0;
	static int out[];
	static int min=Integer.MAX_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(in.readLine());
		map=new int[n][n];
		visited=new boolean[n];
		out=new int[n];
		for(int i=0;i<n;i++) {
			StringTokenizer token=new StringTokenizer(in.readLine());
			for(int j=0;j<n;j++) {
				map[i][j]=Integer.parseInt(token.nextToken());
			}
		}
		visited[0]=true;
		dfs(0,0);
		System.out.println(min);
	}
	public static void dfs(int cnt,int loc) {
		
		if(output>min)return;
		if(cnt==n-1) {
			if(map[loc][0]==0)return;
			//System.out.println(cnt+" "+loc);
			int num=(output+map[loc][0]);
			//System.out.println(Arrays.toString(out)+num);
			min=Integer.min(num, min);
			return;
		}
		//23 14 16 6 25
		for(int i=0;i<n;i++) {
			if(visited[i] || map[loc][i]==0)continue;
			visited[i]=true;
			output+=map[loc][i];
			out[cnt]=i;
			dfs(cnt+1,i);
			visited[i]=false;
			output-=map[loc][i];
		}
		return;
	}

}
