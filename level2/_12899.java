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
	        int remainder=0;//n ��  3 ���� ���� �������� ���� ������ ����
	       
	        while(n>0){
	            remainder=n%3;
	            n=n/3;
	            //�������� 0�� ��� ��, 3�� ����� ��쿡�� 0�� ���� 4�� ����ؼ� �־��ְ� 
	            //���� ���� ���� -1�� ����
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
