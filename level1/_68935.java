package level1;

import java.util.ArrayList;

public class _68935 {
	
	public static void main(String[] args) {
		int n=45;
		int answer = solution(n);
		System.out.println(answer);
	}
	public static int solution(int n) {
		int answer=0;
		int extra=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
	//좌우반전 상태로 ArrayList에 저장(애초에 ArrayList에는 반전상태로 저장되기 때문에 1번과정은 생략가능)
		while(true) {
			extra=n%3;
			n=n/3;
			arr.add(extra);
			if(n<=0)
				break;
			
		}
	//ArrayList에 저장되어있는 값을 한자리씩 십진수로 변환하여 answer의 값 도출
		int num=0;
		int k=0;
		for(int i=arr.size()-1;i>=0;i--) {
			num=num + (arr.get(i)*(int)Math.pow(3, k));
			k++;
		}
		answer=num;
		return answer;
	}

}
