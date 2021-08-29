package algorithm.d0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_2751_수정렬하기2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=Integer.parseInt(in.readLine());
		//quicksort(0,n-1,arr);
		Arrays.sort(arr);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++)sb.append(arr[i]+"\n");
		System.out.println(sb.toString());
	}
	/*
	public static void quicksort(int start,int end,Integer[] arr) {
		if(start>=end)return;
		int rend=end;
		int pivot=start+1;
		while(start<end) {
			while(arr[end]>arr[pivot]&& start<end) {
				end--;
			}
			while(arr[start]<arr[pivot] &&start<end) {
				start++;
			}
			temp(arr,start,end);
			
			
		}
		//System.out.println(Arrays.toString(arr));
		
		temp(arr,pivot,start);
		quicksort(pivot,start-1,arr);
		quicksort(start+1, rend, arr);
		
	}
	
	public static void temp(Integer[]arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		
	}*/

}
