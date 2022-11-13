package beakjoon.a4array;

import java.util.Scanner;

public class AA9Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//�׽�Ʈ���̽� ����
		int testCaseCount = scanner.nextInt();
		
		//�׽�Ʈ���̽� ������ŭ �ݺ�
		for (int i = 0; i < testCaseCount; i++) {
			//�л� ��
			int studentCount = scanner.nextInt();
			
			//�л� ���� 0 ~ 1000�� �ƴϸ� ���̻� ���� �������� �ʰ� return
			if(studentCount < 0 || studentCount > 1000) {
				return;
			}
			
			//�л� ����ŭ ������ ���� �迭
			int[] arrScore = new int[studentCount];
			//�� ����
			int totalScore = 0;
			//��� �Ѵ� ���� ����
			int totalAboveAverageCount = 0;
			//��� �Ѵ� ����
			double ratioAboveAverage = 0;
			//�� ���̽����� ��� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����ϱ� ���� ����(�����)
			String result = "";
			
			//�л� ����ŭ �ݺ�
			for (int j = 0; j < studentCount; j++) {
				//�迭�� ���� �Է�
				arrScore[j] = scanner.nextInt();
				
				//������ 0 ~ 100�� �ƴϸ� ���̻� ���� �������� �ʰ� return
				if(arrScore[j] < 0 || arrScore[j] > 100) {
					return;
				}
				
				//�� ���� ���
				totalScore += arrScore[j];
			}
			
			//���� ������ŭ �ݺ�
			for (int j = 0; j < arrScore.length; j++) {
				//������ ��� �������� ũ�� ��� �Ѵ� ���� ���� ����
				if(arrScore[j] > (totalScore / arrScore.length)) {
					totalAboveAverageCount++;
				}
			}
			
			//��� �Ѵ� ���� = (��� �Ѵ� ���� ���� / ��ü ���� ����) * 100
			//������ ����� �Ҽ������� ������ ���� double�� ����ȯ
			ratioAboveAverage = ((double) totalAboveAverageCount / arrScore.length) * 100;
			
			//�Ҽ��� ��° �ڸ����� �ݿø��� ������ ����� ����
			result = String.format("%.3f", ratioAboveAverage) + "%";
			
			//����� ���
			System.out.println(result);
		}
	}

}
