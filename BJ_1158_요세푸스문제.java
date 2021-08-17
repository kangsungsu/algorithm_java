package algorithm.d0810;

import java.util.Scanner;

public class BJ_1158_요세푸스문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.print("<");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=i;
		int temp=n-1;
		for(int i=0;i<n;i++) {
			int j=0;
			while(j<k) {
				temp=(temp+1)%n;
				if(arr[temp]!=-1)j++;
			}
			if(i==n-1)break;
			System.out.print(arr[temp]+1+", ");
			arr[temp]=-1;
		}
		System.out.print(arr[temp]+1);
		System.out.println(">");
	}

}
