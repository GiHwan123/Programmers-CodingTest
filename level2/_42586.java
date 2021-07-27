package level2;

import java.util.*;
public class _42586 {
	
	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		int[] answer = solution(progresses,speeds);
		System.out.println(Arrays.toString(answer));
	}
	public static int[] solution(int[] progresses, int[] speeds) {

		Queue<Integer> que = new LinkedList<>();//큐 선언
		ArrayList<Integer> arr = new ArrayList<>();//정답 배열의 크기를 결정할 ArrayList
		
		for(int i=0;i<progresses.length;i++) {
			
			int a=100-progresses[i];//100 - 현재 개발 완성도를 변수값에 저장(남은잔업량)
			
			if(a%speeds[i]!=0) {//남은잔업량%개발진행속도의 값이 0 이 아닐경우(나머지가 존재할경우) 남은 일수 + 1
				que.add(a/speeds[i]+1);//큐에 작업완료까지 남은 일수 저장
			}
			else {//몫이 나누어 떨어질 경우 해당 값을 큐에 저장
				que.add(a/speeds[i]);
			}
			
		}
		
		int cnt=1;
		int peek=que.poll();//큐에 처음 저장된 값 변수에 저장
		
		while(!que.isEmpty()) {//큐에 값이 존재하지 않을 때 까지 반복
			
			if(que.peek()<=peek) {//큐에서 뽑아낸 값보다 현재 큐 내에 존재하는 첫 값이 작을 경우 해당 값 삭제 후 cnt++
				cnt++;
				que.remove();
			}
			
			else {//큐에서 뽑아낸 값보다 현재 큐 내에 존재하는 첫 값이 큰 경우 cnt값을 arraylist에 저장 후 큐 내의 첫 값을
				//peek 값에 저장하고 cnt 초기화
				arr.add(cnt);
				peek=que.poll();
				cnt=1;
			}
		}
		arr.add(cnt);//큐에 저장된 값이 없을 경우 마지막 cnt 값을 arr에 저장하지 않고 while문을 탈출하기 때문에 최종으로 arr에 cnt값
		//1회 저장 명령 수행
		
		int[] answer=new int[arr.size()];//arr의 값을 answer 배열에 동일하게 할당
		for(int i=0;i<arr.size();i++) {
			answer[i]=arr.get(i);
		}
		
        return answer;
    }

}
