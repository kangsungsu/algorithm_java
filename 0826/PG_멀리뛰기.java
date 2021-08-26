package algorithm.d0818;

import java.util.Scanner;

public class PG_멀리뛰기 {
	
	public static void main(String[] args) {
		//System.out.println(solution(2000));
		System.out.println(factorial(10));
	}

	public static long solution(int n) {
        
        int m=n/2;
		long sum=1;
		
		for(int i=1;i<=m;i++) {
			int oneNumber=n-2*i;
			
			sum+=factorial(oneNumber+i)/(factorial(i)*factorial(oneNumber));
		}
		
        return sum%1234567;
    }
    
    public static long factorial(int n) {
		int result=1;
		for(int i=2;i<=n;i++) {
			result*=i;
		}
		return result;
	}

}
