package algorithm.d1001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_4013_특이한자석 {
	static int map[][];
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine());
		for(int t=1;t<=tc;t++) {
			int k=Integer.parseInt(in.readLine());
			map=new int[4][8];
			for(int i=0;i<4;i++) {
				StringTokenizer token=new StringTokenizer(in.readLine());
				for(int j=0;j<=7;j++) {
						map[i][j]=Integer.parseInt(token.nextToken());
						
					}
					
			}
			for(int kt=0;kt<k;kt++) {
				StringTokenizer token=new StringTokenizer(in.readLine());
				int n=Integer.parseInt(token.nextToken());
				int d=Integer.parseInt(token.nextToken());
				n--;
				roll(n,d,2);
				
				
			}
			int answer=0;
			if(map[0][0]==1)answer+=1;
			if(map[1][0]==1)answer+=2;
			if(map[2][0]==1)answer+=4;
			if(map[3][0]==1)answer+=8;
			System.out.println("#"+t+" "+answer);
			
		}
	}
	static void roll(int n,int d,int to) {
		
		if(to==2) {
			int x=n-1;
			if(x>=0) {
				if(map[n][6]!=map[x][2]) {
					roll(x,d*-1,0);
				}
			}
			x=n+1;
			if(x<4) {
				if(map[n][2]!=map[x][6]) {
					roll(x,d*-1,1);
				}
			}
			
		}
		if(to==0) {
			int x=n-1;
			if(x>=0) {
				if(map[n][6]!=map[x][2]) {
					roll(x,d*-1,0);
				}
			}
			
			
		}
		if(to==1) {
			
			int x=n+1;
			if(x<4) {
				if(map[n][2]!=map[x][6]) {
					roll(x,d*-1,1);
				}
			}
			
		}
		if(d==1) {
			int t=map[n][7];
			for(int i=6;i>=0;i--) {
				map[n][i+1]=map[n][i];
				
			}
			map[n][0]=t;
		}
		if(d==-1) {
			int t=map[n][0];
			for(int i=1;i<=7;i++) {
				map[n][i-1]=map[n][i];
				
			}
			map[n][7]=t;
		}
	}

}
