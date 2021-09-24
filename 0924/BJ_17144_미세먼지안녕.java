package algorithm.d0924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_17144_미세먼지안녕 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token= new StringTokenizer(in.readLine()," ");
		int r=Integer.parseInt(token.nextToken());
		int c=Integer.parseInt(token.nextToken());
		int t=Integer.parseInt(token.nextToken());
		int [][]map=new int[r][c];
		int urx = 0,ury = 0,drx = 0,dry=0;
		int [][]tMap;
		int dx[]= {0,1,0,-1};
		int dy[]= {1,0,-1,0};
		boolean ucheck=true;
		
		for(int i=0;i<r;i++) {
			token=new StringTokenizer(in.readLine());
			for(int j=0;j<c;j++) {
				map[i][j]=Integer.parseInt(token.nextToken());
				
				if(map[i][j]==-1 && ucheck) {
					urx=i;
					ury=j;
					drx=i+1;
					dry=j;
					ucheck=false;
				}
			}
		}
		
		for(int tc=0;tc<t;tc++) {
			tMap=new int[r][c];
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(map[i][j]>4) {
						int spread=0;
						for(int d=0;d<4;d++) {
							int nx=i+dx[d];
							int ny=j+dy[d];
							if(nx<0 || nx>=r || ny<0 || ny>=c||map[nx][ny]==-1) continue;
							spread+=map[i][j]/5;
							tMap[nx][ny]+=map[i][j]/5;
						}
						map[i][j]-=spread;
					}
				}
			}
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					map[i][j]+=tMap[i][j];
					
				}
				
			}
			int d=2;
			int nx=urx;
			int ny=ury;
			while(true) {
				int tx=nx+dx[d];
				int ty=ny+dy[d];
				
				
				if(tx<0 || tx>urx || ty<0 || ty>=c) {
					
					d=(d+1)%4;
					continue;
				}
				//in.readLine();
				//System.out.println(tx+" "+ty);
				if(map[nx][ny]==-1) {
					nx=tx;ny=ty;
					
					continue;
				}
				if(map[tx][ty]==-1) {
					map[nx][ny]=0;
					break;
				}
				map[nx][ny]=map[tx][ty];
				nx=tx;ny=ty;
			}
			
			d=2;
			nx=drx;
			ny=dry;
			while(true) {
				int tx=nx+dx[d];
				int ty=ny+dy[d];
				
				
				if(tx<=urx || tx>=r || ty<0 || ty>=c) {
					
					d=(d+3)%4;
					continue;
				}
				//in.readLine();
				//System.out.println(tx+" "+ty);
				if(map[nx][ny]==-1) {
					nx=tx;ny=ty;
					
					continue;
				}
				if(map[tx][ty]==-1) {
					map[nx][ny]=0;
					break;
				}
				map[nx][ny]=map[tx][ty];
				nx=tx;ny=ty;
			}
			
			
		}
		int num=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
				num+=(map[i][j]);
				
				
			}
			
			
		}
		System.out.println(num+2);
	}
	
}
