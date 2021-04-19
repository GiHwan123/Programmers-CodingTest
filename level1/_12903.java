package level1;

public class _12903 {
	
	public static void main(String[] args) {
		String s = "abce";
		String answer = solution(s);
		System.out.println(answer);
	}
	
	public static String solution(String s) {
        String answer = "";
        //입력받은 스트링길이가 짝수,홀수인 두 가지 경우로 나누어 길이를 2로 나눈 스트링의 중간인덱스 산출 후
        //짝수일 경우 중간값 2개, 홀수이 경우 정중앙 값 1개 산출
        if(s.length()%2==0) {
        	int index = s.length()/2;
        	answer = s.substring(index-1,index+1);
        }
        else{
        	int index = s.length()/2;
        	answer = s.substring(index,index+1);
        }
        return answer;
    }

}
