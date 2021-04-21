package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class _12906 {

	
	public static void main(String[] args) {
		int[] arr = {4,4,4,3,3};
		int[] answer = solution(arr);
		System.out.println(Arrays.toString(answer));
	}
	
	public static int[] solution(int[] arr) {
		int[] answer= {};
		ArrayList<Integer> temp = new ArrayList<Integer>();
		//연속된 숫자의 처음 인덱스와 같은값을 가지는 숫자의 갯수를 카운트하여 해당 숫자만큼 배열에서 건너뛰어 
		//ArrayList에 값 저장 후 반복
		for(int i=0;i<arr.length;i++) {
			int cnt=1;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==arr[i]) {
					cnt++;
				}
				else {
					break;
				}
			}
			
			temp.add(arr[i]);
			i=i+cnt-1;
		}
		answer = new int[temp.size()];
		//ArrayList에 순차적으로 저장되어 있는 값은 곧 answer의 값임.
		for(int i=0;i<answer.length;i++) {
			answer[i]=temp.get(i);
		}
		return answer;
	}
}
