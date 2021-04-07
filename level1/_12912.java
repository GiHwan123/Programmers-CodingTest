package level1;

public class _12912 {

	public static void main(String[] args) {
		int a,b;
		long answer;
		a=5;
		b=3;
		answer=solution(a,b);
		System.out.println(answer);
	}
	public static long solution(int a, int b) {
        long answer = 0;
        if(a==b) {
        	answer=a;
        }
        else if(a<b) {
        	for(int i=a;i<=b;i++) {
        		answer+=i;
        	}
        }
        else if(a>b) {
        	for(int i=a;i>=b;i--) {
        		answer+=i;
        	}
        }
        return answer;
    }
}
