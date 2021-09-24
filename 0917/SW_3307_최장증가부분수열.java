package algorithm.d0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_3307_최장증가부분수열 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine());
		
		for(int t=1;t<=tc;t++) {
			int n=Integer.parseInt(in.readLine());
			int[] a=new int[n];
			int[]result=new int[n];
			int max=0;
			result[0]=1;
			StringTokenizer token=new StringTokenizer(in.readLine());
			for(int i=0; i<n; i++) {
				a[i]=Integer.parseInt(token.nextToken());
			}
			
			for(int i=1; i<n; i++) {
				result[i]=1;
				for(int j=0; j<i; j++) {
					if(a[j]<a[i] && result[j]+1 > result[i]) {
						result[i]=result[j]+1;
					}
				}
				max = Math.max(result[i], max);
			}
			System.out.println("#" + t + " " + max);
		}
	}

}
