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
        
        for(int i=0;i<prices.length;i++) {//이중 포문을 이용해 현재 값과 이후의 값들을 모두 비교해준다
        	int cnt=0;
        	
        	for(int j=i+1;j<prices.length;j++) {//i+1 부터 시작해 i값을 기준으로 뒷배열 값들을 비교.
        		if(j == prices.length) {//배열의 길이를 넘어갈 시 0을 저장 후 break
        			cnt=0;
        			break;
        		}
        		else if(prices[i]<=prices[j]){//현재 기준값인 prices[i]값보다 크거나 같은 값들의 길이를 count
        			cnt++;
        		}
        		else {//기준값보다 작은 값이 발견될 경우 cnt 1 증가 후 반복문 중지
        			cnt++;
        			break;
        		}
        	}
        	arr.add(cnt);//answer배열의 길이를 동적으로 할당하기 위해 ArrayList에 각 결과값들을 할당
        	
        }
        answer=new int[arr.size()];//ArrayList의 크기만큼 배열의 길이 할당
        for(int i=0;i<answer.length;i++) {// 값을 answer 배열에 할당
        	answer[i]=arr.get(i);
        }
        return answer;
    }
}
