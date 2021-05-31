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
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
       //잔업을 완수하기까지 남은 일수를 계산하여 arr1에 삽입
        for(int i=0;i<progresses.length;i++){
            int num=0;
            num = 100 - progresses[i];
            if(num%speeds[i]!=0){
                num=num/speeds[i] + 1;
            }
            else{num = num / speeds[i];}
            arr1.add(num);
        }
        //남은일수가 계산된 arr1의 값을 이용하여 첫 값보다 작은값들은 모두 첫 값이 배포되는 날에 배포될 것이므로 해당 값들 모두 산출하여 arr2에 저장
        for(int i=0;i<arr1.size();i++){
            int cnt=1;
            for(int j=i+1;j<arr1.size();j++){
                if(arr1.get(i)>=arr1.get(j)){
                    cnt++;
                }
                else{
                    break;
                }
                
            }
            arr2.add(cnt);
            i= i + cnt -1;
        }
        //arr2에 저장된 값들을 answer에 옮김.
        int[] answer = new int[arr2.size()];
        for(int i=0;i<arr2.size();i++){
            answer[i]=arr2.get(i);
        }
        return answer;
    }

}
