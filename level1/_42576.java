package level1;

import java.util.Arrays;

public class _42576 {
	
	public static void main(String[] args) {
		String[] participant= {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = 	{"josipa", "filipa", "marina", "nikola"};
		String answer = solution(participant,completion);
		System.out.println(answer);
	}
	
	 public static String solution(String[] participant, String[] completion) {
		 String answer = "";
		 Arrays.sort(participant);
		 Arrays.sort(completion);
		 for(int i=0;i<completion.length;i++) {
			 if(!participant[i].equals(completion[i])) {
				 answer=participant[i];
				 break;
			 }
		 }
		 if(answer.equals("")) {
			 answer=participant[participant.length-1];
		 }
	        return answer;
	    }

}
