package algorithm.d1001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 낚시왕 {
	static int r,c,m;
	static int dx[]= {0,-1,1,0,0};
	static int dy[]= {0,0,0,1,-1};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(in.readLine());
		r=Integer.parseInt(token.nextToken());
		c=Integer.parseInt(token.nextToken());
		m=Integer.parseInt(token.nextToken());
		Shark sharks[]=new Shark[m];
		for(int i=0;i<m;i++) {
			token=new StringTokenizer(in.readLine());
			int x=Integer.parseInt(token.nextToken());
			int y=Integer.parseInt(token.nextToken());
			int s=Integer.parseInt(token.nextToken());
			int d=Integer.parseInt(token.nextToken());
			int z=Integer.parseInt(token.nextToken());
			sharks[i]=new Shark(x,y,s,d,z);
		}
		int answer=0;
		for(int i=1;i<=c;i++) {
			
			outer:for(int j=1;j<=r;j++) {
				for(int k=0;k<m;k++) {
					if(sharks[k]==null)continue;
					if(sharks[k].x==j && sharks[k].y==i) {
						//System.out.println("k"+shark[k].size+" "+i);
						answer+=sharks[k].z;
						sharks[k]=null;
						break outer;
					}
				}
			}
			for(int j=0;j<m;j++) {
				if(sharks[j]==null)continue;
				int s=sharks[j].s;
				for(int k=0;k<s;k++) {
					int x=sharks[j].x;
					int y=sharks[j].y;
					
					int d=sharks[j].d;
					int z=sharks[j].z;
					//d=sharks[j].d;
					int nx=x+dx[d];
					int ny=y+dy[d];
					//System.out.println(i+" "+j+" "+x+y+s+d+z+nx+ny);
					if(nx<1||ny<1||nx>r||ny>c) {
						
						if(d==1|| d==3)sharks[j].d=d+1;
						if(d==2||d==4)sharks[j].d=d-1;
						nx=x+dx[sharks[j].d];
						ny=y+dy[sharks[j].d];
					}
					sharks[j].x=nx;
					sharks[j].y=ny;
					
				}
				for(int k=0;k<j;k++) {
					if(sharks[k]==null|| sharks[j]==null)continue;
					if(sharks[j].x==sharks[k].x&& sharks[j].y==sharks[k].y) {
						if(sharks[j].z>sharks[k].z) {
							sharks[k]=null;
						}
						else sharks[j]=null;
					}
				}
			}
			//System.out.println(Arrays.toString(sharks));
			
		}System.out.println(answer);
	}
	public static class Shark{
		int x;int y;int s;int d;int z;


		public Shark(int x, int y, int s, int d, int z) {
			super();
			this.x = x;
			this.y = y;
			this.s = s;
			this.d = d;
			this.z = z;
		}


		@Override
		public String toString() {
			return "Shark [x=" + x + ", y=" + y + ", s=" + s + ", d=" + d + ", z=" + z + "]";
		}
		
		
		
	}

}
