package algorithm.d0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_2798_블랙잭 {
	static int[] input;
	static int[] output=new int[3];
	static int n;
	static int m;
	static int max=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token=new StringTokenizer(in.readLine()," ");
		n=Integer.parseInt(token.nextToken());
		m=Integer.parseInt(token.nextToken());
		input=new int[n];
		token=new StringTokenizer(in.readLine()," ");
		for(int i=0;i<n;i++)input[i]=Integer.parseInt(token.nextToken());
		dfs(0,0);
		System.out.println(max);
	}
	
	static void dfs(int cnt,int start) {
		if(cnt==3) {
			//System.out.println(Arrays.toString(output));
			int sum=0;
			for(int i=0;i<3;i++) {
				sum+=output[i];
				
			}
			if(sum>m)return;
			max=max>sum?max:sum;
			return;
		}
		
		
		for(int i=start;i<n;i++) {
			output[cnt]=input[i];
			dfs(cnt+1,i+1);
		}
	}

}
