package algorithm.d0829;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_1859_백만장자프로젝트 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		int tc=Integer.parseInt(in.readLine());
		for(int t=1;t<=tc;t++) {
			int n=Integer.parseInt(in.readLine());
			int []arr=new int[n];
			StringTokenizer token=new StringTokenizer(in.readLine()," ");
			for(int i=0;i<n;i++)arr[i]=Integer.parseInt(token.nextToken());
			int standard=n-1;
			int i=standard-1;
			long sum=0;
			while(true) {
				while(i>=0  && arr[standard]>=arr[i]) {
					sum+=arr[standard]-arr[i];
					i--;
				}
				standard=i;
				if(i<0)break;
			}
			System.out.println("#"+t+" "+sum);
		}
	}

}
