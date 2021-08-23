package algorithm.d0809;

import java.util.Scanner;

public class SW_햄버거다이어트 {
	static int N,L,t[],k[],K;
	static boolean[] isSelected;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=1;i<=test;i++) {
			N=sc.nextInt();
			L=sc.nextInt();
			t=new int[N];
			k=new int[N];
			
			isSelected=new boolean[N];
			for(int j=0;j<N;j++) {
				t[j]=sc.nextInt();
				k[j]=sc.nextInt();
				
			}
			System.out.println("#"+i+" "+subset(0));
		}
	}
	public static int subset(int n) {
		if (n==N) {
			int f_t=0;
			int f_k=0;
			for(int i=0;i<N;i++) {
				f_k+=(isSelected[i]?k[i]:0);
				f_t+=(isSelected[i]?t[i]:0);
				//System.out.print(isSelected[i]?k[i]+" ":0+" ");
				
			}
			//System.out.println();
			//System.out.println(f_k);
			if(f_k<=L) {
				return f_t;
			}
			return 0;
		}
		int max=0;
		isSelected[n]=true;
		int temp1=subset(n+1);
		
		isSelected[n]=false;
		int temp2=subset(n+1);
		return temp1>temp2?temp1:temp2;
	}

}
