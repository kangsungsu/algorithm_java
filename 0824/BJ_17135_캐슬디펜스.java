package algorithm.d0813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_17135_캐슬디펜스 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(in.readLine()," ");
		int n=Integer.parseInt(in.readLine());
		int m=Integer.parseInt(in.readLine());
		int d=Integer.parseInt(in.readLine());
		int arr[][]=new int[n+1][m];
		for(int i=0;i<n;i++) {
			token=new StringTokenizer(in.readLine()," ");
			for(int j=0;j<m;j++) {
				arr[i][j]=Integer.parseInt(token.nextToken());
				
			}
			int castle[m]
		}
		
		
	}

}
