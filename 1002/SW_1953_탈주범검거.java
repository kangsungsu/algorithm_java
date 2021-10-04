package algorithm.d0930;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SW_1953_탈주범검거 {
	static int n,m,r,c,l;
	static int[][]map;
	static int [][]tmap;
	static int dx[];
	static int dy[];
	static int kdx[];
	static int kdy[];
	static int tdx[];
	static int tdy[];
	static int dx1[]= {0,1,0,-1};
	static int dy1[]= {1,0,-1,0};
	static int dx2[]= {1,-1};
	static int dy2[]= {0,0};
	static int dx3[]= {0,0};
	static int dy3[]= {1,-1};
	static int dx4[]= {0,-1};
	static int dy4[]= {1,0};
	static int dx5[]= {0,1};
	static int dy5[]= {1,0};
	static int dx6[]= {1,0};
	static int dy6[]= {0,-1};
	static int dx7[]= {-1,0};
	static int dy7[]= {0,-1};
	static boolean visited[][];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine());
		for(int t=1;t<=tc;t++) {
			StringTokenizer token=new StringTokenizer(in.readLine());
			n=Integer.parseInt(token.nextToken());
			m=Integer.parseInt(token.nextToken());
			r=Integer.parseInt(token.nextToken());
			c=Integer.parseInt(token.nextToken());
			l=Integer.parseInt(token.nextToken());
			map=new int[n][m];
			visited=new boolean[n][m];
			for(int i=0;i<n;i++) {
				token=new StringTokenizer(in.readLine());
				for(int j=0;j<m;j++) {
					map[i][j]=Integer.parseInt(token.nextToken());
				}
			}
			visited[r][c]=true;
			
			Queue<Node> q= new LinkedList<Node>();
			q.add(new Node(r,c,0));
			while(!q.isEmpty()) {
				Node node=q.poll();
				//System.out.println(node);
				if(node.n==l)break;
				int x=node.x;
				int y=node.y;
				visited[x][y]=true;
				//if(x==0||y==0|| x==n-1||y==m-1)
				int dx[]=null;
				int dy[]=null;
				if(map[x][y]==1) {dx=dx1;dy=dy1;}
				else if(map[x][y]==2) {dx=dx2;dy=dy2;}
				else if(map[x][y]==3) {dx=dx3;dy=dy3;}
				else if(map[x][y]==4) {dx=dx4;dy=dy4;}
				else if(map[x][y]==5) {dx=dx5;dy=dy5;}
				else if(map[x][y]==6) {dx=dx6;dy=dy6;}
				else if(map[x][y]==7) {dx=dx7;dy=dy7;}
				for(int i=0;i<dx.length;i++) {
					
					int nx=dx[i]+x;
					int ny=dy[i]+y;
					//if(x==5&& y==2)System.out.println("c"+nx+" "+ny+Arrays.toString(dx));
					if(nx<0|| ny<0|| nx>=n|| ny>=m||map[nx][ny]==0||(visited[nx][ny]))continue;
					//boolean can=false;
					//System.out.println("n"+nx+" "+ny);
					int tdx[]=null;
					int tdy[]=null;
					if(map[nx][ny]==1) {tdx=dx1;tdy=dy1;}
					else if(map[nx][ny]==2) {tdx=dx2;tdy=dy2;}
					else if(map[nx][ny]==3) {tdx=dx3;tdy=dy3;}
					else if(map[nx][ny]==4) {tdx=dx4;tdy=dy4;}
					else if(map[nx][ny]==5) {tdx=dx5;tdy=dy5;}
					else if(map[nx][ny]==6) {tdx=dx6;tdy=dy6;}
					else if(map[nx][ny]==7) {tdx=dx7;tdy=dy7;}
					for(int j=0;j<tdx.length;j++) {
						int tx=tdx[j]+nx;
						int ty=tdy[j]+ny;
						if(tx<0|| ty<0|| tx>=n|| ty>=m||map[tx][ty]==0)continue;
						//System.out.println("t"+tx+" "+ty);
						/*change3(map[tx][ty]);
						for(int k=0;k<kdx.length;k++) {
							int kx=kdx[k]+tx;
							int ky=kdy[k]+ty;
							if(kx<0|| ky<0|| kx>=n|| ky>=m||visited[kx][ky])continue;
							
						}*/
						if(tx==x &&ty==y) {
							//can=true;
							
							//System.out.println();
							//System.out.println('o');
							q.add(new Node(nx,ny,node.n+1));
							
							break;
						}
						//if(!can)continue;
						
						
					}
					
					
				}
			}
			
			//dfs(r,c,1);
			int answer=0;
			for(int i=0;i<n;i++) {
				
				for(int j=0;j<m;j++) {
					
					if(visited[i][j]) {
						answer++;
						//System.out.print(1);
					}
					//else System.out.print(0);
				}
				//System.out.println();
			}
			System.out.println("#"+t+" "+answer);
		}
		
	}
	static class Node{
		int x; int y; int n;

		public Node(int x, int y, int n) {
			super();
			this.x = x;
			this.y = y;
			this.n = n;
		}

		@Override
		public String toString() {
			return "Node [x=" + x + ", y=" + y + ", n=" + n + "]";
		}
		
		
	}
	static void dfs(int x, int y,int time) {
		System.out.println(x+" "+y+" "+time);
		//if(x==5&& y==2)System.out.println("c"+x+" "+y+Arrays.toString(dx));
		if(time==l+1) {System.out.println('x');return;}
		visited[x][y]=true;
		tmap[x][y]=time;
		int dx[]=null;
		int dy[]=null;
		//if(x==5&& y==2)System.out.println("c"+x+" "+y+Arrays.toString(dx));
		if(map[x][y]==1) {dx=dx1;dy=dy1;}
		else if(map[x][y]==2) {dx=dx2;dy=dy2;}
		else if(map[x][y]==3) {dx=dx3;dy=dy3;}
		else if(map[x][y]==4) {dx=dx4;dy=dy4;}
		else if(map[x][y]==5) {dx=dx5;dy=dy5;}
		else if(map[x][y]==6) {dx=dx6;dy=dy6;}
		else if(map[x][y]==7) {dx=dx7;dy=dy7;}
		//System.out.println(map[x][y]+" "+Arrays.toString(dy));
		//System.out.println("l"+dx.length);
		for(int i=0;i<dx.length;i++) {
			
			int nx=dx[i]+x;
			int ny=dy[i]+y;
			if(x==5&& y==2)System.out.println("c"+nx+" "+ny+Arrays.toString(dx));
			if(nx<0|| ny<0|| nx>=n|| ny>=m||map[nx][ny]==0||(visited[nx][ny]) && tmap[nx][ny]>time)continue;
			//boolean can=false;
			//System.out.println("n"+nx+" "+ny);
			int tdx[]=null;
			int tdy[]=null;
			if(map[nx][ny]==1) {tdx=dx1;tdy=dy1;}
			else if(map[nx][ny]==2) {tdx=dx2;tdy=dy2;}
			else if(map[nx][ny]==3) {tdx=dx3;tdy=dy3;}
			else if(map[nx][ny]==4) {tdx=dx4;tdy=dy4;}
			else if(map[nx][ny]==5) {tdx=dx5;tdy=dy5;}
			else if(map[nx][ny]==6) {tdx=dx6;tdy=dy6;}
			else if(map[nx][ny]==7) {tdx=dx7;tdy=dy7;}
			for(int j=0;j<tdx.length;j++) {
				int tx=tdx[j]+nx;
				int ty=tdy[j]+ny;
				if(tx<0|| ty<0|| tx>=n|| ty>=m||map[tx][ty]==0)continue;
				//System.out.println("t"+tx+" "+ty);
				/*change3(map[tx][ty]);
				for(int k=0;k<kdx.length;k++) {
					int kx=kdx[k]+tx;
					int ky=kdy[k]+ty;
					if(kx<0|| ky<0|| kx>=n|| ky>=m||visited[kx][ky])continue;
					
				}*/
				if(tx==x &&ty==y) {
					//can=true;
					
					//System.out.println('o');
					dfs(nx,ny,time+1);
					
					break;
				}
				//if(!can)continue;
				
				
			}
			
			
		}
		return;
	}
	static void change(int n) {
		if(n==1) {dx=dx1;dy=dy1;}
		else if(n==2) {dx=dx2;dy=dy2;}
		else if(n==3) {dx=dx3;dy=dy3;}
		else if(n==4) {dx=dx4;dy=dy4;}
		else if(n==5) {dx=dx5;dy=dy5;}
		else if(n==6) {dx=dx6;dy=dy6;}
		else if(n==7) {dx=dx7;dy=dy7;}
	}
	static void change2(int n) {
		if(n==1) {tdx=dx1;tdy=dy1;}
		else if(n==2) {tdx=dx2;tdy=dy2;}
		else if(n==3) {tdx=dx3;tdy=dy3;}
		else if(n==4) {tdx=dx4;tdy=dy4;}
		else if(n==5) {tdx=dx5;tdy=dy5;}
		else if(n==6) {tdx=dx6;tdy=dy6;}
		else if(n==7) {tdx=dx7;tdy=dy7;}
	}
	static void change3(int n) {
		if(n==1) {kdx=dx1;kdy=dy1;}
		else if(n==2) {kdx=dx2;kdy=dy2;}
		else if(n==3) {kdx=dx3;kdy=dy3;}
		else if(n==4) {kdx=dx4;kdy=dy4;}
		else if(n==5) {kdx=dx5;kdy=dy5;}
		else if(n==6) {kdx=dx6;kdy=dy6;}
		else if(n==7) {kdx=dx7;kdy=dy7;}
	}
}
