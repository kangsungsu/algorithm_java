package algorithm.d0812;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_2961_도영이가만든음식 {
	static int tc;
	static int []sour;
	static int[]bitter;
	static int[] input;
	static int min=Integer.MAX_VALUE;
	static boolean[ ]selected;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		tc=sc.nextInt();
		sour=new int[tc];
		bitter=new int[tc];
		input=new int[tc];
		selected=new boolean[tc];
		for(int t=0;t<tc;t++) {
			sour[t]=sc.nextInt();
			bitter[t]=sc.nextInt();
		}
		
		dfs(0);
		System.out.println(min);
	}
	
	public static void dfs(int cnt) {
		if(cnt==tc) {
			int sn=1,bn=0;
			//System.out.println(Arrays.toString(selected));
			boolean check=false;
			for(int i=0;i<tc;i++) {
				if(selected[i]==true) {
					sn*=sour[i];
					//System.out.println("sour"+bitter[i]);
					bn+=bitter[i];
					check=true;
				}
			}
			if(check==false)return;
			//System.out.println(bn);
			min=Math.min(min, Math.abs(sn-bn));
			//System.out.println(min);
			return;
		}
		
			
			selected[cnt]=true;
			
			dfs(cnt+1);
			selected[cnt]=false;
			dfs(cnt+1);
		}
		
		
	}


