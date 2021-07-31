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
		
		for (int i = 0; i < truck_weights.length; i++) {//트럭 대기 수 만큼 반복
			int w = truck_weights[i];
			
			while (true) {//트럭을 조건에 따라 큐에 집어넣어 처리해주는 반복문
				if (q1.isEmpty()) {//가장 처음, 큐에 아무런 값이 존재하지 않을경우 첫 트럭 큐에 삽입
					q1.add(w);
					sum = sum + q1.peek();//다리위 무게의 총합의 값 갱신
					answer++;
					break;
				} 
				
				else if (q1.size() == bridge_length) {//0과 트럭 숫자의 합이 다리길이와 같으면 트럭이 빠져나간것으로 간주
					sum = sum - q1.poll();
				} 
				
				else {
					if (sum + w <= weight) {//트럭이 더 들어올 수 있는 경우, 큐에 값 삽입 후 for문 1개 종료
						q1.add(w);
						sum = sum + w;
						answer++;
						break;
					}
					else {//트럭이 들어오지 못하는경우 의미없는 값 0 을 삽입하여 다리길이 채움.
						q1.add(new Integer(0));
						answer++;
					}
				}
			}
		}
		return answer+bridge_length;//최종적으로 큐에 마지막트럭이 진입하는 시점에 반복문이 종료되는데
		// 이는 마지막트럭이 다리를 건너기까지 bridge_length 만큼 시간이 추가적으로 소모되므로 answer에 bridge_length 값 더해줌
	}
}
