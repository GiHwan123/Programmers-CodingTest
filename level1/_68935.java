package level1;

import java.util.ArrayList;

public class _68935 {
	
	public static void main(String[] args) {
		int n=45;
		int answer = solution(n);
		System.out.println(answer);
	}
	public static int solution(int n) {
		int answer=0;
		int extra=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
	//�¿���� ���·� ArrayList�� ����(���ʿ� ArrayList���� �������·� ����Ǳ� ������ 1�������� ��������)
		while(true) {
			extra=n%3;
			n=n/3;
			arr.add(extra);
			if(n<=0)
				break;
			
		}
	//ArrayList�� ����Ǿ��ִ� ���� ���ڸ��� �������� ��ȯ�Ͽ� answer�� �� ����
		int num=0;
		int k=0;
		for(int i=arr.size()-1;i>=0;i--) {
			num=num + (arr.get(i)*(int)Math.pow(3, k));
			k++;
		}
		answer=num;
		return answer;
	}

}
