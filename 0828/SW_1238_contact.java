package algorithm.d0822;

//import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class SW_1238_contact {
	static boolean selected[];
	static int arr[][];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		for(int t=1;t<=10;t++){
			arr=new int[101][101];
			StringTokenizer token=new StringTokenizer(in.readLine()," ");
			int n=Integer.parseInt(token.nextToken())/2;
			int start=Integer.parseInt(token.nextToken());
			token=new StringTokenizer(in.readLine()," ");
			int max=0;
			for(int i=0;i<n;i++) {
				
				int a=Integer.parseInt(token.nextToken());
				int b=Integer.parseInt(token.nextToken());
				max=Integer.max(max, a);
				max=Integer.max(max,b);
				arr[a][b]=1;
				
			}
			
			selected=new boolean[max+1];
			//System.out.println(max);
			Queue<Integer[]> q=new LinkedList<Integer[]>();
			selected[start]=true;
			for(int i=1;i<=max;i++) {
				if(arr[start][i]!=0) {
					Integer[] temp=new Integer[2];
					temp[0]=i;
					temp[1]=0;
					q.add(temp);
					selected[i]=true;
				}
				
			}
			int x=0;
			int ny=-1;
			List<Integer> list=new ArrayList<>();;
			while(!q.isEmpty()) {
				//System.out.println(q.toString());
				//System.out.println(Arrays.toString(selected));
				Integer now[]=q.poll();
				x=now[0];
				int y=now[1];
				if(ny<y) {
					list=new ArrayList<>();
					ny++;
					
				}
				list.add(x);
				//System.out.println(list+" "+x);
				for(int i=1;i<=max;i++) {
					if(arr[x][i]!=0 && selected[i]==false) {
						Integer[] temp=new Integer[2];
						temp[0]=i;
						
						temp[1]=y+1;
						q.add(temp);
						selected[i]=true;
					}
				}
			}
			System.out.println("#"+t+" "+Collections.max(list));
			
		}
	}
	
	//public static void bfs(int cnt,int start) {
		
	//}

}
