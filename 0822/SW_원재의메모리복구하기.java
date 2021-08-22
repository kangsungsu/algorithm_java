package algorithm.d0802;

import java.util.Scanner;

public class SW_원재의메모리복구하기 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		/*for(int i=0;i<n;i++) {
			String s=sc.next();
			String[] sa=s.split("");
			int firstnum = 0;
			for(int j=0;j<sa.length;j++) {
				if(sa[j].equals("1")) {
					firstnum=j;
					break;
				}
				
			}
			int answer=1;
			//System.out.println(firstnum);
			for(int j=firstnum;j<sa.length-1;j++) {
				if(!sa[j].equals(sa[j+1])) {
					answer+=1;
				}
			}
			System.out.println("#"+(i+1)+" "+answer);
		}
		
		for(int j=0;j<n;j++) {
		String temp="0";
		String s=sc.next();
		String[] sa=s.split("");
		int answer=0;
		for(int i=0;i<n;i++){
			if(!sa[i].equals(temp)) {
				answer+=1;
				temp=sa[i];
				System.out.println("temp"+temp);
			}
		}
		System.out.println(answer);
		}*/
		for(int i=0;i<n;i++) {
			String s=sc.next();
			char[] sa=s.toCharArray();
			int answer=0;
			answer=solution(sa);
		}
		
	}
	
	public static int solution(char[]array) {
		return 0;
		
	}

}
