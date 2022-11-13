package beakjoon.a3for;

import java.util.Scanner;

public class AA12PlusCycle {

	public static void main(String[] args) {
		//입력한 수로 돌아오는 사이클 횟수(결과값)
		int result = 0;
		
		Scanner scanner = new Scanner(System.in);
		//입력한 수
		int inputNum = scanner.nextInt();
		
		//입력한 수가 0 ~ 99일 경우
		if(inputNum >= 0 && inputNum <= 99) {
			//입력한 수를 계산하기 위해 문자열로 변환한 변수
			String strSumNum = String.valueOf(inputNum);
			
			//입력한 수로 돌아올 때 까지 반복
			while(true) {
				//strSumNum이 10 미만일 경우 앞자리에 0 추가
				strSumNum = Integer.valueOf(strSumNum) < 10 && strSumNum.length() == 1 ? "0" + strSumNum : strSumNum;
				//strSumNum의 첫번째 자리의 수와 두번째 자리의 수 합산
				int sumFirstNumSecondNum = Integer.valueOf(strSumNum.substring(0, 1)) + Integer.valueOf(strSumNum.substring(1, 2));
				String strSumFirstNumSecondNum = sumFirstNumSecondNum < 10 ? "0" + String.valueOf(sumFirstNumSecondNum) : String.valueOf(sumFirstNumSecondNum);
				
				//strSumNum = strSumNum의 두번째 자리의 수와 strSumFirstNumSecondNum의 두번째 자리의 수 연결
				strSumNum = strSumNum.substring(1, 2) + strSumFirstNumSecondNum.substring(1, 2);
				
				//사이클 횟수 +1
				result++;
				
				//입력한 수와 strSumNum이 같은 경우 반복문 종료
				if(inputNum == Integer.valueOf(strSumNum)) {
					break;
				}
			}
			
			//결과값 출력
			System.out.println(result);
		}
	}

}
