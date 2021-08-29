package algorithm.d0823;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BJ_1759_암호만들기 {
	static char vowel[];
	static List<String> list; 
	static char consonant[];
	static char output1[];
	static char output2[];
	static int l;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		int c=sc.nextInt();
		char arr[]=new char[c];
		int m=0;
		for(int i=0;i<c;i++) {
			String s=sc.next();
			arr[i]=s.charAt(0);
			if("aieou".contains(s))m++;
		}
			
		Arrays.sort(arr);
		consonant=new char[c-m];
		int cn=0;
		vowel=new char[m];
		int vn=0;
		for(int i=0;i<arr.length;i++) {
			if("aieou".contains(Character.toString(arr[i])))vowel[vn++]=arr[i];
			else consonant[cn++]=arr[i];
		}
		//System.out.println(Arrays.toString(vowel));
		list=new ArrayList<String>();
		for(int i=1;i<=m;i++) {
			if(l-i<2)continue;
			output1=new char[i];
			dfs1(0,i,0,l-i);
		}
		
		Collections.sort(list);
		for(int i=0;i<list.size();i++)System.out.println(list.get(i));
		
	}
	static void dfs1(int cnt,int n,int start, int remain) {
		if(cnt==n) {
			//System.out.println(Arrays.toString(output1));
			
			output2=new char[remain];
			dfs2(0,remain,0);
			
			return;
		}
		
		for(int i=start;i<vowel.length;i++) {
			output1[cnt]=vowel[i];
			dfs1(cnt+1,n,i+1,remain);
			
		}
	}
	
	static void dfs2(int cnt,int n,int start) {
		if(cnt==n) {
			//System.out.println(output1);
			//System.out.println(output2);
			//System.out.println();
			char []dest=new char[l];
			System.arraycopy(output1, 0, dest, 0, output1.length);
			System.arraycopy(output2, 0, dest, output1.length, output2.length);
			Arrays.sort(dest);
			
			String str=String.valueOf(dest);
			
			list.add(str);
			
			return;
		}
		for(int i=start;i<consonant.length;i++) {
			output2[cnt]=consonant[i];
			dfs2(cnt+1,n,i+1);
		}
	}

}
