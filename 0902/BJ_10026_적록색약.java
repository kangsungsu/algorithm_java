package algorithm.d0825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BJ_10026_적록색약 {
	static int dx[]= {-1,0,1,0};
	static int dy[]= {0,1,0,-1};
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		n=Integer.parseInt(in.readLine());
		char arr[][]=new char[n][n];
		char arr2[][]=new char[n][n];
		for(int i=0;i<n;i++) {
			char[] str = in.readLine().toCharArray();
			for(int j=0;j<n;j++) {
				
	            char c=str[j];
				arr[i][j]=c;
				if(c=='R')c='G';
				arr2[i][j]=c;
			}
		}
		/*for(int i=0;i<n;i++) {
			//String [] sa=in.readLine().split("");
			for(int j=0;j<n;j++)System.out.print(arr[i][j]);
			System.out.println();
		}*/
		
		
		System.out.print(dfs(arr)+" "+dfs(arr2));
		
		
		
		
	}
	static int dfs(char [][]arr) {
		//int narr[][]=new int[n][n];
		int num=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]=='X')continue;
				else {
					
					Queue<Integer[]> q=new LinkedList<>();
					num++;
					char temp=arr[i][j];
					Integer c[]= {i,j};
					q.add(c);
					while(!q.isEmpty()) {
						
						Integer t[]=q.poll();
						//System.out.println(t[0]+" "+t[1]);
						
						for(int k=0;k<4;k++) {
							int x=t[0]+dx[k];
							int y=t[1]+dy[k];
							if(x<0 || x>=n || y<0 || y>=n  || arr[x][y]=='X'|| temp!=arr[x][y]) continue;
							q.add(new Integer[] {x,y});
							arr[x][y]='X';
							
						}
					}
				}
			}
		}
		return num;
	}

}
