package algorithm.d1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class JW_2577_회전초밥 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(in.readLine());
		int n=Integer.parseInt(token.nextToken());
		int d=Integer.parseInt(token.nextToken());
		int k=Integer.parseInt(token.nextToken());
		int c=Integer.parseInt(token.nextToken());
		int arr[]=new int[n];
		int map[]=new int[d+1];
		int max=0;
		int result=0;
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(in.readLine());
		}
		for(int i=0;i<k;i++) {
			if(map[arr[i]]==0) {result++;}
			map[arr[i]]++;
		}
		max=result;
		System.out.println(result);
		for(int i=0;i<n-1;i++) {
			map[arr[i]]--;
			if(map[arr[i]]==0)result--;
			map[arr[(i+k)%n]]++;
			if(map[arr[(i+k)%n]]==1)result++;
			if(map[c]==0)result++;
			//System.out.println(result);
			max=Integer.max(max, result);
			if(map[c]==0)result--;
		}
		System.out.println(max);
		/*List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<k;i++) {
			list.add(arr[i]);
			
		}
		HashSet<Integer> set=new HashSet<>(list);
		int result=set.size();
		if(!set.contains(c))result++;
		max=Integer.max(result, max);
		//System.out.println(set);
		//System.out.println(result);
		for(int i=1;i<n;i++) {
			int j=i-1;
			
			list.remove(0);
			list.add(arr[(j+k)%n]);
			
			set=new HashSet<>(list);
			result=set.size();
			if(!set.contains(c))result++;
			
			max=Integer.max(result, max);
			//System.out.println(set);
			//System.out.println(result);
			
		}*/
		
	}

}
