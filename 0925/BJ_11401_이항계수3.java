package algorithm.d0927;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_11401_이항계수3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		System.out.println(factorial(n)/factorial(r)/factorial(n-r));
		
	}
	public static int factorial(int n) {
		int result=1;
		for(int i=1;i<=n;i++) {
			result=(result*i)%1000000007;
			
		}
		return result;
	}

}
