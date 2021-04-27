package level2;

import java.util.ArrayList;

public class _60057 {
	
	public static void main(String[] args) {
		String s = "abcabcdede";
		int answer = solution(s);
		System.out.println(answer);
	}
	
	public static int solution(String s) {
        int answer = 0;
        //���ڿ��� 1~���� ������ ©�� �� ������ ������ ���� ��Ʈ���� ���̰����� ������ ArrayList ����
    	ArrayList<Integer> sub = new ArrayList<>();
    	//1~��Ʈ���� ���̱��� ��������� ©��
        for(int i=1;i<=s.length();i++) {
        	//�������̷� ©�� ��Ʈ�� ������ ������ arr, �ߺ��Ǵ� �������ڿ� ������ ���� ������ arr2
        	ArrayList<String> arr = new ArrayList<>();
        	ArrayList<Integer> arr2 = new ArrayList<>();
        	//�켱 arr�� ��������� ©�� ���ڿ����� ���������� ������
        	for(int j=0;j<s.length();j=j+i) {
        		if(j>s.length())
        			break;
        		if(j+i<=s.length())
        			arr.add(s.substring(j,j+i));
        		else {
        			arr.add(s.substring(j,s.length()));
        		}
        	}
        	
        	int cnt=1;
        	//arr�� ������ ���� ���������� �������� ���� ��� cnt�� ������Ű�� ��ġ���� �ʴ� ���ڿ� ���� ���
        	//�ش� cnt �� arr2�� ���� �� cnt�� 1�� �ʱ�ȭ
        	for(int j=0;j<arr.size();j++) {
        		if(j+1 != arr.size() && arr.get(j).equals(arr.get(j+1))) {
        			cnt++;
        		}
        		else {
        			arr2.add(cnt);
        			cnt=1;
        		}
        	}
        	
        	String temp = "";
        	int k=0;
        	//arr2�� ����� ���� �ߺ��Ȱ�(2�̻��� ��)�� ��� arr2�� ����� ���� + arr�� ����� ���ڿ� �ٿ���
        	//�ƴ� ���� arr�� ����� ���ڿ����� �ٿ���
        	for(int j=0;j<arr.size();j++) {
        		if(arr2.get(k)!=1) {
        		temp=temp + arr2.get(k) + arr.get(j);
        		j=j+arr2.get(k)-1;
        		k++;
        		}
        		else {
        			temp=temp+arr.get(j);
        			j=j+arr2.get(k)-1;
        			k++;
        		}
        	}
        	//���������� ����� ���ڿ��� ���̸� sub ������ ����
        	sub.add(temp.length());
        }
        //sub�� ����� ��� ������ ���Ͽ� �ּҰ��� return
        answer=sub.get(0);
        for(int i=0;i<sub.size()-1;i++) {
        	if(answer>sub.get(i))
        		answer=sub.get(i);
        }
        return answer;
    }

}
