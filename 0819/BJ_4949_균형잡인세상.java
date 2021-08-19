package algorithm.d0812;

import java.util.Scanner;
import java.util.Stack;

public class BJ_4949_균형잡인세상 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		outer:while(true) {
			String s=sc.nextLine();
			if(s.equals(".")) {
				return;
			}
			String[] sa=s.split("");
			String ch="()[]";
			String ch_in="([";
			String ch_out=")]";
			Stack<String> stack=new Stack<>();
			for(int i=0;i<sa.length;i++) {
				if(!ch.contains(sa[i]))continue;
				if(ch_in.contains(sa[i]))stack.add(sa[i]);
				
				
				if(sa[i].equals(")")) {
					if(stack.isEmpty()) {
						System.out.println("no");
						continue outer;
					}
					if(stack.peek().equals("(")) {
						stack.pop();
					}
					else {
						System.out.println("no");
						continue outer;
					}
				}
				if(sa[i].equals("]")) {
					if(stack.isEmpty()) {
						System.out.println("no");
						continue outer;
					}
					if(stack.peek().equals("[")) {
						stack.pop();
					}
					else {
						System.out.println("no");
						continue outer;
					}
				}
				
				
			}
			if(!stack.isEmpty()) {
				System.out.println("no");
				continue outer;
				
			}
			System.out.println("yes");
		}
	}

}
