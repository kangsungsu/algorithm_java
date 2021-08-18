package algorithm.d0811;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_16926_배열돌리기1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
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
		int rollNum=Math.min(n,m)/2;
		
		
		
		
		for(int t=0;t<tc;t++) {
			int narr[][]=new int[n+1][m+1];
			for(int i=0;i<rollNum;i++) {
				//if(n-1-2*i==1 && 1==m-1-2*i)break;
				if(n-1-2*i==0) {
					for(int j=i;j<=m-i;j++) {
						if(j==i) {
							narr[i][m-i]=arr[i][i];
							continue;
						}
						narr[i][j]=arr[i][j+1];
						
					}
					break;
				}
				for(int j=1;j<=n-1-2*i;j++) {
					
					narr[j+1+i][i+1]=arr[j+i][i+1];
					narr[j+i][m-i]=arr[j+i+1][m-i];
				}
				for(int j=1;j<=m-1-i*2;j++) {
					narr[n-i][j+1+i]=arr[n-i][j+i];
					narr[1+i][j+i]=arr[1+i][j+i+1];
				}
				
				
			}
			
			arr=narr;
		}
		
		if(Math.min(m, n)%2==1) {
			
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.printf(arr[i][j]+" ");
			}
			System.out.println();
		}
	}


}
