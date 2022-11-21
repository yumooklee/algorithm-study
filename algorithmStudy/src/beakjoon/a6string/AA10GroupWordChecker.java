package beakjoon.a6string;

import java.util.Scanner;

public class AA10GroupWordChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int wordCount = scanner.nextInt();
		
		//1 ~ 100�� ���
		if(wordCount >= 1 && wordCount <= 100) {
			//�׷� �ܾ��� ����(�����)
			int result = 0;
			
			//�ܾ��� ������ŭ �ݺ�
			for (int i = 0; i < wordCount; i++) {
				//�ܾ�
				String word = scanner.next();
				
				//�ܾ� ���̰� �ִ� 100�� ���
				if(word.length() <= 100) {
					//�ܾ��� �� ���ں� �迭�� ������ ����
					char[] arrCharWord = word.toCharArray();
					//�����ϴ� �������� ���ϱ� ���� ����
					char tempString = arrCharWord[0];
					//�����ϴ� ���� ������ ����
					String removeContinueWord = String.valueOf(arrCharWord[0]);
					//���� �ߺ� ������ ����
					String removeDistinctWord = String.valueOf(arrCharWord[0]);
					
					//�ܾ� ���̸�ŭ �ݺ�
					for (int j = 1; j < arrCharWord.length; j++) {
						//�����ϴ� ���ڰ� �ƴ� ��� ���� �߰�
						if(tempString != arrCharWord[j]) {
							removeContinueWord += arrCharWord[j];
						}
						
						//���ڰ� �ش� ������ ���Ե��� ���� ��� ���� �߰�
						if(!removeDistinctWord.contains(String.valueOf(arrCharWord[j]))) {
							removeDistinctWord += arrCharWord[j];
						}
						
						//���� ���ڿ� �񱳸� ���� ���� ����
						tempString = arrCharWord[j];
					}
					
					//�� �ܾ ������ ��� �׷� �ܾ��̹Ƿ� ����� +1
					if(removeContinueWord.equals(removeDistinctWord)) {
						result++;
					}
				}
			}
			
			//����� ���
			System.out.println(result);
		}
	}

}
