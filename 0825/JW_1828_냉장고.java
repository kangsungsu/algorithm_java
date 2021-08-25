package algorithm.d0817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JW_1828_냉장고 {
	static class refrigerator implements Comparable<refrigerator>{
		 
		
		int min;
		int max;
		
		public refrigerator(int min, int max) {
			super();
			this.min = min;
			this.max = max;
		}

		@Override
		public int compareTo(refrigerator o) {
			// TODO Auto-generated method stub
			int value = this.max - o.max;
			return value != 0 ? value : this.min- o.min;
		}

		@Override
		public String toString() {
			return "refrigerator [min=" + min + ", max=" + max + "]";
		}
		
		
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(in.readLine());
		refrigerator[] r=new refrigerator[n];
		for(int i=0;i<n;i++) {
			StringTokenizer token=new StringTokenizer(in.readLine()," ");
			refrigerator ref=new refrigerator(Integer.parseInt(token.nextToken()),Integer.parseInt(token.nextToken()) );
			r[i]=ref;
		}
		Arrays.sort(r);
		int max=r[0].max;
		int rn=n;
		for(int i=1;i<n;i++) {
			if(r[i].min<=max) {
				rn--;
				continue;
			}
			else {
				max=r[i].max;
			}
		}
		
		System.out.println(rn);

	}

}
