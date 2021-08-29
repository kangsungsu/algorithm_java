package algorithm.d0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_1260_DFS와BFS {
	static boolean[][]arr;
	static boolean []selected;
	static int n;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token=new StringTokenizer(in.readLine()," ");
		n=Integer.parseInt(token.nextToken());
		int m=Integer.parseInt(token.nextToken());
		int v=Integer.parseInt(token.nextToken());
		
		arr=new boolean[n+1][n+1];
		for(int i=1;i<=m;i++) {
			token=new StringTokenizer(in.readLine()," ");
			int a=Integer.parseInt(token.nextToken());
			int b=Integer.parseInt(token.nextToken());
			arr[a][b]=true;
			arr[b][a]=true;
			
		}
		
		selected=new boolean[n+1];
		selected[v]=true;
		dfs(v);
		Queue<Integer> q=new LinkedList<Integer>();
		
		q.add(v);
		
		
		System.out.println();
		selected=new boolean[n+1];
		selected[v]=true;
		while(!q.isEmpty()) {
			int x=q.poll();
			System.out.print(x+" ");
			for(int i=1;i<=n;i++) {
				if(!selected[i] && arr[x][i]) {q.add(i);selected[i]=true;}
			}
		}
	}
	public static void dfs(int v) {
		selected[v]=true;
		System.out.print(v+" ");
		for(int i=1;i<=n;i++) {
			if(!selected[i] && arr[v][i]) {
				dfs(i);
			}
		}
	}

}
