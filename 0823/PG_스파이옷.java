package algorithm.d0806;

import java.util.HashMap;

public class PG_스파이옷{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[][]={{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution(s));
	}
	
	public static int solution(String [][] clothes) {
		HashMap<String,Integer> map= new HashMap<>();
		int answer=1;
		for(int i=0;i<clothes.length;i++) {
			map.put(clothes[i][1],map.getOrDefault(clothes[i][1], 0)+1);
		}
		for(int v:map.values()) {
			//System.out.println(v);
			answer*=v+1;
		}
		return answer-1;
	}

}
