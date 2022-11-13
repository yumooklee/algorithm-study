package beakjoon.a5function;

import java.util.Scanner;

public class AA3Hansu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		//1 ~ 1000의 양의 정수일 경우
		if(num >= 1 && num <= 1000) {
			//등차수열 한수의 개수(결과값)
			int result = 0;
			
			//입력한 양의 정수만큼 1부터 반복
			for (int i = 1; i <= num; i++) {
				//1 ~ 99는 무조건 등차수열에 성립하므로 result +1
				if(i >= 1 && i <= 99) {
					result++;
				}else {
					//각 자릿수의 차이값을 비교하기 위해 char로 변환하기 위한 String 변수 선언
					String strNum = String.valueOf(i);
					//각 자릿수별 차이값이 들어갈 변수
					int differenceNum = strNum.charAt(0) - strNum.charAt(1);
					//각 자리수별 차이값의 동일 여부를 판단하기 위한 변수
					boolean isDifferenceNum = false;
					
					for (int j = 2; j < strNum.length(); j++) {
						//각 자리수별 차이값이 다르면 더 확인할 필요가 없으므로 break
						if(differenceNum != strNum.charAt(j-1) - strNum.charAt(j)) {
							isDifferenceNum = true;
							break;
						}
						
						//다음 자리수별 차이값을 비교하기 위해 현재 자리수별 차이값 세팅
						differenceNum = strNum.charAt(j-1) - strNum.charAt(j);
					}
					
					//각 자리수별 차이값이 전부 동일할 경우(등차수열일 경우) result +1
					if(!isDifferenceNum) {
						result++;
					}
				}
			}
			
			System.out.println(result);
		}
	}

}
