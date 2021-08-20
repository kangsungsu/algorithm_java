package algorithm.d0803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_Ladder1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.setIn(new FileInputStream("input.txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int arr[][]=new int[100][100];
		for(int i=0;i<10;i++) {
			
			int n=Integer.parseInt(br.readLine());
			//System.out.println(n);
			for(int j=0;j<100;j++) {
				StringTokenizer st=new StringTokenizer(br.readLine()," ");
				for(int k=0;k<100;k++) {
					//System.out.println(""+i+" "+j+" "+k);
					arr[j][k]=Integer.parseInt(st.nextToken());
					
				}
				
			}
			int nx=98;
			int ny=0;
			for(int j=0;j<100;j++) {
				if(arr[99][j]==2) {
					ny=j;
				}
			}
			
			while(nx!=0) {
				
				//System.out.println("nx"+nx+"ny"+ny);
				if(ny-1>0 && arr[nx][ny-1]==1) {
					ny--;
					while(ny-1>0 && arr[nx][ny-1]==1)ny--;
					
				}
				else if(ny+1<100 && arr[nx][ny+1]==1) {
					ny+=1;
					while(ny+1<100 && arr[nx][ny+1]==1)ny++;
					
				}
				nx--;
				
			}
			System.out.printf("#"+(i+1)+" ");
			System.out.println(ny);
		
			
			
			
			
		}
	}

}
