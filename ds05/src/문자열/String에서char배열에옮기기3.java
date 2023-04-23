package 문자열;

import java.util.*;

public class String에서char배열에옮기기3 {

	public static void main(String[] args) {
		
		String sno = "2056521";
		
		// 1.
		char c1 = sno.charAt(sno.length() - 1);
		if(c1 == '1') {
			System.out.println("서대문구에서 출생");
		}
		
		// 2.
		char[] two = new char[2];
		sno.getChars(4, 6, two, 0);
		System.out.println(Arrays.toString(two));
		
		//char을 int로
		int i1 = Character.getNumericValue(two[0]);
		int i2 = Character.getNumericValue(two[1]);
		int sum = i1 + i2;
		System.out.println(sum);
		if(sum < 10) {
			System.out.println("유효한 주민번호");
		}else {
			System.out.println("유효하지 않은 주민번호");
		}
		
		// 3. 주민번호에 포함된 5의 개수 프린트
		//방법 - 1
		String[] stringArray = sno.split("");
		int count = 0;
		for (String s : stringArray) {
			if(s.equals("5")) {
				count++;
			}
		}
		System.out.println(count);
		//방법 - 2
		int count2 = 0;
		for (int i = 0; i < sno.length(); i++) { //String이기 때문에 length를 따로 구해줘야 함?
			char c = sno.charAt(i);
			if(c == '5') {
				count2++;
			}
		}
		System.out.println(count2);
		
		//index를 빨리 찾는 함수
		System.out.println(Arrays.binarySearch(stringArray, "5"));
		
		//배열에 특정한 값을 한꺼번에 변경할 수 있는 함수
		Arrays.fill(stringArray, 0, 3, "hoho");
		System.out.println(Arrays.toString(stringArray));
		
		//배열의 순서를 다 뒤집는 함수
		Arrays.sort(stringArray); //오름차순으로 정렬
		System.out.println(Arrays.toString(stringArray));
		//Arrays로 내림차순은 너무 복잡해서 컬렉션으로 변환해서 하는게 간단하다
		
		List<String> list = Arrays.asList(stringArray);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
		//배열에 데이터의 빈도수 구하는 함수 
		int count3 = Collections.frequency(list, "hoho");
		System.out.println(count3);
	}

}
