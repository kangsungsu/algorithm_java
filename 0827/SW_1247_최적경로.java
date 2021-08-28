package algorithm.d0819;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW_1247_최적경로 {
	static int n;
	static int start_x;
	static int start_y;
	static int end_x;
	static int end_y;
	static int x[];
	static int[]y;
	static int output_x[];
	static int output_y[];
	static boolean selected[];
	static int min;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine());
		for(int t=1;t<=tc;t++) {
			n=Integer.parseInt(in.readLine());
			StringTokenizer token=new StringTokenizer(in.readLine()," ");
			start_x=Integer.parseInt(token.nextToken());
			start_y=Integer.parseInt(token.nextToken());
			end_x=Integer.parseInt(token.nextToken());
			end_y=Integer.parseInt(token.nextToken());
			x=new int[n];
			y=new int[n];
			output_x=new int[n];
			output_y=new int[n];
			selected=new boolean[n];
			min=Integer.MAX_VALUE;
			for(int i=0;i<n;i++) {
				x[i]=Integer.parseInt(token.nextToken());
				y[i]=Integer.parseInt(token.nextToken());
				
			}
			dfs(0,0);
			
			System.out.println(min);	
		}
		
	}
	static void dfs(int cnt,int sum) {
		if(cnt==n) {
			System.out.println(Arrays.toString(output_x));
			System.out.println(Arrays.toString(output_y));
			sum+=Math.abs(end_x-output_x[cnt-1])+Math.abs(end_y-output_y[cnt-1]);
			System.out.println(sum);
			if(min>sum)min=sum;
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(selected[i])continue;
			output_x[cnt]=x[i];
			output_y[cnt]=y[i];
			selected[i]=true;
			if(cnt==0) {
				sum+=Math.abs(start_x-output_x[cnt])+Math.abs(start_y-output_y[cnt]);
			}
			else {
				sum+=Math.abs(output_x[cnt-1]-output_x[cnt])+Math.abs(output_y[cnt-1]-output_y[cnt]);
			}
			if(sum>min)return;
			
			dfs(cnt+1,sum);
			selected[i]=false;
			
		}
		
	}
}
