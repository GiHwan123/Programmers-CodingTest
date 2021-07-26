package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class _42584 {

	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3 , 3 ,1};
		int[] answer = solution(prices);
		System.out.println(Arrays.toString(answer));
	}

	
	public static int[] solution(int[] prices) {
        Stack<Integer> beginIdxs = new Stack<>();
        int i=0;
        int[] terms = new int[prices.length];

        beginIdxs.push(i);
        for (i=1; i<prices.length; i++) {
            while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
                int beginIdx = beginIdxs.pop();
                terms[beginIdx] = i - beginIdx;
            }
            beginIdxs.push(i);
        }
        while (!beginIdxs.empty()) {
            int beginIdx = beginIdxs.pop();
            terms[beginIdx] = i - beginIdx - 1;
        }

        return terms;
    }
}
