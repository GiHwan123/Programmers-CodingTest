package level2;

import java.util.*;

public class _42583 {

	public static void main(String[] args) {

		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = { 10 };
		int answer = solution(bridge_length, weight, truck_weights);
		System.out.println(answer);

	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		Queue<Integer> q1 = new LinkedList<Integer>();

		int sum = 0;
		
		for (int i = 0; i < truck_weights.length; i++) {//Ʈ�� ��� �� ��ŭ �ݺ�
			int w = truck_weights[i];
			
			while (true) {//Ʈ���� ���ǿ� ���� ť�� ����־� ó�����ִ� �ݺ���
				if (q1.isEmpty()) {//���� ó��, ť�� �ƹ��� ���� �������� ������� ù Ʈ�� ť�� ����
					q1.add(w);
					sum = sum + q1.peek();//�ٸ��� ������ ������ �� ����
					answer++;
					break;
				} 
				
				else if (q1.size() == bridge_length) {//0�� Ʈ�� ������ ���� �ٸ����̿� ������ Ʈ���� �������������� ����
					sum = sum - q1.poll();
				} 
				
				else {
					if (sum + w <= weight) {//Ʈ���� �� ���� �� �ִ� ���, ť�� �� ���� �� for�� 1�� ����
						q1.add(w);
						sum = sum + w;
						answer++;
						break;
					}
					else {//Ʈ���� ������ ���ϴ°�� �ǹ̾��� �� 0 �� �����Ͽ� �ٸ����� ä��.
						q1.add(new Integer(0));
						answer++;
					}
				}
			}
		}
		return answer+bridge_length;//���������� ť�� ������Ʈ���� �����ϴ� ������ �ݺ����� ����Ǵµ�
		// �̴� ������Ʈ���� �ٸ��� �ǳʱ���� bridge_length ��ŭ �ð��� �߰������� �Ҹ�ǹǷ� answer�� bridge_length �� ������
	}
}
