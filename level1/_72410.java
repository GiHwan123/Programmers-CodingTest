package level1;

public class _72410 {
	
	public static void main(String[] args) {

		String input = "=.=";
		String answer = solution(input);
		System.out.println(answer);
	}

    public static String solution(String new_id) {
        String answer = "";
        StringBuffer st = new StringBuffer();
        String special = "~!@#$%^&*()=+[{]}:?,<>/";
        
      //1단계 대문자를 모두 소문자로 변환
        answer = new_id.toLowerCase();
        st.append(answer);
        
      //2단계 불필요한 특수문자 모두 제거
        for(int i=0;i<st.length();i++) {
        	
        	for(int j=0;j<special.length();j++) {
        		
        		if(special.charAt(j)==st.charAt(i)) {
        			st.deleteCharAt(i);
        			i=i-1;//삭제로 인해 스트링 길이가 1 줄어들기 때문에 한칸씩 땡겨짐. 그래서 1을 마이너스 해주어 제자리에서 다시 돌아야함.
        			break;
        		}
        		
        	}
        	
        }
      //3단계 연속된 마침표 1개로 통일
        for(int i=0;i<st.length()-1;i++) {
        	if(st.charAt(i)=='.' && st.charAt(i+1)=='.') {
        		st.deleteCharAt(i);
        		i=i-1;
        	}
        }
      //4단계 처음/끝부분 마침표 존재 시 제거
        if(st.charAt(0)=='.') {
        	st.deleteCharAt(0);
        }
        if(st.length()!=0 && st.charAt(st.length()-1)=='.') {//4단계
        	st.deleteCharAt(st.length()-1);
        }
      //5단계 공백일 시 a 삽입
        String temp = st.toString();//스트링버퍼를 잠시 스트링으로 변환시켜 공백 확인
        if(temp.equals("")) {
        	st.append("a");
        }
      //6단계 16자 넘어갈 시 15까지 짜르고 마지막 마침표 삭제
        if(st.length()>=16) {
        	for(int i=st.length()-1;i>14;i--) {
        		st.deleteCharAt(i);
        	}
        	if(st.charAt(st.length()-1)=='.') {
        		st.deleteCharAt(st.length()-1);
        	}
        }
        //7단계 2글자 이하일 경우 마지막 문자 길이 3 될때까지 끝부분에 붙이기
        if(st.length()<=2) {
        	for(int i=st.length();i<3;i++) {
        		st.append(st.charAt(st.length()-1));
        	}
        }
        answer= st.toString();
        return answer;
    }
}
