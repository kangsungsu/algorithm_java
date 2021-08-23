package algorithm.d0809;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class SW_암호문1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		for(int t=1;t<=10;t++) {
			int n=Integer.parseInt(in.readLine());
			StringTokenizer token=new StringTokenizer(in.readLine()," ");
			List <Integer> list=new ArrayList<>();
			for(int i=0;i<n;i++) {
				list.add(Integer.parseInt(token.nextToken()));
			}
			n=Integer.parseInt(in.readLine());
			token=new StringTokenizer(in.readLine()," ");
			for(int i=0;i<n;i++) {
				token.nextToken();
				int x=Integer.parseInt(token.nextToken());
				int y=Integer.parseInt(token.nextToken());
				List <Integer> tempList=new ArrayList<>();
				for(int j=0;j<y;j++) {
					
					tempList.add(Integer.parseInt(token.nextToken()));
				}
				list.addAll(x,tempList);
			}
			System.out.printf("#"+t+" ");
			for(int i=0;i<10;i++)System.out.print(list.get(i)+" ");
			System.out.println();
			
		}
	}

}
