package level2;

import java.util.*;
public class _42586 {
	
	public static void main(String[] args) {
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		int[] answer = solution(progresses,speeds);
		System.out.println(Arrays.toString(answer));
	}
	public static int[] solution(int[] progresses, int[] speeds) {
	       
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        //������ ��� �Ϸ��ϱ���� �ɸ��� �ð��� ���� ArrayList�� �� �Ҵ�
        for(int i=0;i<progresses.length;i++){
            
            int rest = 100 - progresses[i];
            int speed = speeds[i];
            int cnt=0;
            if(rest%speed == 0)
            	cnt = rest/speed;
            else if(rest%speed != 0)
            	cnt = (rest/speed)+1;
            arr.add(cnt);
        }
        //ArrayList�� ����� ���� �� ���� ���ǰ����� ���� ���� ��� �����Ͽ� �� ���ڸ� ���� �� �ٸ� ArrayList�� ����.
        for(int i=0;i<arr.size();i++){
            int cnt=1;
            for(int j=i+1;j<arr.size();j++){
                if(j>=arr.size())
                    break;
                if(arr.get(i)>=arr.get(j)){
                    cnt++;
                    continue;
                }
                else
                    break;
            }
            arr2.add(cnt);
            i=i+cnt-1;
        }
        //���������� ����� ArrayList2�� ������ answer�� return
        int[] answer = new int[arr2.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=arr2.get(i);
        }
        return answer;
    }

}
