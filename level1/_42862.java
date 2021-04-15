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
		//1~n까지 학생번호마다 각각 도난당하기전에 1벌씩은 가지고 있으므로 1 저장
		for(int i=1;i<=n;i++) {
			student[i]=1;
		}
		//도난당한 학생의 번호는 -1, 여벌의 체육복을 가지고있는 학생의 번호는 +1
		for(int i=0; i<lost.length;i++) {
			student[lost[i]]--;
		}
		for(int i=0;i<reserve.length;i++) {
			student[reserve[i]]++;
		}
		//1번,30번 학생의 경우는 각각 한방향으로만 빌릴 수 있기 때문에 앞에 AND 조건문으로 양방향을
		//체크하지 않도록 제한조건을 걸어둔다. 이후 저장된 값이 2 이면서 양방향에 0이 저장된 학생이 존재할 경우
		//2에 저장된 값은 -1, 양방향 중 한방향에는 +1 
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
		//student 배열에 저장된 값들 중 값이 1이상 저장된 학생만이 수업에 참여할 수 있는 학생이므로
		// 1이상의 값이 저장된 갯수를 카운트하여 answer 값으로 return 한다.
		for(int i=1; i<=n; i++) {
			if(student[i]>0) {
				answer++;
			}
		}
		return answer;
	}
	

}
