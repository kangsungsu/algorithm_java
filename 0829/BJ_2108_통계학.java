package algorithm.d0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BJ_2108_통계학 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		int arr[]=new int[n];
		int check[]=new int[8001];
		int max=0;
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(in.readLine());
			if(arr[i]>=0)check[arr[i]]++;
			else { check[arr[i]*-1+4000]++;}
			max+=arr[i];
		}
		/*if(max>=0)System.out.println(Math.round(max/n));
		else {
			if(max%n==0)System.out.println(max/n);
			else System.out.println(Math.round(max/n)-1);
		}*/
		System.out.println(Math.round((double)max/n));
		Arrays.sort(arr);
		System.out.println(arr[n/2]);
		int check2[]=new int[8001];
		System.arraycopy(check, 0, check2, 0, 8001);
		Arrays.sort(check2);
		int maxn=check2[check2.length-1];
		max=check[8000];
		for(int i=0;i<8001;i++) {
			if(maxn==check[i]) {
				if(i<4001) {
					list.add(i);
				}
				else {
					list.add((i-4000)*-1);
				}
			}
		}
		Collections.sort(list);
		//System.out.println(list);
		if(list.size()==1)System.out.println(list.get(0));
		else System.out.println(list.get(1));
		
		System.out.println(arr[arr.length-1]-arr[0]);
	}

}
