package level1;

import java.util.Arrays;

public class _42748 {
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, 
							{4, 4, 1}, 
							{1, 7, 3}};
		int answer[] = solution(array,commands);
		int[] temp = Arrays.copyOfRange(array, 4, 7);//copyofRange �޼ҵ�(�迭�� �����κ� ©�� �״�� �������� �޼ҵ�)
		System.out.println(Arrays.toString(answer));
		System.out.println(Arrays.toString(temp));
	}
	
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for(int i=0;i<commands.length;i++) {
			//������ ����,������ �ε��� ��ŭ�� ���ο� �迭�� �����ϱ����� �� ���̰��� ���� �� �ش簪 ��ŭ�� �迭 ����
			int left=commands[i][0]-1;
			int right=commands[i][1]-1;
			int[] temp = null;
			if(right-left!=0) {
				temp = new int[right-left+1];
			}
			else if(right-left == 0) {
				temp = new int[1];
			}
			//Ư�� array �κ� �迭 �߶� �� �������� ����
			for(int j=0;j<temp.length;j++) {
				temp[j]=array[left+j];
			}
			Arrays.sort(temp);
			//�߶� �� ������������ ������ ���ο� �迭temp���� k��° ���� ���ڰ� return ���־���� ����
			int num=0;
			for(int k=0;k<commands[i][2];k++) {
				num=temp[k];
			}
			answer[i]=num;
		}
		
        return answer;
    }

}
