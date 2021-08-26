package algorithm.d0818;

import java.util.Scanner;

public class BJ_2231_분해합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean check;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int sum=0;
			int num=i;
			while(num!=0) {
				sum+=num%10;
				num/=10;
			}
			if(sum+i==n) {
				System.out.println(i);
				
				return;
			}
			
		}
		System.out.println(0);
		
	}

}
