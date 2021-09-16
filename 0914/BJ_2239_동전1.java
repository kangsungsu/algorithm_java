package algorithm.d0915;

import java.util.Scanner;

public class BJ_2239_동전1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int coin[]=new int[n];
		int result[]=new int[k+1];
		result[0]=1;
		for(int i=0;i<n;i++) {
			coin[i]=sc.nextInt();
			for(int j=coin[i];j<k+1;j++) {
				result[j]+=result[j-coin[i]];
			}
		}
		System.out.println(result[k]);
		
		
		
	}
	
	
	

}
