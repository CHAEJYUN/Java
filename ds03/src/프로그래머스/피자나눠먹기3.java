package 프로그래머스;

public class 피자나눠먹기3 {

	public static void main(String[] args) {
		int slice = 20;
		int n = 12;
		Solution4 sol = new Solution4();
		int answer = sol.solution(slice, n);
		System.out.println(answer);
	}

}

class Solution4 {
	public int solution(int slice, int n) {
        int answer = 0;
        answer = n / slice + n;
        return answer;
    }
}