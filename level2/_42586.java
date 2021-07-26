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

		Queue<Integer> que = new LinkedList<>();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<progresses.length;i++) {
			
			int a=100-progresses[i];
			
			if(a%speeds[i]!=0) {
				que.add(a/speeds[i]+1);
			}
			else {
				que.add(a/speeds[i]);
			}
			
		}
		
		int cnt=1;
		int peek=que.poll();
		while(!que.isEmpty()) {
			if(que.peek()<=peek) {
				cnt++;
				que.remove();
			}
			else {
				arr.add(cnt);
				peek=que.poll();
				cnt=1;
			}
		}
		arr.add(cnt);
		int[] answer=new int[arr.size()];
		for(int i=0;i<arr.size();i++) {
			answer[i]=arr.get(i);
		}
		
        return answer;
    }

}
