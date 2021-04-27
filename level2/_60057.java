package level2;

import java.util.ArrayList;

public class _60057 {
	
	public static void main(String[] args) {
		String s = "abcabcdede";
		int answer = solution(s);
		System.out.println(answer);
	}
	
	public static int solution(String s) {
        int answer = 0;
        //문자열을 1~길이 단위로 짤라낸 후 공식을 적용한 최종 스트링의 길이값들을 저장할 ArrayList 선언
    	ArrayList<Integer> sub = new ArrayList<>();
    	//1~스트링의 길이까지 단위값들로 짤라냄
        for(int i=1;i<=s.length();i++) {
        	//단위길이로 짤라낸 스트링 값들을 저장할 arr, 중복되는 단위문자열 값들의 수를 저장할 arr2
        	ArrayList<String> arr = new ArrayList<>();
        	ArrayList<Integer> arr2 = new ArrayList<>();
        	//우선 arr에 단위값들로 짤라낸 문자열들을 순차적으로 저장함
        	for(int j=0;j<s.length();j=j+i) {
        		if(j>s.length())
        			break;
        		if(j+i<=s.length())
        			arr.add(s.substring(j,j+i));
        		else {
        			arr.add(s.substring(j,s.length()));
        		}
        	}
        	
        	int cnt=1;
        	//arr의 값들을 토대로 순차적으로 같은값을 가질 경우 cnt를 증가시키며 일치하지 않는 문자열 만날 경우
        	//해당 cnt 값 arr2에 저장 후 cnt값 1로 초기화
        	for(int j=0;j<arr.size();j++) {
        		if(j+1 != arr.size() && arr.get(j).equals(arr.get(j+1))) {
        			cnt++;
        		}
        		else {
        			arr2.add(cnt);
        			cnt=1;
        		}
        	}
        	
        	String temp = "";
        	int k=0;
        	//arr2에 저장된 값이 중복된값(2이상의 값)일 경우 arr2에 저장된 숫자 + arr에 저장된 문자열 붙여줌
        	//아닐 경우는 arr에 저장된 문자열만을 붙여줌
        	for(int j=0;j<arr.size();j++) {
        		if(arr2.get(k)!=1) {
        		temp=temp + arr2.get(k) + arr.get(j);
        		j=j+arr2.get(k)-1;
        		k++;
        		}
        		else {
        			temp=temp+arr.get(j);
        			j=j+arr2.get(k)-1;
        			k++;
        		}
        	}
        	//최종적으로 압축된 문자열의 길이를 sub 값에다 저장
        	sub.add(temp.length());
        }
        //sub에 저장된 모든 값들을 비교하여 최소값을 return
        answer=sub.get(0);
        for(int i=0;i<sub.size()-1;i++) {
        	if(answer>sub.get(i))
        		answer=sub.get(i);
        }
        return answer;
    }

}
