package level2;

import java.util.ArrayList;
import java.util.Arrays;

public class _42584 {

	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		int[] answer = solution(prices);
		System.out.println(Arrays.toString(answer));
	}

	
	public static int[] solution(int[] prices) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<prices.length;i++) {//���� ������ �̿��� ���� ���� ������ ������ ��� �����ش�
        	int cnt=0;
        	
        	for(int j=i+1;j<prices.length;j++) {//i+1 ���� ������ i���� �������� �޹迭 ������ ��.
        		if(j == prices.length) {//�迭�� ���̸� �Ѿ �� 0�� ���� �� break
        			cnt=0;
        			break;
        		}
        		else if(prices[i]<=prices[j]){//���� ���ذ��� prices[i]������ ũ�ų� ���� ������ ���̸� count
        			cnt++;
        		}
        		else {//���ذ����� ���� ���� �߰ߵ� ��� cnt 1 ���� �� �ݺ��� ����
        			cnt++;
        			break;
        		}
        	}
        	arr.add(cnt);//answer�迭�� ���̸� �������� �Ҵ��ϱ� ���� ArrayList�� �� ��������� �Ҵ�
        	
        }
        answer=new int[arr.size()];//ArrayList�� ũ�⸸ŭ �迭�� ���� �Ҵ�
        for(int i=0;i<answer.length;i++) {// ���� answer �迭�� �Ҵ�
        	answer[i]=arr.get(i);
        }
        return answer;
    }
}
