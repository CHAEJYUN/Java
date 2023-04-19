package 프로그래머스;

public class 머쓱이보다키큰사람 {

	public static void main(String[] args) {
		int[] array = {149, 180, 192, 170};
		int height = 167;
		Solution6 sol = new Solution6();
		int answer = sol.solution(array, height);
		System.out.println(answer);
	}

}

class Solution6 {
    public int solution(int[] array, int height) {
        int result = 0;
        for(int i = 0; i < array.length; i++) {
            if(height < array[i]){
                result++;
            }
        }
        return result;
    }
}