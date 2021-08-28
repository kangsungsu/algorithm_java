package algorithm.d0822;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_7568_덩치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []w=new int[n];
		int []h=new int[n];
		for(int i=0;i<n;i++) {
			w[i]=sc.nextInt();
			h[i]=sc.nextInt();
		}
		int [] answer=new int[n];
		for(int i=0;i<n;i++) {
			int sum=1;
			for(int j=0;j<n;j++) {
				if(i==j)continue;
				if(w[i]<w[j] && h[i]<h[j])sum++;
			}
			answer[i]=sum;
		}
		
		for(int i=0;i<n;i++)System.out.print(answer[i]+" ");
		
	}

}
