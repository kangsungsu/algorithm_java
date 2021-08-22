package algorithm.d0804;

import java.util.Scanner;

public class SW_2805_농작물수확하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int t=1;t<=testCase;t++) {
			int n=sc.nextInt();
			int sum=0;
			int [][]arr=new int[n][n];
			for(int i=0;i<n;i++) {
				String s=sc.next();
				char[]c=s.toCharArray();
				for(int j=0;j<n;j++) {
					arr[i][j]=c[j]-'0';
					sum+=arr[i][j];
				}
			}
			int sn=(int)((n-1)/2);
			
			int k=0;
			int l=n-1;
			//System.out.println(sn);
			for(int i=sn;i>=0;i--) {
				for(int j=0;j<i;j++) {
					sum-=arr[k][j]+arr[k][n-1-j]+arr[l][j]+arr[l][n-1-j];
					
					//System.out.println(arr[k][j]);
				}
				
				k++;
				l--;
			}
			System.out.println("#"+t+" "+sum);
			
		}
	}

}
