package algorithm.d0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferUnderflowException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_9205_맥주마시면서걸어가기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine());
		for(int t=0;t<tc;t++) {
			String answer="sad";
			int n=Integer.parseInt(in.readLine());
			Place[] pArray=new Place[n+1];
			StringTokenizer token=new StringTokenizer(in.readLine());
			Place start=new Place(Integer.parseInt(token.nextToken()),Integer.parseInt(token.nextToken()));
			for(int i=0;i<n+1;i++) {
				token=new StringTokenizer(in.readLine());
				pArray[i]=new Place(Integer.parseInt(token.nextToken()),Integer.parseInt(token.nextToken()));
			}
			Place end=pArray[n];
			//System.out.println("end"+end);
			boolean visited[]=new boolean[n+1];
			
			Queue<Place> q=new LinkedList<Place>();
			q.add(start);
			while(!q.isEmpty()) {
				
				Place now=q.poll();
				//System.out.println(now);
				
				if(now.equals(end)) {
					answer="happy";
					break;
				}
				for(int i=0;i<n+1;i++) {
					//System.out.println(i);
					if((visited[i]) ||Math.abs(now.x - pArray[i].x) + Math.abs(now.y - pArray[i].y)> 1000)continue;
					q.add(pArray[i]);
					visited[i]=true;
				}
			}
			System.out.println(answer);
		}
		
	}
	public static class Place{
		

		int x; int y;
		public Place(int x, int y) {
			super();
			this.x = x;
			this.y = y;
			
		}
		@Override
		public String toString() {
			return "Place [x=" + x + ", y=" + y + "]";
		}
		
	}

}
