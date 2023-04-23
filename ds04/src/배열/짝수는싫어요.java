package 배열;

import java.util.*;

public class 짝수는싫어요 {

	public static void main(String[] args) {
		int n = 10;
		Solution3 sol = new Solution3();
		int[] answer = sol.solution(n);
		System.out.println(Arrays.toString(answer));
	}

}

class Solution3 {
	public int[] solution(int n) {
		int size = 0;
		if(n % 2 == 0) {
			size = n * 1/2;
		}else {
			size = n * 1/2 +1;
		}
        int[] answer = new int[size];
        int j = 0; //answer에 홀수값 넣을 때 index로 사용할 예정
        for(int i = 0; i <= n; i++) {
        	if(i % 2 != 0) {
        		answer[j] = i;
        		j++;
        	}
        }
        return answer;
    }
}