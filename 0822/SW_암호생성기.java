package algorithm.d0805;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SW_암호생성기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		for(int t=1;t<=10;t++) {
			Queue<Integer> q =new LinkedList<>();
			sc.nextInt();
			for(int i=0;i<8;i++) {
				q.add(sc.nextInt());
			}
			
			//System.out.println("q"+q.toString());
			int minus=1;
			while(true) {
				int addNum=q.poll()-minus;
				if(addNum<=0) {
					q.add(0);
					break;
				}
				q.add(addNum);
				minus=(minus+1)%6;
				if(minus==0)minus++;
				
			}
			System.out.print("#"+t+" ");
			for(int i=0;i<8;i++) {
				System.out.print(q.poll()+" ");
			}
			System.out.println();
		}
	}

}
