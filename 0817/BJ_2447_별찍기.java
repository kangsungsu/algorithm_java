package algorithm.d0804;

import java.util.Scanner;

public class BJ_2447_º°Âï±â {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char arr[][]=new char[n][n];
		for(int i=0;i<n;i++)for(int j=0;j<n;j++)arr[i][j]=' ';
		recur(arr,0,0,n);
		StringBuilder str=new StringBuilder();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				str.append(arr[i][j]);
			}
			str.append("\n");
		}
		System.out.println(str);
		
	}
	
	public static void recur(char arr[][],int x,int y,int n) {
		if(n==1) {
			//System.out.println("x"+x);
			//System.out.println("y"+y);
			arr[x][y]='*';
			return;
		}
		int size=n/3;
		int count=0;
		for(int i=x;i<x+n;i+=size) {
			for(int j=y;j<y+n;j+=size) {
				count++;
				if(count==5)continue;
				recur(arr,i,j,size);
			}
		}
	}

}
