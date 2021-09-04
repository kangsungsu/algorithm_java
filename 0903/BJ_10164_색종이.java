package algorithm.d0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_10164_색종이 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(in.readLine());
		int x[]=new int[n];
		int y[]=new int[n];
		int a[]=new int[n];
		int b[]=new int[n];
		int xMax=0;
		int yMax=0;
		for(int i=0;i<n;i++) {
			StringTokenizer token=new StringTokenizer(in.readLine(), " ");
			x[i]=Integer.parseInt(token.nextToken());
			y[i]=Integer.parseInt(token.nextToken());
			a[i]=Integer.parseInt(token.nextToken());
			b[i]=Integer.parseInt(token.nextToken());
			xMax=Math.max(xMax, x[i]+a[i]);
			yMax=Math.max(yMax, y[i]+b[i]);
			
			
			
		}
		int [][]arr=new int[xMax][yMax];
		for(int k=0;k<n;k++) {
			for(int i=x[k];i<x[k]+a[k];i++) {
				for(int j=y[k];j<y[k]+b[k];j++)arr[i][j]=k+1;
			}
			
		}
		
		int answer[]=new int[n+1];
		for(int i=0;i<xMax;i++) {
			for(int j=0;j<yMax;j++) {
				if(arr[i][j]==0)continue;
				answer[arr[i][j]]++;
			}
		}
		for(int i=1;i<n+1;i++)System.out.println(answer[i]);
	}

}
