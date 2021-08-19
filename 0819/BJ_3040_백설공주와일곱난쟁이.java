package algorithm.d0812;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_3040_백설공주와일곱난쟁이 {
	static int arr[];
	static int N=7;
	static int result[]=new int [7];
	//static boolean selected[]=new boolean[9];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		arr=new int[9];
		for(int i=0;i<9;i++) {
			arr[i]=sc.nextInt();
			
		}
		dfs(0,0);
		
	}
	public static void dfs(int cnt,int start) {
		
			if(cnt==N) {
				//System.out.println(Arrays.toString(result));
				int sum=0;
				for(int i=0;i<7;i++)sum+=result[i];
				if(sum==100)for(int i=0;i<7;i++)System.out.println(result[i]);
			
				return;
			}
			
			for(int i=start;i<arr.length;i++) {
				result[cnt]=arr[i];
				dfs(cnt+1,i+1);
				//dice3(cnt+1,i+1);
			}
		
	}

}
