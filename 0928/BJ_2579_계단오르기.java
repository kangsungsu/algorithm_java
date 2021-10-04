package algorithm.d0929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_2579_계단오르기 {
	static int arr[];
	static int temp[];
	static int n;
	static int max=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(in.readLine());
		
		arr=new int[n+1];
		int step[]=new int[n+1];
		temp=new int[n+1];
		for(int i=1;i<=n;i++)arr[i]=Integer.parseInt(in.readLine());
		//System.out.println(Arrays.toString(arr));
		temp[1]=arr[1];
		dfs(0,2,0);
		dfs(1,2,0);
		System.out.println(max);
		
		/*step[1]=0;
		for(int i=2;i<=n;i++) {
			int a=temp[i-2];
			int b=0;
			if(step[i-1]!=1)b=temp[i-1];
			//System.out.println(a+" "+b+" "+i);
			if(a>=b) {
				step[i]=0;
				temp[i]=a+arr[i];
			}
			else {
				step[i]=step[i-1]+1;
				temp[i]=b+arr[i];
			}
			System.out.println(temp[i]);
			
		}
		System.out.println(temp[n]);
		*/
	}
	static void dfs(int to,int step,int sum) {
		if(to>n)return;
		if(n==to) {
			//System.out.println(sum+arr[n]);
			max=Math.max(max, (sum+arr[n]));
			return;
		}
		if(step==1) {
			dfs(to+2,2,sum+arr[to]);
		}
		if(step==2) {
			dfs(to+1,1,sum+arr[to]);
			dfs(to+2,2,sum+arr[to]);
		}
	}

}
