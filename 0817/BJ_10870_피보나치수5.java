package algorithm.d0804;

import java.util.Scanner;

public class BJ_10870_피보나치수5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fib(n));
	}
	
	public static int fib(int n) {
		if(n<=1)return n;
		return fib(n-1)+fib(n-2);
	}

}
