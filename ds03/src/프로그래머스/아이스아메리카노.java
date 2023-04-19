package 프로그래머스;

import java.util.Arrays;

public class 아이스아메리카노 {

	public static void main(String[] args) {
		int money = 15000;
		Solution8 sol = new Solution8();
		int[] answer = sol.solution(money);
		System.out.println(Arrays.toString(answer));
	}

}

class Solution8 {
    public int[] solution(int money) {
    	 int[] answer = {0, 0};
    	 //int[] answer = new int[2];
    	 int price = 5500;
    	 answer[0] = money / price;
    	 answer[1] = money % price;
         return answer;
    }
}