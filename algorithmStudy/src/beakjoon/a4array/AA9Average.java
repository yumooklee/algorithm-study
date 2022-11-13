package beakjoon.a4array;

import java.util.Scanner;

public class AA9Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//테스트케이스 개수
		int testCaseCount = scanner.nextInt();
		
		//테스트케이스 개수만큼 반복
		for (int i = 0; i < testCaseCount; i++) {
			//학생 수
			int studentCount = scanner.nextInt();
			
			//학생 수가 0 ~ 1000이 아니면 더이상 로직 수행하지 않고 return
			if(studentCount < 0 || studentCount > 1000) {
				return;
			}
			
			//학생 수만큼 점수를 넣을 배열
			int[] arrScore = new int[studentCount];
			//총 점수
			int totalScore = 0;
			//평균 넘는 점수 개수
			int totalAboveAverageCount = 0;
			//평균 넘는 비율
			double ratioAboveAverage = 0;
			//각 케이스마다 평균 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력하기 위한 변수(결과값)
			String result = "";
			
			//학생 수만큼 반복
			for (int j = 0; j < studentCount; j++) {
				//배열에 점수 입력
				arrScore[j] = scanner.nextInt();
				
				//점수가 0 ~ 100이 아니면 더이상 로직 수행하지 않고 return
				if(arrScore[j] < 0 || arrScore[j] > 100) {
					return;
				}
				
				//총 점수 계산
				totalScore += arrScore[j];
			}
			
			//점수 개수만큼 반복
			for (int j = 0; j < arrScore.length; j++) {
				//점수가 평균 점수보다 크면 평균 넘는 점수 개수 증가
				if(arrScore[j] > (totalScore / arrScore.length)) {
					totalAboveAverageCount++;
				}
			}
			
			//평균 넘는 비율 = (평균 넘는 점수 개수 / 전체 점수 개수) * 100
			//나누기 결과가 소수점까지 나오기 위해 double로 형변환
			ratioAboveAverage = ((double) totalAboveAverageCount / arrScore.length) * 100;
			
			//소수점 셋째 자리까지 반올림한 값으로 결과값 설정
			result = String.format("%.3f", ratioAboveAverage) + "%";
			
			//결과값 출력
			System.out.println(result);
		}
	}

}
