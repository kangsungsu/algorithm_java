package algorithm.d0823;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_1427_소트인사이드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ca[]=s.toCharArray();
		Arrays.sort(ca);
		for(int i=ca.length-1;i>=0;i--)System.out.print(ca[i]);
	}

}
