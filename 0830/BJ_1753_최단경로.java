package algorithm.d0824;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_1753_최단경로 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(in.readLine()," ");
		
		int v=Integer.parseInt(token.nextToken());
		int e=Integer.parseInt(token.nextToken());
		int k=Integer.parseInt(in.readLine());
		
		int [][]arr=new int[v+1][v+1];
		for(int i=0;i<e;i++) {
			token=new StringTokenizer(in.readLine()," ");
			int f=Integer.parseInt(token.nextToken());
			int t=Integer.parseInt(token.nextToken());
			int w=Integer.parseInt(token.nextToken());
			
			arr[f][t]=w;
			//arr[t][f]=w;
		}
		
		//List<Integer>list=new LinkedList<>();
		Queue<Integer> queue=new PriorityQueue<>();
		boolean check[]=new boolean[v+1];
		int[] distance=new int[v+1];
		//int visit_num=1;
		check[k]=true;
		//int check_num=1;
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[k]=0;
		check[k]=true;
		//visited[k]=true;
		queue.add(k);
		while(!queue.isEmpty()) {
			int minV=-1;
			int minNum=Integer.MAX_VALUE;
			int q=queue.poll();
			for(int i=1;i<v+1;i++) {
				
				if(arr[q][i]!=0 && !check[i] &&distance[i]>distance[q]+arr[q][i]) {
					distance[i]=distance[q]+arr[q][i];
					if(arr[q][i]<minNum) {
						minNum=arr[q][i];
						minV=i;
					}
				}
			}
			//System.out.println(q+" "+minV+" "+minNum);
			//System.out.println(Arrays.toString(distance));
			if(minV==-1)continue;
			queue.add(minV);
		}
		for(int i=1;i<v+1;i++) {
			if(distance[i]==Integer.MAX_VALUE) {
				System.out.println("INF");
				continue;
			}
			System.out.println(distance[i]);
		}
		
		
		
		
		
	}
	
	
	}

