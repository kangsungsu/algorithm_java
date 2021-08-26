package algorithm.d0818;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_1157_단어공부 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		s=s.toUpperCase();
		int arr[]=new int [26];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'A']+=1;
			
		}
		int max=0;
		int index=0;
		boolean check = true;
		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<26;i++) {
			
			if(max==arr[i]) {
				check=false;
			}
			else if(max<arr[i]) {
				check=true;
				max=arr[i];
				index=i;
			}
		}
		//System.out.println(check);
		System.out.println(check?(char)(index+'A'):'?');
	}

}
