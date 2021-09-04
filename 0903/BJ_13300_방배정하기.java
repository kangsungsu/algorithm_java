package algorithm.d0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_13300_방배정하기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(in.readLine()," ");
		int n=Integer.parseInt(token.nextToken());
		int k=Integer.parseInt(token.nextToken());
		int arr[]=new int[14];
		for(int i=0;i<n;i++) {
			token=new StringTokenizer(in.readLine()," ");
			int a=Integer.parseInt(token.nextToken());
			int b=Integer.parseInt(token.nextToken());
			
			arr[a+b*2]++;
		}
		int sum=0;
		for(int i=2;i<14;i++) {
			sum+=Math.ceil((double)arr[i]/k);
		}
		System.out.println(sum);
		
	}

}
