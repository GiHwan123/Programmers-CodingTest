package level2;

import java.util.*;

public class _42583 {

	public static void main(String[] args) {
		
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
		int answer = solution(bridge_length,weight,truck_weights);
		System.out.println(answer);
		
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q1 = new LinkedList<>();//
        Queue<Integer> q2 = new LinkedList<>();//
        
        for(int i : truck_weights) {
        	q2.add(new Integer(i));
        }
        
        q1.add(q2.poll());
        while(!q1.isEmpty()) {
        	//1초 단위로 상황을 체크 (각 트럭이 머무를 수 있는 시간은 무조건 2초 겹치는 조건을 처리해주어야함)
        	int num=q1.peek();
        	for(int i=0;i<bridge_length;i++) {
        		answer++;
        		if(!q2.isEmpty() && num + q2.peek() > weight) {
        			continue;
        		}
        		else if(!q2.isEmpty() && num + q2.peek() <=weight) {
        			num += q2.peek();
        			q1.add(q2.poll());
        			break;
        		}
        		else if(q2.isEmpty()) {
        			continue;
        		}
        	}
        	num = num - q1.peek();
        	q1.remove();
        	
        	if(!q2.isEmpty() && num + q2.peek() <weight) {
        		q1.add(q2.poll());
        	}
        	if(q1.isEmpty() && q2.isEmpty())
        		answer++;
        }
        return answer;
    }
}
