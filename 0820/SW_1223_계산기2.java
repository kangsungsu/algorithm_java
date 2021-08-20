package algorithm.d0820;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SW_1223_계산기2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		for(int t=1;t<=10;t++) {
			int n=Integer.parseInt(in.readLine());
			String s=in.readLine();
			Stack<Character> stack=new Stack<>();
			String after="";
			for(int i=0;i<s.length();i++) {
				//System.out.println(stack);
				//System.out.println(after);
				if(s.charAt(i) != '+' && s.charAt(i) != '*')after+=s.charAt(i);
				else {
					if(s.charAt(i)=='*') stack.push(s.charAt(i));
					else {
						while(true){
							if(stack.isEmpty())break;
							after+=stack.pop();
							if(!stack.isEmpty())continue;
							else break;
							
						}
						stack.push(s.charAt(i));
					}
				}
				
			}
			while(!stack.isEmpty())after+=stack.pop();
			//System.out.println(after);
			Stack<Integer> nStack=new Stack<>();
			for(int i=0;i<after.length();i++) {
				char c=after.charAt(i);
				if(after.charAt(i) != '+' && after.charAt(i) != '*')nStack.push(c-'0');
				else {
					int x=nStack.pop();
					int y=nStack.pop();
					if(c=='*')nStack.push(x*y);
					else if(c=='+')nStack.push(x+y);
				}
			}
			System.out.println("#"+t+" "+nStack.pop());
			
		}
	}
	

}
