package level1;

public class _12901 {
	
	public static void main(String[] args) {
		int a=3;
		int b=1;
		String answer = solution(a,b);
		System.out.println(answer);
	}
	
    public static String solution(int a, int b) {
    	//7개의 요일 및 2016년 12개 매월 최대 일수를 담고있는 배열 선언
    	String[] Day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
    	int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
    	int cnt=0;
    	//입력받은 월 이전까지 모든 일수를 더하고, 7로 나눈 나머지 값에 b 값 더한 후 여기서 다시 7로나눈 나머지를 구함
    	//이 값의 의미는 1월1일이 금요일부터 시작이므로 1월1일부터 7일간격으로 금요일이 찾아옴.
    	//즉, 해당 일까지의 모든 일수를 더하여 7로 나눈 나머지는 금요일부터 시작하여 a월b일 까지의 요일을 순차적으로 카운트함
    	String answer = "";
    	for(int i=0;i<a-1;i++) {
    		cnt=cnt+month[i];
    	}
    	cnt = cnt + (b-1);
    	cnt = cnt % 7;
    	//7이하의 값만 cnt에 저장될 것이므로 배열의 크기가 7인 Day배열을 반복루프 연산없이 그대로 사용해주어도 무방하다.
    	answer=Day[cnt];
        /* 이 코드는 cnt 값이 0 일 경우 루프를 돌지 않기 때문에 오류발생함.
         * for(int i=0;i<cnt;i++){
         * answer = Day[i]; 
         * }*/
        return answer;
    }

}
