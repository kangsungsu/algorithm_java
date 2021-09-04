package algorithm.d0829;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ_2477_참외밭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[4][2];
		ArrayList<Integer>[] list=new ArrayList[4];
		for(int i=0;i<4;i++)list[i]=new ArrayList();
		for(int i=0;i<6;i++) {
			int d=sc.nextInt();
			int l=sc.nextInt();
			list[d-1].add(l);
		}
		int a,b,c,d;
		if(list[0].size()==1) {
			a=list[0].get(0);
			c=list[1].get(1);
		}
		else {
			a=list[1].get(0);
			c=list[0].get(1);
		}
		if(list[2].size()==1) {
			b=list[2].get(2);
			d=list[3].get(3);
		}
		else {
			b=list[3].get(0);
			d=list[2].get(1);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
