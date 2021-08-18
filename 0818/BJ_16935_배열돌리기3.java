package algorithm.d0811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_16935_배열돌리기3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(in.readLine()," ");
		int n=Integer.parseInt(token.nextToken());
		int m=Integer.parseInt(token.nextToken());
		int arr[][]=new int [n+1][m+1];
		int tc=Integer.parseInt(token.nextToken());
		
		for(int i=1;i<=n;i++) {
			token=new StringTokenizer(in.readLine()," ");
			for(int j=1;j<=m;j++) {
				
				int k=Integer.parseInt(token.nextToken());
				//System.out.println(k);
				arr[i][j]=k;
			}
		}
		
		token=new StringTokenizer(in.readLine()," ");
		for(int t=0;t<tc;t++) {
			int narr[][]=new int [n+1][m+1];
			String s=token.nextToken();
			//System.out.println(s);
			switch(s) {
				case "1":
					for(int i=1;i<=m;i++) {
						for(int j=1;j<=n;j++) {
							narr[n-j+1][i]=arr[j][i];
						}
					}
					break;
				case "2":
					for(int i=1;i<=n;i++) {
						for(int j=1;j<=m;j++) {
							narr[i][j]=arr[i][m-j+1];
						}
					}
					break;
				case "3":
					narr=new int[m+1][n+1];
					for(int i=1;i<=m;i++) {
						for(int j=1;j<=n;j++) {
							narr[i][j]=arr[n-j+1][i];
						}
					}
					int temp=m;
					m=n;
					n=temp;
					break;
				case "4":
					narr=new int[m+1][n+1];
					for(int i=1;i<=m;i++) {
						for(int j=1;j<=n;j++) {
							narr[i][j]=arr[j][m+1-i];
						}
					}
					int temp1=m;
					m=n;
					
					n=temp1;
					break;
				case "5":
					
					for(int i=1;i<=n/2;i++) {
						for(int j=1;j<=m/2;j++) {
							narr[i][j]=arr[i+n/2][j];
							narr[i+n/2][j]=arr[i+n/2][j+m/2];
							narr[i+n/2][j+m/2]=arr[i][j+m/2];
							narr[i][j+m/2]=arr[i][j];
						}
					}
					break;
				case "6":
					for(int i=1;i<=n/2;i++) {
						for(int j=1;j<=m/2;j++) {
							narr[i][j]=arr[i][j+m/2];
							narr[i+n/2][j]=arr[i][j];
							narr[i+n/2][j+m/2]=arr[i+n/2][j];
							narr[i][j+m/2]=arr[i+n/2][j+m/2];
						}
					}
					break;
					
			}
			arr=narr;
			
			
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		
	}

}
