package algorithm.d0813;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_2164_카드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		Queue<Integer> q=new LinkedList<Integer>();
		for(int i=1;i<=n;i++)q.add(i);
		while(q.size()!=1) {
			q.poll();
			q.add(q.poll());
			//System.out.println(1);
		}
		
		System.out.println(q.poll());

	}

}
