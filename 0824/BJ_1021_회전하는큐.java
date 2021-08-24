package algorithm.d0813;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BJ_1021_회전하는큐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[]=new int[m];
		int num=0;
		for(int i=0;i<m;i++) {
			arr[i]=sc.nextInt();
			
			
		}
		int p=-1;
		for(int i=1;i<=n;i++)list.add(i);
		for(int i=0;i<m;i++) {
			for(int j=0;j<list.size();j++) {
				if(list.get(j)==arr[i]) {
					p=j;
				}
			}
			int temp;
			if(p<list.size()/2+0.1) {
				while(true) {
					temp=list.get(0);
					list.remove(0);
					if(temp==arr[i]) {
						//System.out.println("temp"+temp);
						break;
					}
					list.add(temp);
					num++;
					
					
				}
			}else {
				num++;
				while(true) {
					
					temp=list.get(list.size()-1);
					list.remove(list.size()-1);
					if(temp==arr[i]) {
						//System.out.println("temp"+temp);
						break;
					}
					list.add(0,temp);
					num++;
					
					
				}
			}
		}
		System.out.println(num);
		
	}

}
