package algorithm.d0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW_4012_요리사 {
	static int arr[][];
	static int n;
	static int input[];
	static int output[],output2[];
	static int noutput[]=new int[2];
	static int noutput2[]=new int[2];
	static int m1,m2;
	static int min=Integer.MAX_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine());
		for(int t=1;t<=tc;t++) {
			n=Integer.parseInt(in.readLine());
			arr=new int[n][n];
			for(int i=0;i<n;i++) {
				StringTokenizer token=new StringTokenizer(in.readLine()," ");
				for(int j=0;j<n;j++) {
					arr[i][j]=Integer.parseInt(token.nextToken());
					//System.out.println(arr[i][j]);
				}
			}
			
			input=new int[n];
			for(int i=0;i<n;i++)input[i]=i;
			output=new int[n/2];
			min=Integer.MAX_VALUE;
			dfs(0,0);
			System.out.println("#"+t+" "+min);
		}

	}
	
	static void dfs(int cnt,int start) {
		if (cnt==n/2) {
			//System.out.println(Arrays.toString(output));
			output2=new int[n/2];
			int temp[]=new int[n];
			for(int i=0;i<n/2;i++) {
				temp[output[i]]++;
			}
			int r=0;
			for(int i=0;i<n;i++) {
				if(temp[i]==0)output2[r++]=i;
			}
			//System.out.println(1);
			//System.out.println(Arrays.toString(output2));
			m1=0;
			m2=0;
			dfs2(0,0);
			
			min=min<Math.abs(m1-m2)?min:Math.abs(m1-m2);
			//System.out.println(m2);
			return;
		}
		
		for(int i=start;i<n;i++) {
			//System.out.println(i);
			output[cnt]=input[i];
			dfs(cnt+1,i+1);
		}
	}
	
	static void dfs2(int cnt,int start) {
		
		if(cnt==2) {
			
			m1+=arr[noutput[0]][noutput[1]]+arr[noutput[1]][noutput[0]];
			m2+=arr[noutput2[0]][noutput2[1]]+arr[noutput2[1]][noutput2[0]];
			
			return;
		}
		//System.out.println(Arrays.toString(output2));
		for(int i=start;i<n/2;i++) {
			//System.out.println(i);
			
			noutput[cnt]=output[i];
			noutput2[cnt]=output2[i];
			dfs2(cnt+1,i+1);
		}
		
	}
	


}
