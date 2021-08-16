package algorithm.d0802;

import java.util.Scanner;

public class BJ_1244 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		int student=sc.nextInt();
		for(int i=0;i<student;i++) {
			int gender=sc.nextInt();
			int bulb=sc.nextInt();
			int temp=bulb-1;
			if(gender==1) {
				while(temp<n) {
					array[temp]=(array[temp]+1)%2;
					temp+=bulb;
				}
			}
			else {
				array[temp]=(array[temp]+1)%2;
				int temp_a=temp-1;
				int temp_b=temp+1;
				while(temp_a>=0 && temp_b<n &&array[temp_a]==array[temp_b]) {
					array[temp_a]=(array[temp_a--]+1)%2;
					array[temp_b]=(array[temp_b++]+1)%2;
					
					
				}
			}
			
			
		}
		for(int i=0;i<n;i++) {
			System.out.printf(array[i]+" ");
			if((i+1)%20==0)System.out.println();
		}
		
		
	}

}
