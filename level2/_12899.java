package level2;

import java.util.ArrayList;
import java.util.Collections;

public class _12899 {
	
	public static void main(String[] args) {
		int n = 10;
		String answer = solution(n);
		System.out.println(answer);
	}
	
	 public static String solution(int n) {
	        String answer = "";
	        int remainder=0;//n 을  3 으로 나눈 나머지의 값을 저장할 변수
	       
	        while(n>0){
	            remainder=n%3;
	            n=n/3;
	            //나머지가 0인 경우 즉, 3의 배수일 경우에는 0의 값에 4를 대신해서 넣어주고 
	            //나눈 몫의 값에 -1을 해줌
	            if(remainder==0){
	                answer="4"+answer;
	                n--;
	            }
	            else if(remainder==1){
	                answer="1" + answer;
	            }
	            else if(remainder==2){
	                answer="2" + answer;
	            }
	        }
	        
	        return answer;
	    }
}
