package algorithm.d0915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW_3124_최소스패닝트리 {
	static int[] parent;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine());
		//System.out.println(tc);
		
		for(int t=1;t<=tc;t++) {
			StringTokenizer token=new StringTokenizer(in.readLine()," ");
			int v=Integer.parseInt(token.nextToken());
			int e=Integer.parseInt(token.nextToken());
			
			parent=new int[v+1];
			for(int i=0;i<v+1;i++)parent[i]=i;
			Edge[] eArray=new Edge[e];
			for(int i=0;i<e;i++) {
				token=new StringTokenizer(in.readLine());
				eArray[i]=new Edge(Integer.parseInt(token.nextToken()),Integer.parseInt(token.nextToken()),Long.parseLong(token.nextToken()));
			}
			Arrays.sort(eArray);
			long result=0;
			int cnt=0;
			for(Edge edge:eArray) {
				if(union(edge.x,edge.y)) {
					result+=edge.l;
					if(++cnt==v-1)break;
				}
			}
			
			System.out.println("#"+t+" "+result);
			
		}
		
	}
	
	public static void makeSet(int x) {
		parent[x]=x;
		
	}
	
	public static int findSet(int x) {
		if(x==parent[x])return x;
		else {
			parent[x]=findSet(parent[x]);
			return parent[x];
		}
	}
	public static boolean union(int x, int y) {
		int px=findSet(x);
		int py=findSet(y);
		
		if(px!=py) {
			parent[py]=px;
			return true;
		}
		return false;
	}
	public static class Edge implements Comparable<Edge>{
		int x;
		int y;
		long l;
		
		public Edge(int x, int y, long l) {
			super();
			this.x = x;
			this.y = y;
			this.l = l;
		}

		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return Long.compare(this.l, o.l);
		}
		
		
	}

}
