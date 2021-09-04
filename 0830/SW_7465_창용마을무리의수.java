package algorithm.d0824;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SW_7465_창용마을무리의수 {
	static int N;
	static int [] parents;
	
	private static void make() {
		for(int i=1;i<N+1;i++)parents[i]=i;
	}
	
	private static int find(int a) {
		if(a==parents[a])return a;
		return parents[a]=find(parents[a]);
	}
	
	private static boolean union(int a, int b) {
		int aRoot=find(a);
		int bRoot=find(b);
		if(aRoot==bRoot)return false;
		
		parents[bRoot]=aRoot;
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		for(int t=1;t<=tc;t++) {
			N=sc.nextInt();
			parents=new int[N+1];
			make();
			
			int m=sc.nextInt();
			for(int i=0;i<m;i++) {
				union(sc.nextInt(),sc.nextInt());
			}
			HashSet<Integer> hs=new HashSet<>();
			for(int i=1;i<=N;i++) {
				hs.add(find(i));
				
			}
			System.out.println("#"+t+" "+hs.size());
			
		}
		
	}

}
