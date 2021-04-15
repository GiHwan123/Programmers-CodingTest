package level1;

import java.util.ArrayList;

public class _42862 {
	
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		int answer = solution(n,lost,reserve);
		System.out.println(answer);
		
		
	}
	
	public static int solution(int n,int[] lost,int[] reserve) {
		int answer=0;
		int[] student = new int[31];
		//1~n���� �л���ȣ���� ���� �������ϱ����� 1������ ������ �����Ƿ� 1 ����
		for(int i=1;i<=n;i++) {
			student[i]=1;
		}
		//�������� �л��� ��ȣ�� -1, ������ ü������ �������ִ� �л��� ��ȣ�� +1
		for(int i=0; i<lost.length;i++) {
			student[lost[i]]--;
		}
		for(int i=0;i<reserve.length;i++) {
			student[reserve[i]]++;
		}
		//1��,30�� �л��� ���� ���� �ѹ������θ� ���� �� �ֱ� ������ �տ� AND ���ǹ����� �������
		//üũ���� �ʵ��� ���������� �ɾ�д�. ���� ����� ���� 2 �̸鼭 ����⿡ 0�� ����� �л��� ������ ���
		//2�� ����� ���� -1, ����� �� �ѹ��⿡�� +1 
		for(int i=1;i<=n;i++) {
			if(i-1 != 0 && student[i]==2 && student[i-1]==0) {
				student[i]--;
				student[i-1]++;
			}
			else if(i+1 < n && student[i]==2 && student[i+1]==0) {
				student[i]--;
				student[i+1]++;
			}
		}
		//student �迭�� ����� ���� �� ���� 1�̻� ����� �л����� ������ ������ �� �ִ� �л��̹Ƿ�
		// 1�̻��� ���� ����� ������ ī��Ʈ�Ͽ� answer ������ return �Ѵ�.
		for(int i=1; i<=n; i++) {
			if(student[i]>0) {
				answer++;
			}
		}
		return answer;
	}
	

}
