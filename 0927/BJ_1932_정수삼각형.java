package algorithm.d0929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1932_정수삼각형 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		int [][]arr=new int [n+1][n+1];
		int [][]temp=new int [n+1][n+1];
		for(int i=1;i<=n;i++) {
			StringTokenizer token=new StringTokenizer(in.readLine());
			for(int j=1;j<i+1;j++) {
				arr[i][j]=Integer.parseInt(token.nextToken());
			}
		}
		temp[1][1]=arr[1][1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i+1;j++) {
				if(j==1) {
					temp[i][j]=arr[i][j]+temp[i-1][j];continue;
				}
				if(j==i) {
					temp[i][j]=arr[i][j]+temp[i-1][j-1];
					continue;
				}
				int max=Math.max(temp[i-1][j], temp[i-1][j-1]);
				temp[i][j]=max+arr[i][j];
			}
		}
		int max=0;
		for(int i=1;i<=n;i++) {
			max=Math.max(max, temp[n][i]);
		}
		System.out.println(max);
	}

}
