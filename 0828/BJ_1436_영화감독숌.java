package algorithm.d0822;

import java.util.Scanner;

public class BJ_1436_영화감독숌 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int target=sc.nextInt();
		int n=0;
		int i=666;
		outer:while(n!=target) {
			String s=Integer.toString(i);
			int sum=0;
			for(int j=0;j<s.length();j++) {
				if(s.contains("666")) {
				
					n++;
					i++;
					continue outer;
				}
				
			}
			i++;
			
			
		}
		System.out.println(i-1);
	}

}
