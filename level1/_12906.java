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
		//���ӵ� ������ ó�� �ε����� �������� ������ ������ ������ ī��Ʈ�Ͽ� �ش� ���ڸ�ŭ �迭���� �ǳʶپ� 
		//ArrayList�� �� ���� �� �ݺ�
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
		//ArrayList�� ���������� ����Ǿ� �ִ� ���� �� answer�� ����.
		for(int i=0;i<answer.length;i++) {
			answer[i]=temp.get(i);
		}
		return answer;
	}
}
