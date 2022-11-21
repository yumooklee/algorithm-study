package beakjoon.a6string;

import java.util.Scanner;

public class AA10GroupWordChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int wordCount = scanner.nextInt();
		
		//1 ~ 100일 경우
		if(wordCount >= 1 && wordCount <= 100) {
			//그룹 단어의 개수(결과값)
			int result = 0;
			
			//단어의 개수만큼 반복
			for (int i = 0; i < wordCount; i++) {
				//단어
				String word = scanner.next();
				
				//단어 길이가 최대 100일 경우
				if(word.length() <= 100) {
					//단어의 각 문자별 배열로 선언한 변수
					char[] arrCharWord = word.toCharArray();
					//연속하는 문자인지 비교하기 위한 변수
					char tempString = arrCharWord[0];
					//연속하는 문자 제거한 변수
					String removeContinueWord = String.valueOf(arrCharWord[0]);
					//문자 중복 제거한 변수
					String removeDistinctWord = String.valueOf(arrCharWord[0]);
					
					//단어 길이만큼 반복
					for (int j = 1; j < arrCharWord.length; j++) {
						//연속하는 문자가 아닐 경우 문자 추가
						if(tempString != arrCharWord[j]) {
							removeContinueWord += arrCharWord[j];
						}
						
						//문자가 해당 변수에 포함되지 않을 경우 문자 추가
						if(!removeDistinctWord.contains(String.valueOf(arrCharWord[j]))) {
							removeDistinctWord += arrCharWord[j];
						}
						
						//다음 문자와 비교를 위한 변수 설정
						tempString = arrCharWord[j];
					}
					
					//두 단어가 동일할 경우 그룹 단어이므로 결과값 +1
					if(removeContinueWord.equals(removeDistinctWord)) {
						result++;
					}
				}
			}
			
			//결과값 출력
			System.out.println(result);
		}
	}

}
