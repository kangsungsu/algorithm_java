package algorithm.d0804;

import java.util.Scanner;
import java.util.Stack;

public class BJ_10828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<>();
		Scanner sc=new Scanner(System.in);
		int test_case=sc.nextInt();
		//sc.next();
		StringBuilder sb=new StringBuilder();
		for(int t=0;t<test_case;t++) {
			
			String s=sc.next();
			//System.out.println("s "+s);
			
			if (s.contains("push")) {
				stack.push(sc.nextInt());
			}
			else if(s.contains("top")) {
				if(stack.size()==0)sb.append(-1+"\n"); 
					
				else sb.append(stack.peek()+"\n");
			}
			else if(s.contains("size"))sb.append(stack.size()+"\n");
			else if(s.contains("pop")) {
				if(stack.size()==0) {sb.append(-1+"\n");}
				else sb.append(stack.pop()+"\n");
			}
			else if(s.contains("empty")) {
				if(stack.empty())sb.append(1+"\n");
				else sb.append(0+"\n");
			}
		}
		System.out.println(sb);
	}

}
