package level1;

public class _12903 {
	
	public static void main(String[] args) {
		String s = "abce";
		String answer = solution(s);
		System.out.println(answer);
	}
	
	public static String solution(String s) {
        String answer = "";
        //�Է¹��� ��Ʈ�����̰� ¦��,Ȧ���� �� ���� ���� ������ ���̸� 2�� ���� ��Ʈ���� �߰��ε��� ���� ��
        //¦���� ��� �߰��� 2��, Ȧ���� ��� ���߾� �� 1�� ����
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
