package algorithm.d0817;

import java.util.Scanner;

public class BJ_2839_설탕배달 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==4 ||n==7) {
			System.out.println(-1);
			return;
		}
		
		switch(n%5) {
		case 0:
			System.out.println(n/5);
			break;
		case 1:
			System.out.println(n/5+1);
			break;
		case 2:
			System.out.println(n/5+2);
			break;
		case 3:
			System.out.println(n/5+1);
			break;
		case 4:
			System.out.println(n/5+2);
			break;
		}
	}
}
