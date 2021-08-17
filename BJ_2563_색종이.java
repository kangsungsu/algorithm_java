package algorithm.d0810;

import java.util.Scanner;

public class BJ_2563_색종이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		int arr[][]=new int [101][101];
		for(int t=0;t<tc;t++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			for(int i=x;i<x+10;i++) {
				for(int j=y;j<y+10;j++) {
					arr[i][j]++;
				}
			}
		}
		int sum=0;
		for(int i=1;i<101;i++) {
			for(int j=1;j<101;j++) {
				//System.out.printf(arr[i][j]+" ");
				if (arr[i][j]!=0)sum++;
			}
			//System.out.println();
		}
		System.out.println(sum);
	}

}
