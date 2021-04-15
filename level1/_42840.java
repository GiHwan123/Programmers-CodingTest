package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class _42840 {
	
	public static void main(String[] args) {
		int[] Question = {1,3,2,4,2};
		int[] answer= {};
		answer=solution(Question);
		System.out.println(Arrays.toString(answer));
	}
	
	public static int[] solution(int[] answers) {
		int[] supo1= {1,2,3,4,5};
		int[] supo2= {2,1,2,3,2,4,2,5};
		int[] supo3= {3,3,1,1,2,2,4,4,5,5};
		int[] sub=new int[3];
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		//������ 3���� ��� ������ ������� Ž���Ͽ� �ӽ� ���ڹ迭�� ����
		for(int i=0;i<answers.length;i++) {
			if(answers[i]==supo1[i%5]) {
				sub[0]++;
			}
			if(answers[i]==supo2[i%8]) {
				sub[1]++;
			}
			if(answers[i]==supo3[i%10]) {
				sub[2]++;
			}
		}
		//����� �� �� �ִ밪 ���
		int temp=Math.max(sub[0], Math.max(sub[1], sub[2]));
		for(int i=0;i<3;i++) {
			if(temp==sub[i]) {
				arr.add(i+1);
			}
		}
		//��� �� ��ŭ int �迭 ���� �� �ش��ϴ� �� ����ֱ�
		int[] answer= new int[arr.size()];
		for(int i=0;i<answer.length;i++) {
			answer[i]=arr.get(i);
		}
		//�������� ����
		Arrays.sort(answer);
		return answer;
	}

}
