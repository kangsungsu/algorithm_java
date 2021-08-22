package algorithm.d0804;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class SW_상호의배틀필드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		char arr[][];
		int num=sc.nextInt();
		int tx=0,ty=0;
		int dx[]= {-1,1,0,0};
		int dy[]= {0,0,-1,1};
		for(int i=0;i<num;i++) {
			int h=sc.nextInt();
			int w=sc.nextInt();
			arr=new char[h][w];
			for(int j=0;j<h;j++) {
				String s=sc.next();
				char []carr=s.toCharArray();
				for(int k=0;k<w;k++) {
					arr[j][k]=carr[k];
					if(arr[j][k]=='<' ||arr[j][k]=='>'||arr[j][k]=='v' ||arr[j][k]=='^') {
						tx=j;
						ty=k;
					}
				}
			}
			//System.out.println(ty);
			int inum=sc.nextInt();
			String s=sc.next();
			//System.out.println(s);
			char [] input=s.toCharArray();
			for(char c:input) {
				if (c=='U') {
					arr[tx][ty]='^';
					if(check(arr,tx-1,ty,h,w)==1) {
						
						change(arr,tx,ty,--tx,ty);
						
					}
				}
				else if (c=='D') {
					arr[tx][ty]='v';
					if(check(arr,tx+1,ty,h,w)==1)change(arr,tx,ty,++tx,ty);
				}
				else if (c=='L') {
					arr[tx][ty]='<';
					if(check(arr,tx,ty-1,h,w)==1)change(arr,tx,ty,tx,--ty);
				}
				else if (c=='R') {
					arr[tx][ty]='>';
					if(check(arr,tx,ty+1,h,w)==1) {change(arr,tx,ty,tx,++ty);}
				}
				
				else {
					int d = 0;
					if(arr[tx][ty]=='^')d=0;
					else if(arr[tx][ty]=='v')d=1;
					else if(arr[tx][ty]=='<')d=2;
					else if(arr[tx][ty]=='>')d=3;
					int flag;
					int sx=tx;
					int sy=ty;
					while(check(arr,sx+dx[d],sy+dy[d],h,w)!=0) {
						flag=check(arr,sx+dx[d],sy+dy[d],h,w);
						if(flag==0|| flag==3)break;
						else {
							
							sx+=dx[d];
							sy+=dy[d];
							if(flag==2) {
								arr[sx][sy]='.';
								break;
							}
						}
						
					}
				}
				/*for(int m=0;m<h;m++) {
					for(int l=0;l<w;l++)System.out.print(arr[m][l]);
					System.out.println();
				}
				System.out.println();*/
				
			}
			System.out.print("#"+(i+1)+" ");
			for(int j=0;j<h;j++) {
				for(int k=0;k<w;k++)System.out.print(arr[j][k]);
				System.out.println();
			}
			
			
		}
		
	}
	public static int check(char [][]arr,int x,int y,int h,int w) {
		if(x>=0&& x<h && y>=0 && y<w) {
			if(arr[x][y]=='.')return 1;
			else if(arr[x][y]=='*')return 2;
			else if(arr[x][y]=='#')return 3;
			else if(arr[x][y]=='-')return 4;
		}
		
		
		return 0;
	}
	
	public static void change(char [][]arr,int x,int y,int a, int b) {
		char temp=arr[x][y];
		arr[x][y]=arr[a][b];
		arr[a][b]=temp;
		
	}

}
