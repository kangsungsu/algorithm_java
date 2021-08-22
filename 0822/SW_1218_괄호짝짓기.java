package algorithm.d0805;

import java.util.Scanner;
import java.util.Stack;

public class SW_1218_괄호짝짓기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		outer:for(int t=1;t<=10;t++) {
			Stack<Character> stack=new Stack<>();
			int n=sc.nextInt();
			String s=sc.next();
			char []ca=s.toCharArray();
			for(char c:ca) {
				
				if(c=='('||c=='['||c=='{'||c=='<') {
					stack.push(c);
					//System.out.printf("%d ",(int)c);
				}
				else {
					if(stack.size()==0) {System.out.println("#"+t+" "+0);continue outer;}
					char top=stack.pop();
					if(Math.abs(top-c)>2) {System.out.println("#"+t+" "+0);continue outer;}
					//System.out.printf("%d ",(int)c);
					
					
					
				}
			}
			if(stack.size()!=0) {
				System.out.println("#"+t+" "+0);
				continue;
			}
			System.out.println("#"+t+" "+1);
		}
	}

}
