package algorithm.d0825;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BJ_아기상어_16236 {
	static int n;
	static int[][] narr;
	public static class Node implements Comparable<Node>{
		int x;
		int y;
		int distance;
		public Node(int x, int y, int distance) {
			super();
			this.x = x;
			this.y = y;
			this.distance = distance;
		}
		@Override
		public int compareTo(Node o) {
			int value=this.distance- o.distance;
			if(value!=0)return value;
			if(this.x!=o.x)return Integer.compare(this.x,o.x);
			else return Integer.compare(this.y,o.y);
			
		}
		@Override
		public String toString() {
			return "Node [x=" + x + ", y=" + y + ", distance=" + distance + "]";
		}
		
		
	}
	public static void canGo(int[][]arr,int x,int y,int size) {
		
		int dx[]= {-1,0,1,0};
		int dy[]= {0,1,0,-1};
		Queue<Integer[]> q=new LinkedList<Integer[]>();
		Integer now[]= {x,y,0};
		q.add(now);
		
		while(!q.isEmpty()) {
			Integer temp[]=q.poll();
			
			
			for(int i=0;i<4;i++) {
				int nx=temp[0]+dx[i];
				int ny=temp[1]+dy[i];
				if(nx<0 || nx>=n || ny<0|| ny>=n ||arr[nx][ny]>size )continue;
				narr[nx][ny]=temp[2]+1;
				System.out.println(nx+" "+ny);
				Integer newa[]= {nx,ny,narr[nx][ny]};
				q.add(newa);
			}
		}
		//return Integer.MAX_VALUE;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		int [][]arr=new int[n][n];
		int xShark=0;
		int yShark=0;
		int size=2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
				if(arr[i][j]==9) {
					xShark=i;
					yShark=j;
				}
			}
		}
		int go=0;
		int eat=0;
		while(true) {
			List<Node> list=new ArrayList<>();
			narr=new int[n][n];
			int min=Integer.MAX_VALUE;
			
			canGo(arr, xShark, yShark, size);
			System.out.println();
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++)System.out.print(narr[i][j]);
				System.out.println();
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(narr[i][j]>0) {
						list.add(new Node(i,j,narr[i][j]));
						
					}
				}
			}
			
			//System.out.println("s"+list.size());
			
			
			if(list.isEmpty())break;
			Collections.sort(list);
			Node N=list.get(0);
			//System.out.println(xShark+" "+yShark+" "+go);
			arr[xShark][yShark]=0;
			xShark=N.x;
			yShark=N.y;
			arr[xShark][yShark]=9;
			go+=N.distance;
			eat++;
			if(eat==size) {
				eat=0;
				size++;
			}
			/*System.out.println(xShark+" "+yShark+" "+go);
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++)System.out.print(arr[i][j]);
				System.out.println();
			}
			for(int i=0;i<list.size();i++)System.out.println(list.get(i).toString());*/
			//System.out.println();
		}
		System.out.println(go);
		
		
		
		
	}

}
