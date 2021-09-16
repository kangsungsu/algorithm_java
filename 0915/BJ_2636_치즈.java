package algorithm.d0915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_2636_치즈 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[]dx={0,1,0,-1};
		int []dy= {1,0,-1,0};
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(in.readLine());
		int x=Integer.parseInt(token.nextToken());
		int y=Integer.parseInt(token.nextToken());
		int board[][]=new int[x][y];
		int cNum=0;
		for(int i=0;i<x;i++) {
			token=new StringTokenizer(in.readLine()," ");
			
			for(int j=0;j<y;j++) {
				board[i][j]=Integer.parseInt(token.nextToken());
				if(board[i][j]==1)cNum++;
			}
		}
		int num=0;
		while(true) {
			Queue<Point> q=new LinkedList<Point>();
			q.add(new Point(0,0));
			board[0][0]=2;
			while (!q.isEmpty()) {
				Point p=q.poll();
				
				for(int i=0;i<4;i++) {
					int nx=p.x+dx[i];
					int ny=p.y+dy[i];
					if(nx<0 || nx>=x || ny<0 || ny>=y || board[nx][ny]!=0)continue;
					
					if(board[nx][ny]==0) {
						board[nx][ny]=2;
						q.add(new Point(nx,ny));
					}
				}
			}
			num++;
			for(int i=0;i<x;i++) {
				for(int j=0;j<y;j++) {
					if(board[i][j]==2) {
						
						for(int k=0;k<4;k++) {
							int nx=i+dx[k];
							int ny=j+dy[k];
							if(nx<0 || nx>=x || ny<0 || ny>=y || board[nx][ny]==2)continue;
							//System.out.println(nx);
							board[nx][ny]=-1;
							
							
						
						}
					}
					
				}
			}
			int tcNum=0;
			for(int i=0;i<x;i++) {
				for(int j=0;j<y;j++) {
					if(board[i][j]==2)board[i][j]=0;
					//System.out.print(board[i][j]+" ");
					if(board[i][j]==1)tcNum++;
					if(board[i][j]==-1)board[i][j]=0;
					
				}
				//System.out.println();
			}
			//System.out.println();
			if(tcNum==0)break;
			cNum=tcNum;
		}
		System.out.println(num);
		System.out.println(cNum);
		
	}
	
	public static class Point{
		int x;int y;

		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
	}

}
