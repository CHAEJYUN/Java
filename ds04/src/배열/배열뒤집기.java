package 배열;

import java.util.*;

public class 배열뒤집기 {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
		Solution2 sol = new Solution2();
		int[] answer = sol.solution(num_list);
		System.out.println(Arrays.toString(answer));
	}

}

class Solution2 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        //수도코드(모의, 가짜 코드)
        //반복문 사용
        //num_list에서 0부터 꺼내주고
        //answer 배열의 뒤에서 하나씩 넣어준다
        //=> 뒤에서부터 카운트해 줄 변수 j 필요
        //=> j변수의 시작은 맨 뒤부터 시작 해야 num_list.length - 1
        int j = num_list.length - 1;
        for(int i = 0; i < num_list.length; i ++) {
        	answer[j] = num_list[i];
        	j--;
        }
        return answer;
    }
}