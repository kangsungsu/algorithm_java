package algorithm.d0904;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_15651_N과M3 {
	static int n;
	static int m;
	static int []arr;
	static boolean selected[];
	static int[]output;
	static StringBuilder sb=new StringBuilder();
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
		System.out.println(sb);
		
		
		
	}
	public static void solution(int cnt) {
		if(cnt==m) {
			
			for(int i=0;i<m;i++)
				sb.append(output[i]+" ");
			sb.append("\n");
			return;
		}
		
		for(int i=0;i<n;i++) {
			
			
			output[cnt]=arr[i];
			
			solution(cnt+1);
			
			
		}
		
	}

}
