package algorithm.d0817;

import java.util.Scanner;

public class BJ_1074_Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println(z(N,r,c)-1);
	}
	
	public static int z(int N,int r,int c) {
		if(N==1) {
			if(r==0&& c==0)return 1;
			else if(r==0 && c==1)return 2;
			else if(r==1 && c==0)return 3;
			else {return 4;}
		}
		int n=(int) Math.pow(2, N-1);
		int block=n*n;
		if(Math.pow(2, N)/2>r) {
			if(Math.pow(2, N)/2>c) {
				return z(N-1,r,c);
			}
			else {
				return block+z(N-1,r,c-n);
			}
		}
		else {
			if(Math.pow(2, N)/2>c) {
				return  block*2+z(N-1,r-n,c);
			}
			else {
				return block*3+z(N-1,r-n,c-n);
			}
		}
		
	}

}
