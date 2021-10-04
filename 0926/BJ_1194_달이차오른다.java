package algorithm.d0929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_1194_달이차오른다 {
	static int n;
	static int m;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*List<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		System.out.println(list.contains(1));
		System.out.println((int)'a');
		System.out.println((int)'f');*/
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(in.readLine());
		n=Integer.parseInt(token.nextToken());
		m=Integer.parseInt(token.nextToken());
		char [][]map=new char[n][m];
		int dx[]= {0,1,0,-1};
		int dy[]= {1,0,-1,0};
		for(int i=0;i<n;i++) {
			
			
			map[i]=in.readLine().toCharArray();
			
		}
		int x=-1;int y=-1;
		for(int i=0;i<n;i++) {
			
			
			for(int j=0;j<m;j++) {
				if(map[i][j]=='0') {
					x=i;y=j;
				}
			}
			
		}
		Queue<Node> q=new LinkedList<Node>();
		map[x][y]='v';
		int answer=-1;
		List<Character> list=new ArrayList<>();
		q.add(new Node(x,y,map,list,0));
		outer:while(!q.isEmpty()) {
			Node node=q.poll();
			//System.out.println(node);
			for(int i=0;i<4;i++) {
				int nx=dx[i]+node.x;
				int ny=dy[i]+node.y;
				if(nx<0||ny<0|| nx>=n || ny>=m || node.nMap[nx][ny]=='#'||node.nMap[nx][ny]=='v') continue;
				if(node.nMap[nx][ny]=='1') {
					answer=node.num+1;
					break outer;
				}
				else if(node.nMap[nx][ny]=='.') {
					node.nMap[node.x][node.y]='v';
					node.nMap[nx][ny]='0';
					
					q.add(new Node(nx,ny,node.nMap,node.key,node.num+1));
					node.nMap[node.x][node.y]='0';
					node.nMap[nx][ny]='.';
					
				}
				else if(node.nMap[nx][ny]>='a' && node.nMap[nx][ny]<='f') {
					char key=node.nMap[nx][ny];
					node.nMap[node.x][node.y]='v';
					node.nMap[nx][ny]='0';
					char tMap[][]=new char[n][m];
					node.key.add((char) (key-32));
					for(int e=0;e<n;e++) {
						for(int r=0;r<m;r++) {
							if(node.nMap[e][r]=='v')tMap[e][r]='.';
							else tMap[e][r]=node.nMap[e][r];
						}
					}
					q.add(new Node(nx,ny,tMap,node.key,node.num+1));
					node.nMap[node.x][node.y]='0';
					node.nMap[nx][ny]=key;
					node.key.remove(node.key.size()-1);
					
				}
				else if(node.nMap[nx][ny]>='A' && node.nMap[nx][ny]<='F') {
					char door=node.nMap[nx][ny];
					if(node.key.contains(door)) {
						node.nMap[node.x][node.y]='v';
						node.nMap[nx][ny]='0';
						q.add(new Node(nx,ny,node.nMap,node.key,node.num+1));
						node.nMap[node.x][node.y]='0';
						node.nMap[nx][ny]='.';
					}
				
				}
			}
		}
		System.out.println(answer);
	}
	public static class Node{
		int x;int y;
		List<Character> key=new ArrayList<Character>();
		char nMap[][]=new char[n][m];
		int num;
		public Node(int x,int y,char[][] map,List<Character> kl,int num) {
			super();
			this.x=x;
			this.y=y;
			for(int i=0;i<kl.size();i++) {
				key.add(kl.get(i));
			}
			this.num=num;
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					this.nMap[i][j] = map[i][j];
				}
			}
			
		}
		@Override
		public String toString() {
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					sb.append(nMap[i][j]);
				}
				sb.append("\n");
			}
			return "Node [x=" + x + ", y=" + y + ", key=" + key +  "num=" + num
					+ "]\n"+sb;
		}
		
		
		
	}

}
