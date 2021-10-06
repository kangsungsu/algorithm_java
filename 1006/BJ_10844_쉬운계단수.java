package algorithm.d1005;

import java.util.Scanner;

public class BJ_10844_쉬운계단수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long arr[][]=new long[101][10];
		long f=1000000000;
		for(int i=1;i<=9;i++) {
			arr[1][i]=1;
			arr[2][i]=2;
			
		}
		arr[2][9]=1;
		for(int i=3;i<=n;i++) {
			for(int j=1;j<=9;j++) {
				if(j==1)arr[i][j]=((arr[i-1][2])%f+(arr[i-2][1])%f)%f;
				else if(j==9)arr[i][j]=arr[i-1][8];
				else {
					arr[i][j]=((arr[i-1][j-1])%f+(arr[i-1][j+1])%f)%f;
				}
			}
		}
		long sum=0;
		for(int i=1;i<=9;i++) {
			sum=(sum+arr[n][i]%f)%f;
		}
		System.out.println(sum);
	}

}
