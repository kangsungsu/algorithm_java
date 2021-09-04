package algorithm.d0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class BJ_18870_좌표압축 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Set<Integer> hs=new HashSet<>();
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		int arr[]=new int[n];
		StringTokenizer token=new StringTokenizer(in.readLine()," ");
		
		for(int i=0;i<n;i++){
			int x=Integer.parseInt(token.nextToken());
			hs.add(x);
			arr[i]=x;
		}
		List<Integer> list=new ArrayList<>(hs);
		Collections.sort(list);
		for(int i=0;i<n;i++) {
			System.out.print(list.indexOf(arr[i])+" ");
		}
	}

}
