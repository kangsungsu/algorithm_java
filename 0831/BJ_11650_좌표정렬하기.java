package algorithm.d0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_11650_좌표정렬하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		point[] arr=new point[n];
		for(int i=0;i<n;i++) {
			StringTokenizer token=new StringTokenizer(in.readLine()," ");
			point a=new point(Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken()));
			arr[i]=a;
			
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i].x+" "+arr[i].y+"\n");
			
		}
		
	}
	public static class point implements Comparable<point>{
		int x;
		int y;
		public point(int x, int y) {
			
			this.x = x;
			this.y = y;
		}
		@Override
		public int compareTo(point o) {
			// TODO Auto-generated method stub
			if(this.x==o.x)return Integer.compare(this.y, o.y);
			else return Integer.compare(this.x, o.x);
		}
		
	}

}
