package algorithm.d1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2156_포도주시식 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine());
		int max=0;
		int wine[]=new int[10000];
		int result[]=new int[10000];
		for(int t=0;t<tc;t++) {
			wine[t]=Integer.parseInt(in.readLine());
		}
		result[0]=wine[0];
		max=Math.max(result[0], max);
		result[1]=wine[0]+wine[1];
		max=Math.max(result[1], max);
		result[2]=Math.max(result[1],Math.max(wine[0],wine[1])+wine[2]);
		max=Math.max(result[2], max);
		for(int i=3;i<tc;i++) {
			result[i]=Math.max(result[i-1],Math.max(result[i-3]+wine[i-1],result[i-2])+wine[i]);
			
		}
		System.out.println(result[tc-1]);
	}

}
