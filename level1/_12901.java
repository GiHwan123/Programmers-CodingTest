package level1;

public class _12901 {
	
	public static void main(String[] args) {
		int a=3;
		int b=1;
		String answer = solution(a,b);
		System.out.println(answer);
	}
	
    public static String solution(int a, int b) {
    	//7���� ���� �� 2016�� 12�� �ſ� �ִ� �ϼ��� ����ִ� �迭 ����
    	String[] Day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
    	int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
    	int cnt=0;
    	//�Է¹��� �� �������� ��� �ϼ��� ���ϰ�, 7�� ���� ������ ���� b �� ���� �� ���⼭ �ٽ� 7�γ��� �������� ����
    	//�� ���� �ǹ̴� 1��1���� �ݿ��Ϻ��� �����̹Ƿ� 1��1�Ϻ��� 7�ϰ������� �ݿ����� ã�ƿ�.
    	//��, �ش� �ϱ����� ��� �ϼ��� ���Ͽ� 7�� ���� �������� �ݿ��Ϻ��� �����Ͽ� a��b�� ������ ������ ���������� ī��Ʈ��
    	String answer = "";
    	for(int i=0;i<a-1;i++) {
    		cnt=cnt+month[i];
    	}
    	cnt = cnt + (b-1);
    	cnt = cnt % 7;
    	//7������ ���� cnt�� ����� ���̹Ƿ� �迭�� ũ�Ⱑ 7�� Day�迭�� �ݺ����� ������� �״�� ������־ �����ϴ�.
    	answer=Day[cnt];
        /* �� �ڵ�� cnt ���� 0 �� ��� ������ ���� �ʱ� ������ �����߻���.
         * for(int i=0;i<cnt;i++){
         * answer = Day[i]; 
         * }*/
        return answer;
    }

}
