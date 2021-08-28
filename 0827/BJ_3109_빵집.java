package algorithm.d0819;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_3109_빵집 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[]dx= {-1,0,1};
		int[]dy= {1,1,1};
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(in.readLine()," ");
		int r=Integer.parseInt(token.nextToken());
		int c=Integer.parseInt(token.nextToken());
		char arr[][]=new char[r][c];
		int answer=0;
		for(int i=0;i<r;i++) {
			String []sa=in.readLine().split("");
			for(int j=0;j<c;j++) {
				arr[i][j]=sa[j].charAt(0);
			}
		}
		
		outer:for(int i=0;i<r;i++) {
			
			int x=i;
			int y=0;
			
			while(true) {
				boolean check=false;
				for(int j=0;j<3;j++) {
					
					int nx=x+dx[j];
					int ny=y+dy[j];
					//System.out.println(nx+" "+ny+" "+i+" "+answer);
					if(ny==c-1) {
						answer+=1;
						continue outer;
					}
					if(nx<0 || nx >=r || ny<0 || ny>=c || arr[nx][ny]!='.') {
						
						continue;
					}
					arr[nx][ny]='X';
					x=nx;
					y=ny;
					check=true;
					break;
				}
				if(check==false) {
					
					break;
				}
				
			}
			
		}
		System.out.println(answer);
	}

}
