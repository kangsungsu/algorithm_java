package algorithm.d0918;

import java.util.Scanner;

public class BJ_1904_01타일 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		long arr[]=new long[n+1];
		arr[0]=1;
		arr[1]=1;
		//arr[2]=2;
		for(int i=2;i<=n;i++) {
			arr[i]= (arr[i-2]+arr[i-1])%15746;
		}
		//System.out.println(n);
		System.out.println(arr[n]);
	}

}
