package algorithm.d0813;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ_1966_프린트큐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		for(int i=1;i<=tc;i++) {
			List<Integer> list=new ArrayList<>();
			int n=sc.nextInt();
			int m=sc.nextInt();
			for(int j=0;j<n;j++) {
				list.add(sc.nextInt());
			}
			
			int point=m;
			int number=1;
			while(true) {
			int num=list.get(0);
			boolean check=false;
			//System.out.println("num"+num);
			//System.out.println("p"+point);
			//System.out.println(list);
			for(int j=1;j<list.size();j++) {
				if(list.get(j)>num) {
					
					list.add(list.get(0));
					list.remove(0);
					if(point==0)point=list.size()-1;
					else {point--;}
					check=true;
					break;
				}
				
			}
			if(!check) {
				if(point==0) {System.out.println(number);break;}
				else {
					list.remove(0);
					number++;
					point--;
				}
			}
			}
			
			
			
		}
	}

}
