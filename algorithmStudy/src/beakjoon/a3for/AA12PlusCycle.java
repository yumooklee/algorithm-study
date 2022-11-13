package beakjoon.a3for;

import java.util.Scanner;

public class AA12PlusCycle {

	public static void main(String[] args) {
		//�Է��� ���� ���ƿ��� ����Ŭ Ƚ��(�����)
		int result = 0;
		
		Scanner scanner = new Scanner(System.in);
		//�Է��� ��
		int inputNum = scanner.nextInt();
		
		//�Է��� ���� 0 ~ 99�� ���
		if(inputNum >= 0 && inputNum <= 99) {
			//�Է��� ���� ����ϱ� ���� ���ڿ��� ��ȯ�� ����
			String strSumNum = String.valueOf(inputNum);
			
			//�Է��� ���� ���ƿ� �� ���� �ݺ�
			while(true) {
				//strSumNum�� 10 �̸��� ��� ���ڸ��� 0 �߰�
				strSumNum = Integer.valueOf(strSumNum) < 10 && strSumNum.length() == 1 ? "0" + strSumNum : strSumNum;
				//strSumNum�� ù��° �ڸ��� ���� �ι�° �ڸ��� �� �ջ�
				int sumFirstNumSecondNum = Integer.valueOf(strSumNum.substring(0, 1)) + Integer.valueOf(strSumNum.substring(1, 2));
				String strSumFirstNumSecondNum = sumFirstNumSecondNum < 10 ? "0" + String.valueOf(sumFirstNumSecondNum) : String.valueOf(sumFirstNumSecondNum);
				
				//strSumNum = strSumNum�� �ι�° �ڸ��� ���� strSumFirstNumSecondNum�� �ι�° �ڸ��� �� ����
				strSumNum = strSumNum.substring(1, 2) + strSumFirstNumSecondNum.substring(1, 2);
				
				//����Ŭ Ƚ�� +1
				result++;
				
				//�Է��� ���� strSumNum�� ���� ��� �ݺ��� ����
				if(inputNum == Integer.valueOf(strSumNum)) {
					break;
				}
			}
			
			//����� ���
			System.out.println(result);
		}
	}

}
