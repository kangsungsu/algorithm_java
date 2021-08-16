package algorithm.d0804;

import java.util.Scanner;

public class BJ_10872_ÆÑÅä¸®¾ó {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==0) {
			System.out.println(1);
			return;
		}
		System.out.println(factorial(n));
	}
	public static int factorial(int n) {
		if(n==1)return 1;
		return n*factorial(n-1);
		
	}

}
