package algorithm.d0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_17472_다리만들기2 {
	static final int []dx= {0,1,0,-1};
	static final int [] dy= {1,0,-1,0};
	static int n;
	static int m;
	static boolean [][]visited;
	static int parents[];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(in.readLine());
		n=Integer.parseInt(token.nextToken());
		m=Integer.parseInt(token.nextToken());
		
		int [][] map=new int[n][m];
		for(int i=0;i<n;i++) {
			token=new StringTokenizer(in.readLine());
			for(int j=0;j<m;j++) {
				map[i][j]=Integer.parseInt(token.nextToken());
			}
		}
		int iNum=2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j]==1) {
					
					draw(map,iNum++,i,j);
				}
			}
		}
		
		
		//HashSet<Bridge> bridge=new HashSet<>();
		List<Bridge> bridge=new ArrayList<Bridge>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j]!=0) {
					
					for(int k=0;k<4;k++) {
						int nx=i+dx[k];
						int ny=j+dy[k];
						int bl=1;
						if(nx<0 || nx>=n ||ny<0 || ny>=m ||map[nx][ny]!=0)continue;
						while(true) {
							nx=nx+dx[k];
							ny=ny+dy[k];
							if(nx<0 || nx>=n ||ny<0 || ny>=m|| map[nx][ny]==map[i][j])break;
							if(map[nx][ny]==0) {
								bl++;
							}
							else {
								if(bl==3)System.out.println(i+" "+j);
								if(bl<=1)break;
								bridge.add(new Bridge(map[i][j],map[nx][ny],bl));
							}
						}
					}
					
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		int i=0;
		//for(int i=0;i<bridge.size();i++) {
		outer: while(i<bridge.size()) {
			int j=i+1;
			while(j<bridge.size()) {
				if((bridge.get(i).x==bridge.get(j).x && bridge.get(i).y==bridge.get(j).y)||(bridge.get(i).x==bridge.get(j).y && bridge.get(i).y==bridge.get(j).x)){
					//System.out.println(i+" "+j);
					if(bridge.get(i).l<=bridge.get(j).l) {
						//System.out.println(i+" "+j+" "+bridge.get(i)+" "+bridge.get(j));
						bridge.remove(j);
						continue;
					}
					else {bridge.remove(i);continue outer;}
				}
				j++;
			}
			i++;
		}
		//
		Collections.sort(bridge);System.out.println(bridge);
		//System.out.println(iNum);
		
		parents=new int[iNum];
		for(i=2;i<iNum;i++)parents[i]=i;
		int res = 0, cnt = 0;
		boolean check=false;
		//System.out.println(iNum);
        for (Bridge b:bridge) {
            
            if(union(b.x, b.y)) {
                //System.out.println(b);
                res += b.l;
                
                if(++cnt ==iNum- 3) {
                	check=true;
                	break;
                }
            }
        }
        if(check==false)System.out.println(-1);
        else System.out.println(res);


		
	}
	
	public static class Bridge implements Comparable<Bridge>{
		int x;
		int y;
		int l;
		public Bridge(int x, int y, int l) {
			
			this.x = x;
			this.y = y;
			this.l = l;
		}
		@Override
		public String toString() {
			return "Bridge [x=" + x + ", y=" + y + ", l=" + l + "]";
		}
		/*@Override

		  public int hashCode() {

		    return Objects.hash(x,y,l);
		  }


		@Override
		public boolean equals(Object obj) {
			Bridge o=(Bridge)obj;
			if(this.l==o.l&& this.x==o.x&&this.y==o.y)return true;
			if(this.l==o.l && this.y==o.x && this.x==o.y)return true;
			return false;
		}*/
		@Override
		public int compareTo(Bridge o) {
			// TODO Auto-generated method stub
			return this.l-o.l;
		}
		
	}
	
	public static void draw(int[][] map,int num,int x, int y) {
		map[x][y]=num;
		for(int i=0;i<4;i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			if(nx<0 || nx>=n ||ny<0 || ny>=m || map[nx][ny]!=1)continue;
			
			draw(map,num,nx,ny);
		}
		return;
	}
	private static boolean union(int a, int b) {
        int aRoot = find(a);
        int bRoot = find(b);
        
        if(aRoot == bRoot) return false;
        parents[aRoot] = bRoot;
        return true;
    }
 
    private static int find(int a) {
        if(a == parents[a]) return a;
        return parents[a] = find(parents[a]);
    }
 
    




}
