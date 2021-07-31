package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class _42840 {
	
	public static void main(String[] args) {
		int[] Question = {1,2,3,4,5};
		int[] answer= {};
		answer=solution(Question);
		System.out.println(Arrays.toString(answer));
	}
	
	public static int[] solution(int[] answers) {
		ArrayList<Integer> answer2 = new ArrayList<>();
		int[] supo1 = {1,2,3,4,5};
		int[] supo2 = {2,1,2,3,2,4,2,5};
		int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
		int su1=0;
		int su2=0;
		int su3=0;
		for(int i=0;i<answers.length;i++) {
			if(answers[i]==supo1[i % supo1.length]) {
				su1++;
			}
			if(answers[i]==supo2[i % supo2.length]) {
				su2++;
			}
			if(answers[i]==supo3[i % supo3.length]) {
				su3++;
			}
		}

		answer2.add(new Integer(su1));
		answer2.add(new Integer(su2));
		answer2.add(new Integer(su3));
		
		int max = Collections.max(answer2);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0;i<answer2.size();i++) {
			if(answer2.get(i)==max)
				arr.add(i+1);
		}
		int[] answer = new int[arr.size()];
		
		for(int i=0;i<arr.size();i++) {
			answer[i]=arr.get(i);
		}
		return answer;
	}

}
