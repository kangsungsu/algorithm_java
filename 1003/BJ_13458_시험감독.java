package algorithm.d1004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_13458_시험감독 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		int arr[]=new int[n];
		StringTokenizer token=new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(token.nextToken());
		}
		token=new StringTokenizer(in.readLine());
		int b=Integer.parseInt(token.nextToken());
		int c=Integer.parseInt(token.nextToken());
		int answer=n;
		for(int i=0;i<n;i++) {
			arr[i]-=b;
			
			if(arr[i]<0)continue;
			answer+=Math.ceil((double)arr[i]/c);
		}
		System.out.println(answer);
	}

}
