package algorithm.d0915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_1600_말이되고픈원숭이 {
	static int map[][];
	static boolean [][]visited;
	static int w;
	static int h;
	static int hx[]= {-2,-1,1,2,2,1,-1,-2};
	static int hy[]= {1,2,2,1,-1,-2,-2,-1};
	static int[]dx={0,1,0,-1};
	static int []dy= {1,0,-1,0};
	static int min=Integer.MAX_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int k=Integer.parseInt(in.readLine());
		StringTokenizer token=new StringTokenizer(in.readLine());
		w=Integer.parseInt(token.nextToken());
		h=Integer.parseInt(token.nextToken());
		map=new int[h][w];
		visited=new boolean[h][w];
		
		
		
		for(int i=0;i<h;i++) {
			token=new StringTokenizer(in.readLine());
			for(int j=0;j<w;j++) {
				map[i][j]=Integer.parseInt(token.nextToken());
			}
		}
		visited[0][0]=true;
		Queue<Move> q=new LinkedList<>();
		q.add(new Move(0,0,visited,0,k));
		int num=0;
		outer:while(!q.isEmpty()) {
			Move m=q.poll();
			if(m.num>h*w) {num=-1;break outer;}
			//System.out.println(m);
			if(m.k>0) {
				for(int i=0;i<8;i++) {
					int nx=m.x+hx[i];
					int ny=m.y+hy[i];
					if(check(nx,ny))continue;
					if(nx==h-1&& ny==w-1) {num=m.num;break outer;}
					visited[nx][ny]=true;
					q.add(new Move(nx,ny,visited,m.num+1,m.k-1));
					visited[nx][ny]=false;
					
				}
			}
			for(int i=0;i<4;i++) {
				int nx=m.x+dx[i];
				int ny=m.y+dy[i];
				if(check(nx,ny))continue;
				if(nx==h-1&& ny==w-1) {num=m.num;break outer;}
				visited[nx][ny]=true;
				q.add(new Move(nx,ny,visited,m.num+1,m.k));
				visited[nx][ny]=false;
			}
		}
		System.out.println(num+1);
	}
	
	public static class Move{
		int x;
		int y;
		
		boolean [][]visited;
		int num;
		int k;
		public Move(int x, int y, boolean[][]visited, int num,int k) {
			super();
			this.x = x;
			this.y = y;
			this.visited=new boolean[h][w];
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					this.visited[i][j]=visited[i][j];
				}
			}
			
			this.num = num;
			this.k=k;
		}
		@Override
		public String toString() {
			return "Move [x=" + x + ", y=" + y + ", visited=" + Arrays.toString(visited) + ", num=" + num + ", k=" + k
					+ "]";
		}
		
		
	}
	public static void dfs(int k,int x,int y,int num) {
		if(num>=min)return;
		if(x==h-1 && y==w-1) {
			min=Math.min(min,num);
			return;
		}
		
		if(k>0) {
			for(int i=0;i<8;i++) {
				int nx=x+hx[i];
				int ny=y+hy[i];
				if(check(nx,ny))continue;
				visited[nx][ny]=true;
				dfs(k-1,nx,ny,num+1);
				visited[nx][ny]=false;
				
			}
		}
		for(int i=0;i<4;i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			if(check(nx,ny))continue;
			visited[nx][ny]=true;
			dfs(k,nx,ny,num+1);
			visited[nx][ny]=false;
		}
		return;
		
	}
	public static boolean check(int x,int y) {
		if(x<0 || x>=h || y<0 || y>=w ||(visited[x][y])||map[x][y]==1) return true;
		
			
		return false;
		
	}
	
	

}
