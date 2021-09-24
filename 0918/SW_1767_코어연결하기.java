package algorithm.d0918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW_1767_코어연결하기 {
	static int arr[][];
	static int n;
	static int dx[]= {0,1,0,-1};
	static int dy[]= {1,0,-1,0};
	static Core[] cores;
	static int max=0;
	static int cn;
	static int min=200;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine());
		for(int t=1;t<=tc;t++) {
			
			n=Integer.parseInt(in.readLine());
			arr=new int[n][n];
			cn=0;
			for(int i=0;i<n;i++) {
				StringTokenizer token=new StringTokenizer(in.readLine());
				for(int j=0;j<n;j++) {
					arr[i][j]=Integer.parseInt(token.nextToken());
					if(arr[i][j]==1 &&(i!=0 && i!=n-1 && j!=0&& j!=n-1))cn++;
				}
			}
			cores=new Core[cn];
			int num=0;
			for(int i=0;i<n;i++) {
				
				for(int j=0;j<n;j++) {
					if(arr[i][j]==1 &&(i!=0 && i!=n-1 && j!=0&& j!=n-1))cores[num++]=new Core(i,j);
				}
			}
			
			//System.out.println(Arrays.toString(cores));
			max=0;
			min=200;
			
			dfs(0,0);
			System.out.println("#"+t+" "+min);
		}
	}
	public static void dfs(int cnt,int c) {
		
		
		//System.out.println(cn);
		if(cnt==cn) {
			
			int ln=0;
			if(max<=c) {
				//System.out.println(cnt+" "+c);
				/*for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}*/
				
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(arr[i][j]==2)ln++;
					}
				}
				if(max<c) {
					//System.out.println("ln"+ln);
					min=ln;
					max=c;
				}
				if(max==c) {
					
					min=Math.min(min, ln);
				}
				//System.out.println(min);
			}
			
			
			return;
		}
		
		//System.out.println(cores.length);
		//System.out.println(cnt);
		if(cnt==3 && c==3) {
			
		}
		for(int i=0;i<4;i++) {
			if(connect(cores[cnt].x,cores[cnt].y,i)) {
				dfs(cnt+1,c+1);
				remove(cores[cnt].x,cores[cnt].y,i);
			}
		}
		dfs(cnt+1,c);
		
		
	}
	public static void remove(int x,int y,int i) {
		while(true) {
			x+=dx[i];
			y+=dy[i];
			if(x<0 || x>=n|| y<0 ||y>=n) {
				return;
			}
			arr[x][y]=0;
			
		}
	}
	public static boolean connect(int x,int y,int i) {
		boolean check=false;
		int [][] map=new int[n][n];
		for(int k=0;k<n;k++) {
			for(int l=0;l<n;l++)map[k][l]=arr[k][l];
		}
		while(true) {
			x+=dx[i];
			y+=dy[i];
			if(x<0 || x>=n|| y<0 ||y>=n) {
				for(int k=0;k<n;k++) {
					for(int l=0;l<n;l++)arr[k][l]=map[k][l];
				}
				return true;
			}
			if(map[x][y]!=0) {return false;}
			map[x][y]=2;
		}
		
		
	}
	public static class Core{
		int x;int y;

		public Core(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Core [x=" + x + ", y=" + y + "]";
		}
		
		
	}

}
