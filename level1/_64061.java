package level1;
import java.util.*;

public class _64061 {
	
	public static void main (String[] args) {
		int[][] board = {	{0,0,0,0,0},
							{0,0,1,0,3},
							{0,2,5,0,1},
							{4,2,4,4,2},
							{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		int answer=0;
		answer=solution(board,moves);
		System.out.println(answer);
	}
	
	public static int solution(int[][]board,int[] moves) {
		int answer=0;
		ArrayList<Integer> bucket = new ArrayList<Integer>();
		int now=0;
		for(int i=0;i<moves.length;i++) {
			
			now=moves[i]-1;
			
			for(int j=0;j<board.length;j++) {//�ش� ��ġ ���� �̾Ƴ� �� �� �ڸ� 0���� ����
				
				if(board[j][now]==0)
					continue;
				else {
					bucket.add(board[j][now]);
					board[j][now]=0;
					break;
				}
			}
			
			if(bucket.size()==0 || bucket.size()==1) {//�ٱ��Ͽ� ���� 1�� ���Ϸ� ����ִٸ� �����̵����� �н�
				continue;
			}
			
			else if(bucket.size()>=2) {//�ٱ��Ͽ� ���� 2�� �̻��̶�� ���� 2�� �� �� �� ������ ����Ʈ���� ����
				int num1=0,num2=0;
				num1=bucket.get(bucket.size()-1);
				num2=bucket.get(bucket.size()-2);
				if(num1==num2) {
					bucket.remove(bucket.size()-1);
					bucket.remove(bucket.size()-1);
					answer=answer+2;
				}
			}
		}
		return answer;
	}

}
