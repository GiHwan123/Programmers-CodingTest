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

		Queue<Integer> que = new LinkedList<>();//ť ����
		ArrayList<Integer> arr = new ArrayList<>();//���� �迭�� ũ�⸦ ������ ArrayList
		
		for(int i=0;i<progresses.length;i++) {
			
			int a=100-progresses[i];//100 - ���� ���� �ϼ����� �������� ����(�����ܾ���)
			
			if(a%speeds[i]!=0) {//�����ܾ���%��������ӵ��� ���� 0 �� �ƴҰ��(�������� �����Ұ��) ���� �ϼ� + 1
				que.add(a/speeds[i]+1);//ť�� �۾��Ϸ���� ���� �ϼ� ����
			}
			else {//���� ������ ������ ��� �ش� ���� ť�� ����
				que.add(a/speeds[i]);
			}
			
		}
		
		int cnt=1;
		int peek=que.poll();//ť�� ó�� ����� �� ������ ����
		
		while(!que.isEmpty()) {//ť�� ���� �������� ���� �� ���� �ݺ�
			
			if(que.peek()<=peek) {//ť���� �̾Ƴ� ������ ���� ť ���� �����ϴ� ù ���� ���� ��� �ش� �� ���� �� cnt++
				cnt++;
				que.remove();
			}
			
			else {//ť���� �̾Ƴ� ������ ���� ť ���� �����ϴ� ù ���� ū ��� cnt���� arraylist�� ���� �� ť ���� ù ����
				//peek ���� �����ϰ� cnt �ʱ�ȭ
				arr.add(cnt);
				peek=que.poll();
				cnt=1;
			}
		}
		arr.add(cnt);//ť�� ����� ���� ���� ��� ������ cnt ���� arr�� �������� �ʰ� while���� Ż���ϱ� ������ �������� arr�� cnt��
		//1ȸ ���� ��� ����
		
		int[] answer=new int[arr.size()];//arr�� ���� answer �迭�� �����ϰ� �Ҵ�
		for(int i=0;i<arr.size();i++) {
			answer[i]=arr.get(i);
		}
		
        return answer;
    }

}
