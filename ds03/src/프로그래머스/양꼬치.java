package 프로그래머스;

public class 양꼬치 {

	public static void main(String[] args) {
		int n = 10;
		int k = 3;
		Solution2 sol = new Solution2();
		int answer = sol.solution(n, k);
		System.out.println(answer);
	}

}

class Solution2 {
	public int solution(int n, int k) {
        int answer = 0;
        int free = n / 10;
        answer = n * 12000 + k * 2000 - free * 2000;
        return answer;
    }
}