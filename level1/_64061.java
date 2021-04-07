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
			
			for(int j=0;j<board.length;j++) {//해당 위치 인형 뽑아낸 후 그 자리 0으로 변경
				
				if(board[j][now]==0)
					continue;
				else {
					bucket.add(board[j][now]);
					board[j][now]=0;
					break;
				}
			}
			
			if(bucket.size()==0 || bucket.size()==1) {//바구니에 값이 1개 이하로 들어있다면 다음이동으로 패스
				continue;
			}
			
			else if(bucket.size()>=2) {//바구니에 값이 2개 이상이라면 끝에 2개 값 비교 후 같으면 리스트에서 삭제
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
