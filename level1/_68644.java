package level1;
import java.util.*;

public class _68644 {
	public static void main(String[] args) {
		int[] a = {5,0,2,7};
		int[] answer= {};
		answer = solution(a);
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}
	
	public static int[] solution(int[] numbers) {
	        int[] answer = {};
	        ArrayList<Integer> arr=new ArrayList<Integer>();
	       
	        for(int i=0;i<numbers.length-1;i++) {
	        	
	        	for(int j=i+1;j<numbers.length;j++) {
	        		int temp=0;
	        		temp=numbers[i]+numbers[j];
	        		if(!arr.contains(temp)) {
	        			arr.add(temp);
	        		}
	        		
	        	}
	        }
	        Collections.sort(arr);
	        answer=new int[arr.size()];
	        for(int i=0;i<answer.length;i++) {
	        	answer[i]=arr.get(i);
	        }
	        return answer;
	    }

}

