package algorithm.d0806;

import java.util.Scanner;

public class BJ_15651_N과M3 {
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 
		N = in.nextInt();
		M = in.nextInt();
 
		arr = new int[M];
        
		dfs(0);
		System.out.print(sb);
	}
	public static void dfs(int depth) {
		for (int i = 1; i <= N; i++) {
			arr[depth] = i;
			dfs(depth + 1);
		}
	}

}
