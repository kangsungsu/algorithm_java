package algorithm.d0813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_18258_큐2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc=new Scanner(System.in);
		int tc=Integer.parseInt(in.readLine());
		StringBuffer sb=new StringBuffer();
		int push=0;
		Queue<Integer> queue=new LinkedList<Integer>();
		for(int i=0;i<tc;i++) {
			StringTokenizer st=new StringTokenizer(in.readLine()," ");
			switch(st.nextToken()) {
			case "push":
				int n=Integer.parseInt(st.nextToken());
				queue.add(n);
				push=n;
				
				break;
			case "front":
				if(queue.isEmpty()) {
					sb.append("-1\n");
					break;
				}
				sb.append(queue.peek()+"\n");
				
				break;
			case "back":
				if(queue.isEmpty()) {
					sb.append("-1\n");
					break;
				}
				sb.append(push+"\n");
				break;
			case "empty":
				sb.append((queue.isEmpty()?1:0)+"\n");
				
				break;
			case "pop":
				if(queue.isEmpty()) {
					sb.append("-1\n");
					break;
				}
				sb.append(queue.poll()+"\n");
				//System.out.println(queue.poll());
				break;
			case "size":
				//System.out.println("Size");
				sb.append(queue.size()+"\n");
				//System.out.println(queue.size());
				break;
		}
	}
		System.out.println(sb.toString());
	}
}
