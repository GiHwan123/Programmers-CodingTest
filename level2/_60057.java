package level2;

import java.util.ArrayList;

public class _60057 {
	
	public static void main(String[] args) {
		String s = "xababcdcdababcdcd";
		int answer = solution(s);
		System.out.println(answer);
	}
	
	public static int solution(String s) {
		int answer=0;
		int length= s.length();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=1;i<=length;i++) {
			ArrayList<String> arr1 = new ArrayList<>();
			for(int j=0;j<s.length();j++) {
				if(j+i<=length) {
				arr1.add(s.substring(j,j+i));
				j=j+i-1;
				}
				else {
				arr1.add(s.substring(j,s.length()));
				}
			}
			
			int cnt=1;
			String temp="";
			
			for(int j=0;j<arr1.size();j++) {
				if(j+1<arr1.size() && (arr1.get(j)).equals(arr1.get(j+1))){
					cnt++;
					continue;
				}
				else {
					if(cnt==1) {
						temp=temp+arr1.get(j);
						cnt=1;
					}
					else {
						temp=temp+cnt+arr1.get(j);
						cnt=1;
					}
				}
			}
			arr.add(temp.length());
		}
		
		int min=arr.get(0);
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)<min)
				min=arr.get(i);
		}
		answer=min;
		return answer;
	}
}
