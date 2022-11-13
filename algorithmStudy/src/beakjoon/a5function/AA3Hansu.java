package beakjoon.a5function;

import java.util.Scanner;

public class AA3Hansu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		//1 ~ 1000�� ���� ������ ���
		if(num >= 1 && num <= 1000) {
			//�������� �Ѽ��� ����(�����)
			int result = 0;
			
			//�Է��� ���� ������ŭ 1���� �ݺ�
			for (int i = 1; i <= num; i++) {
				//1 ~ 99�� ������ ���������� �����ϹǷ� result +1
				if(i >= 1 && i <= 99) {
					result++;
				}else {
					//�� �ڸ����� ���̰��� ���ϱ� ���� char�� ��ȯ�ϱ� ���� String ���� ����
					String strNum = String.valueOf(i);
					//�� �ڸ����� ���̰��� �� ����
					int differenceNum = strNum.charAt(0) - strNum.charAt(1);
					//�� �ڸ����� ���̰��� ���� ���θ� �Ǵ��ϱ� ���� ����
					boolean isDifferenceNum = false;
					
					for (int j = 2; j < strNum.length(); j++) {
						//�� �ڸ����� ���̰��� �ٸ��� �� Ȯ���� �ʿ䰡 �����Ƿ� break
						if(differenceNum != strNum.charAt(j-1) - strNum.charAt(j)) {
							isDifferenceNum = true;
							break;
						}
						
						//���� �ڸ����� ���̰��� ���ϱ� ���� ���� �ڸ����� ���̰� ����
						differenceNum = strNum.charAt(j-1) - strNum.charAt(j);
					}
					
					//�� �ڸ����� ���̰��� ���� ������ ���(���������� ���) result +1
					if(!isDifferenceNum) {
						result++;
					}
				}
			}
			
			System.out.println(result);
		}
	}

}
