package algorithm.d0803;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SW_Flatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			int num=sc.nextInt();
			int temp=0;
			sc.nextLine();
			String str=sc.nextLine();
			String sa[]=str.split(" ");
			ArrayList<Integer> list=new ArrayList<>();
			//System.out.println(sa);
			for(int j=0;j<sa.length;j++)list.add(Integer.parseInt(sa[j]));
			//System.out.println(list);
			
			
			Collections.sort(list);
			//System.out.println(list);
			int l=list.size()-1;
			for(int j=0;j<num;j++) {
				list.set(l, list.get(l)-1);
				list.set(0, list.get(0)+1);
				Collections.sort(list);
			}
			System.out.println("#"+(i+1)+" "+(list.get(l)-list.get(0)));
		}
	}

}
