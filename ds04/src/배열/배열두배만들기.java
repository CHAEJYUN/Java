package 배열;

import java.util.*; //코테할 때 임포트 먼저 필수우ㅜㅜㅜㅜ
					//Data, Random, Collection, Arrays
//import java.lang.*; //System, Integer, String

public class 배열두배만들기 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		Solution1 sol = new Solution1();
		int[] answer = sol.solution(numbers);
		System.out.println(Arrays.toString(answer));
	}

}

class Solution1 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length]; //{0, 0, 0} 초기화 상태
        //{1, 2, 3, 4, 5} -> {2, 4, 6, 8, 10}
        //반복문 사용해
        //numbers배열 인덱스 0부터 꺼내와 2배로 곱한 후
        //answer배열 같은 위치에 넣는다
        for(int i = 0; i < numbers.length; i++) {
        	answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}