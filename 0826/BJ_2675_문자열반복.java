package algorithm.d0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2675_문자열반복 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int n=Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++) {
			StringTokenizer token=new StringTokenizer(in.readLine()," ");
			int m=Integer.parseInt(token.nextToken());
			String[] s=token.nextToken().split("");
			for(int j=0;j<s.length;j++) {
				for(int k=0;k<m;k++)sb.append(s[j]);
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}
