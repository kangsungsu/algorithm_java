package algorithm.d0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_10814_나이순정렬 {
	static int n=1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		person[] pa=new person[n];
		for(int i=0;i<n;i++) {
			StringTokenizer token= new StringTokenizer(in.readLine()," ");
			person a=new person(Integer.parseInt(token.nextToken()),token.nextToken());
			pa[i]=a;
		}
		Arrays.sort(pa);
		for(int i=0;i<n;i++) {
			System.out.print(pa[i].age+" ");
			System.out.println(pa[i].name);
		}
		
	}
	public static class person implements Comparable<person>{
		int age;
		String name;
		int order;
		public person(int age, String name) {
			super();
			this.age = age;
			this.name = name;
			this.order = n++;
		}
		@Override
		public int compareTo(person o) {
			// TODO Auto-generated method stub
			if(this.age==o.age)return Integer.compare(this.order,o.order);
			return Integer.compare(this.age, o.age);
		}
		
	}
}
