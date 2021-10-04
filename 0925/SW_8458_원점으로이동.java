package algorithm.d0928;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_8458_원점으로이동 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(in.readLine());
		StringBuilder sb=new StringBuilder();
		outer:for(int t=1;t<=tc;t++) {
			int n=Integer.parseInt(in.readLine());
			sb.append("#"+t+" ");
			int d=0;
			int check=0;
			for(int i=0;i<n;i++) {
				StringTokenizer token= new StringTokenizer(in.readLine());
				int nd=Math.abs(Integer.parseInt(token.nextToken()))+Math.abs(Integer.parseInt(token.nextToken()));
				if(i!=0) {
					if(nd%2!=d%2) {
						check=1;
						
					}
				}
				
				if(i==0||d<nd)d=nd;
			}
			if(check==1) {sb.append(-1+"\n");continue outer;}
			int num=0;
			int cnt=0;
			for(int i=1;i<=d;i++) {
				num+=i;
				
				if(num>=d) {
					cnt=i;break;
				}
			}
			
			if((num-d)%2==0) {
				//System.out.println("c");
				sb.append(cnt+"\n");continue outer;
			}
			//System.out.println("cnt"+cnt);
			if(++cnt%2==1)sb.append(cnt+"\n");
			else sb.append(cnt+1+"\n");
			
			
			
			
		}
		System.out.println(sb);
	}

}
