package algorithm.d0904;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_15649_N과M1 {
	static int n;
	static int m;
	static int []arr;
	static boolean selected[];
	static int[]output;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		arr=new int[n];
		output=new int[m];
		selected=new boolean[n+1];
		for(int i=0;i<n;i++) {
			arr[i]=i+1;
			
		}
		solution(0);
		
		
		
	}
	public static void solution(int cnt) {
		if(cnt==m) {
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<m;i++)
				sb.append(output[i]+" ");
			System.out.println(sb);
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(selected[i])continue;
			
			output[cnt]=arr[i];
			selected[i]=true;
			solution(cnt+1);
			selected[i]=false;
			
		}
		
	}

}
