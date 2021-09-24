package algorithm.d0918;

import java.io.BufferedReader;import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BJ_1003_피보나치함수 {
	//static int zero;
	//static int one;
	static number []fib;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine());
		
		fib=new number[41];
		fib[0]=new number(1,0);
		fib[1]=new number(0,1);
		for(int i=2;i<41;i++) {
			fib[i]=cal(i);
		}
		for(int t=1;t<=tc;t++) {
			int n=Integer.parseInt(in.readLine());
			
			
			
			System.out.println(fib[n].zero+" "+fib[n].one);
		}
	}
	public static number cal(int n) {
		/*if(fib[n]!=null) {
			return fib[n];
		}*/
		return new number(fib[n-1].zero+fib[n-2].zero,fib[n-1].one+fib[n-2].one);
		
	}
	public static class number{
		int zero;
		int one;
		public number(int zero, int one) {
			super();
			this.zero = zero;
			this.one = one;
		}
		
		
	}
	

}
