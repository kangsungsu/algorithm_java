package algorithm.d0812;

import java.util.Scanner;
import java.util.Stack;

public class BJ_1874_스택수열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int tc=sc.nextInt();
		int[]arr=new int[tc];
		for(int t=0;t<tc;t++) {
			arr[t]=sc.nextInt();
			//System.out.println(arr[t]);
		}
		Stack<Integer> stack=new Stack<>();
		int num=1;
		for(int i=0;i<tc;i++) {
			while(true) {
			if(stack.isEmpty() || stack.peek()<arr[i]) {
				stack.add(num++);
				sb.append("+\n");
				continue;
			}
			if(stack.peek()==arr[i]) {
				sb.append("-\n");
				stack.pop();
				break;
				
			}
			if(stack.peek()>arr[i]) {
				System.out.println("NO");
				//System.out.println(sb.toString());
				return;
			}
			}
		}
		System.out.println(sb.toString());
		
		
	}

}
