package algorithm.d0904;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_9663_NQueen {
	static int n;
	static int m;
	static int []arr;
	static boolean selected[];
	static int[]output;
	static int total=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		arr=new int[n];
		output=new int[n];
		selected=new boolean[n];
		for(int i=0;i<n;i++) {
			arr[i]=i;
			
		}
		solution(0);
		
		System.out.println(total);
		
	}
	public static void solution(int cnt) {
		if(cnt==n) {
			total++;
			return;
		}
		
		outer:for(int i=0;i<n;i++) {
			if(selected[i])continue;
			for(int j=0;j<cnt;j++) {
				if(Math.abs(output[j]-arr[i])==Math.abs(cnt-j))continue outer;
			}
			output[cnt]=arr[i];
			selected[i]=true;
			solution(cnt+1);
			selected[i]=false;
			
		}
		
	}

}
