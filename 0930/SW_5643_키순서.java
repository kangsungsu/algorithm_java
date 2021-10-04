package algorithm.d0929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_5643_키순서 {
	static int n;
	static int m;
	static boolean[][]map1;
	static boolean[][]map2;
	static boolean[]v1;
	static boolean[]v2;
	static int num1;
	static int num2;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine());
		for(int t=1;t<=tc;t++) {
			int answer=0;
			n=Integer.parseInt(in.readLine());
			m=Integer.parseInt(in.readLine());
			map1=new boolean[n+1][n+1];
			map2=new boolean[n+1][n+1];
			
			for(int i=0;i<m;i++) {
				StringTokenizer token=new StringTokenizer(in.readLine());
				int from=Integer.parseInt(token.nextToken());
				int to=Integer.parseInt(token.nextToken());
				map1[from][to]=true;
				map2[to][from]=true;
			}
			for(int i=1;i<=n;i++) {
				v1=new boolean[n+1];
				v2=new boolean[n+1];
				num1=0;
				num2=0;
				dfs1(i);
				dfs2(i);
				if(num1+num2==n-1)answer++;
			}
			System.out.println("#"+t+" "+answer);
			
		}
	}
	public static void dfs1(int cnt) {
		for(int i=1;i<=n;i++) {
			if(!map1[cnt][i]||v1[i])continue;
			v1[i]=true;
			num1++;
			//System.out.println("i"+i);
			dfs1(i);
			
			
			
		}
	}
	public static void dfs2(int cnt) {
		for(int i=1;i<=n;i++) {
			if(!map2[cnt][i]||v2[i])continue;
			v2[i]=true;
			num2++;
			dfs2(i);
			v1[i]=false;
			
			
		}
	}

}
