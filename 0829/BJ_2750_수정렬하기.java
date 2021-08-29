package algorithm.d0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BJ_2750_수정렬하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		Integer arr[]=new Integer[n];
		for(int i=0;i<n;i++)arr[i]=Integer.parseInt(in.readLine());
		
		
		Arrays.sort(arr);
		for(int i=0;i<n;i++)System.out.println(arr[i]);
	}

}
