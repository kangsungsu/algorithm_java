package algorithm.d1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SW_5656_벽돌깨기 {
	static int n;
	static int w,h;
	static int map[][];
	static int input[];
	static int output[];
	static int arr[][];
	static int dx[]= {0,-1,0,1};
	static int dy[]= {1,0,-1,0};
	static int min;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine());
		for(int t=1;t<=tc;t++) {
			StringTokenizer token=new StringTokenizer(in.readLine());
			n=Integer.parseInt(token.nextToken());
			w=Integer.parseInt(token.nextToken());
			h=Integer.parseInt(token.nextToken());
			map=new int[h][w];
			for(int i=0;i<h;i++) {
				token=new StringTokenizer(in.readLine());
				for(int j=0;j<w;j++) {
					map[i][j]=Integer.parseInt(token.nextToken());
					
				}
			}
			input=new int[w];
			output=new int[n];
			for(int i=0;i<w;i++) {
				input[i]=i;
			}
			min=w*h;
			dfs(0);
			
			System.out.println("#"+t+" "+min);
		}
	}
	public static void dfs(int cnt) {
		if(cnt==n) {
			//System.out.println(Arrays.toString(output));
			arr=new int[h][w];
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					arr[i][j]=map[i][j];
				}
			}
			
			for(int i=0;i<cnt;i++) {
				bomb(output[i]);
				down();
				//if(output[0]==2&& output[1]==2&& output[2]==2) {
				/*for(int j=0;j<h;j++) {
					for(int k=0;k<w;k++) {
						System.out.print(arr[j][k]);
					}System.out.println();
				}*/
				//System.out.println();
				//Scanner sc=new Scanner(System.in);
				//}
			}
			int result=0;
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					if(arr[i][j]!=0) {
						result++;
					}
				}
			}
			min=Integer.min(min, result);
			//System.out.println(result);
			return;
		}
		
		for(int i=0;i<w;i++) {
			output[cnt]=input[i];
			dfs(cnt+1);
		}
	}
	
	public static void bomb(int cnt) {
		//System.out.println(cnt);
		for(int i=0;i<h;i++) {
			int num=arr[i][cnt];
			if(num==0)continue;
			
			Queue<Node> q=new LinkedList<Node>();
			q.add(new Node(i,cnt));
			while(!q.isEmpty()) {
				Node node=q.poll();
				
				int x=node.x;
				int y=node.y;
				
				num=arr[x][y];
				arr[x][y]=0;
				for(int j=0;j<4;j++) {
					int nx=x;
					int ny=y;
					for(int k=1;k<num;k++) {
						nx+=dx[j];
						ny+=dy[j];
						if(nx<0 ||ny<0 ||nx>=h ||ny>=w)break;
						if(arr[nx][ny]==0)continue;
						if(arr[nx][ny]==1) {arr[nx][ny]=0;continue;}
						q.add(new Node(nx,ny));
					}
				}
			}
			break;
			
		}
		
	}
	
	public static void down(){
		for(int j=0;j<w;j++) {
			int temp[]=new int[h];
			int tep=0;
			//List<Integer>list=new ArrayList<Integer>();
			for(int i=h-1;i>=0;i--) {
				if(arr[i][j]==0)continue;
				temp[tep++]=arr[i][j];
			}
			tep=0;
			for(int i=h-1;i>=0;i--) {
				arr[i][j]=temp[tep++];
			}
			
			
			
		}
	}
	
	public static class Node{
		int x;
		int y;

		public Node(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
				
	}

}
