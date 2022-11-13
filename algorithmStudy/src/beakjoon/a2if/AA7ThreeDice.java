package beakjoon.a2if;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AA7ThreeDice {

	public static void main(String[] args) {

		//�ֻ��� ��
		Integer[] arrThreeDiceNum = new Integer[3];
		//�����
		int result = 0;
		//�ߺ� ������ ���� ���� ����
		Set<Integer> setRemoveDistinctNum = new HashSet<>();
		//�ߺ��� ���� ���� ����
		List<Integer> listDistinctNum = new ArrayList<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		
		//�ֻ��� �� �Է�
		for (int i = 0; i < arrThreeDiceNum.length; i++) {
			arrThreeDiceNum[i] = scanner.nextInt();
		}
		
		//�ֻ��� ���� ���ǿ� �°� ������ Stream ����
		Stream<Integer> stream = Stream.of(arrThreeDiceNum);
		
		//setRemoveDistinctNum�� �߰��� ���� ������ listDistinctNum�� �߰�
		stream.filter(n -> !setRemoveDistinctNum.add(n))
		      .collect(Collectors.toSet())
		      .forEach(item -> listDistinctNum.add(item));
		
		/*
		 set.size() == 1 	-> 3���� �ֻ��� ���� ������ ���
		 set.size() == 2 	-> 2���� �ֻ��� ���� ������ ���
		 else 				-> 1���� �ֻ��� ���� ������ ���
		 */
		if(setRemoveDistinctNum.size() == 1) {
			result = 10000 + (listDistinctNum.get(0) * 1000);
		}else if(setRemoveDistinctNum.size() == 2) {
			result = 1000 + (listDistinctNum.get(0) * 100);
		}else {
			//�ֻ��� �� �������� ����
			Arrays.sort(arrThreeDiceNum, Comparator.reverseOrder());
			result = arrThreeDiceNum[0] * 100;
		}
		
		//����� ���
		System.out.println(result);
	}

}
