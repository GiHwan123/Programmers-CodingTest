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
        
      //1�ܰ� �빮�ڸ� ��� �ҹ��ڷ� ��ȯ
        answer = new_id.toLowerCase();
        st.append(answer);
        
      //2�ܰ� ���ʿ��� Ư������ ��� ����
        for(int i=0;i<st.length();i++) {
        	
        	for(int j=0;j<special.length();j++) {
        		
        		if(special.charAt(j)==st.charAt(i)) {
        			st.deleteCharAt(i);
        			i=i-1;//������ ���� ��Ʈ�� ���̰� 1 �پ��� ������ ��ĭ�� ������. �׷��� 1�� ���̳ʽ� ���־� ���ڸ����� �ٽ� ���ƾ���.
        			break;
        		}
        		
        	}
        	
        }
      //3�ܰ� ���ӵ� ��ħǥ 1���� ����
        for(int i=0;i<st.length()-1;i++) {
        	if(st.charAt(i)=='.' && st.charAt(i+1)=='.') {
        		st.deleteCharAt(i);
        		i=i-1;
        	}
        }
      //4�ܰ� ó��/���κ� ��ħǥ ���� �� ����
        if(st.charAt(0)=='.') {
        	st.deleteCharAt(0);
        }
        if(st.length()!=0 && st.charAt(st.length()-1)=='.') {//4�ܰ�
        	st.deleteCharAt(st.length()-1);
        }
      //5�ܰ� ������ �� a ����
        String temp = st.toString();//��Ʈ�����۸� ��� ��Ʈ������ ��ȯ���� ���� Ȯ��
        if(temp.equals("")) {
        	st.append("a");
        }
      //6�ܰ� 16�� �Ѿ �� 15���� ¥���� ������ ��ħǥ ����
        if(st.length()>=16) {
        	for(int i=st.length()-1;i>14;i--) {
        		st.deleteCharAt(i);
        	}
        	if(st.charAt(st.length()-1)=='.') {
        		st.deleteCharAt(st.length()-1);
        	}
        }
        //7�ܰ� 2���� ������ ��� ������ ���� ���� 3 �ɶ����� ���κп� ���̱�
        if(st.length()<=2) {
        	for(int i=st.length();i<3;i++) {
        		st.append(st.charAt(st.length()-1));
        	}
        }
        answer= st.toString();
        return answer;
    }
}
