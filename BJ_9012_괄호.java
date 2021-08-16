package algorithm.d0804;

import java.util.Scanner;
import java.util.Stack;

public class BJ_9012_°ýÈ£ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		sc.nextLine();
		outer:for(int t=0;t<tc;t++) {
			String s=(sc.nextLine());
			Stack<Integer> stack =new Stack<>();
			char arr[]=s.toCharArray();
			for(char c:arr) {
				if(c=='(')
					stack.push(1);
				else {
					if(stack.size()==0) {
						System.out.println("NO");
						continue outer;
					}
					stack.pop();
				}
			}
			if (stack.size()>0) {
				System.out.println("NO");
				continue;
			}
			System.out.println("YES");
			
		}
	}

}
