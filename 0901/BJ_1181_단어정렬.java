package algorithm.d0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BJ_1181_단어정렬 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		int sn=0;
		List<str> list=new ArrayList<>();
		outer:for(int i=0;i<n;i++) {
			str ss=new str(in.readLine());
			for(int j=0;j<list.size();j++) {
				if(list.get(j).s.equals(ss.s)) {
					continue outer;
				}
			}
			list.add(ss);
			
		}
		Collections.sort(list);
		for(int i=0;i<list.size();i++)System.out.println(list.get(i).s);
	}
	
	public static class str implements Comparable<str> {
		String s;

		public str(String s) {
			super();
			this.s = s;
		}

		@Override
		public int compareTo(str o) {
			// TODO Auto-generated method stub
			if(this.s.length()==o.s.length()) {
				return this.s.compareTo(o.s);
			}
			else return Integer.compare(this.s.length(), o.s.length());
		}
		
		
		
	}

}
