package algorithm.d0804;

import java.util.Scanner;
import java.util.Stack;

public class BJ_10773_Á¦·Î {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack<Integer> stack=new Stack<>();
		int test_case=sc.nextInt();
		int sum=0;
		for(int t=0;t<test_case;t++) {
			int n=sc.nextInt();
			if(n==0)sum-=stack.pop();
			else {
				stack.push(n);
				sum+=n;
			}
			
		}
		System.out.println(sum);
		
		
	}

}
