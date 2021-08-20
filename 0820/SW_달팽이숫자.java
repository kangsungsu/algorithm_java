package algorithm.d0803;

import java.util.Scanner;

public class SW_달팽이숫자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   ���� ���� �׽�Ʈ ���̽��� �־����Ƿ�, ������ ó���մϴ�.
		*/	
		int[] dx= {0,1,0,-1};
		int[] dy= {1,0,-1,0};
		for(int test_case = 1; test_case <= T; test_case++) {
			int n=sc.nextInt();
			int [][] arr=new int[n][n];
			int d=0;
			int i=1;
			int x=0,y=0;
			
			while(true) {
				//System.out.println(x+" "+y+" "+d);
				arr[x][y]=i;
				int nx=x+dx[d];
				int ny=y+dy[d];
				if(i==n*n)break;
				if(nx>= n || nx<0 || ny>=n || ny<0 || arr[nx][ny]!=0 ) {
					d=(d+1)%4;
					nx=x+dx[d];
					ny=y+dy[d];
				}
				x=nx;
				y=ny;
				i++;
				
			}
			
			System.out.println("#"+test_case);
			for(i=0;i<n;i++) {
				for(int j=0;j<n;j++)System.out.print(arr[i][j]+" ");
				System.out.println();
			}
			
		}
	}

}
