package level1;

import java.util.Arrays;

public class _42748 {
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, 
							{4, 4, 1}, 
							{1, 7, 3}};
		int answer[] = solution(array,commands);
		int[] temp = Arrays.copyOfRange(array, 4, 7);//copyofRange 메소드(배열을 일정부분 짤라서 그대로 가져오는 메소드)
		System.out.println(Arrays.toString(answer));
		System.out.println(Arrays.toString(temp));
	}
	
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for(int i=0;i<commands.length;i++) {
			//지정된 왼쪽,오른쪽 인덱스 만큼의 새로운 배열을 생성하기위해 그 차이값을 지정 후 해당값 만큼의 배열 생성
			int left=commands[i][0]-1;
			int right=commands[i][1]-1;
			int[] temp = null;
			if(right-left!=0) {
				temp = new int[right-left+1];
			}
			else if(right-left == 0) {
				temp = new int[1];
			}
			//특정 array 부분 배열 잘라낸 후 오름차순 정렬
			for(int j=0;j<temp.length;j++) {
				temp[j]=array[left+j];
			}
			Arrays.sort(temp);
			//잘라낸 후 오름차순으로 정렬한 새로운 배열temp에서 k번째 오는 숫자가 return 해주어야할 값임
			int num=0;
			for(int k=0;k<commands[i][2];k++) {
				num=temp[k];
			}
			answer[i]=num;
		}
		
        return answer;
    }

}
