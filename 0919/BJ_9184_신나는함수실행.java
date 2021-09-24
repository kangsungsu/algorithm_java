package algorithm.d0918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_9184_신나는함수실행 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int arr[][][]=new int[21][21][21];
		arr[0][0][0]=1;
		for(int i=0;i<21;i++) {
			for(int j=0;j<21;j++) {
				for(int k=0;k<21;k++) {
					if(i==0 || j==0|| k==0) {
						arr[i][j][k]=1;
						continue;
					}
					if(i<j && j<k) {
						/*int q,w,e;
						if(k==0)q=1;
						else q=arr[i][j][k-1];
						if (j==0 || k==0) w=1;
						else w=arr[i][j-1][k-1];
						if(j==0) e=1;
						else e=arr[i][j-1][k];*/
						arr[i][j][k]=arr[i][j][k-1]+arr[i][j-1][k-1]-arr[i][j-1][k];
					}
					else {
						/*int q,w,e,r;
						if(i==0)q=1;
						else q=arr[i-1][j][k];
						if(i==0 || j==0)w=1;
						else w=arr[i-1][j-1][k];
						if(i==0 || k==0)e=1;
						else e=arr[i-1][j][k-1];
						if(i==0|| j==0||k==0)r=1;
						else r=arr[i-1][j-1][k-1];*/
						arr[i][j][k]=arr[i-1][j][k]+arr[i-1][j-1][k]+arr[i-1][j][k-1]-arr[i-1][j-1][k-1];
					}
					}
				}
			}
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer token=new StringTokenizer(in.readLine());
			int a=Integer.parseInt(token.nextToken());
			int b=Integer.parseInt(token.nextToken());
			int c=Integer.parseInt(token.nextToken());
			if(a==-1 && b==-1&& c==-1)break;
			int answer=0;
			if(a<=0 || b<=0|| c<=0)answer=1;
			else if(a>20 || b>20 ||c >20)answer=(arr[20][20][20]);
			else answer=(arr[a][b][c]);
			System.out.println("w("+a+", "+b+", "+c+") = "+answer);
		}
		}
	
}
