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

		//주사위 수
		Integer[] arrThreeDiceNum = new Integer[3];
		//결과값
		int result = 0;
		//중복 제거한 수를 담을 변수
		Set<Integer> setRemoveDistinctNum = new HashSet<>();
		//중복된 수를 담을 변수
		List<Integer> listDistinctNum = new ArrayList<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		
		//주사위 수 입력
		for (int i = 0; i < arrThreeDiceNum.length; i++) {
			arrThreeDiceNum[i] = scanner.nextInt();
		}
		
		//주사위 수를 조건에 맞게 가공할 Stream 변수
		Stream<Integer> stream = Stream.of(arrThreeDiceNum);
		
		//setRemoveDistinctNum에 추가된 수가 없으면 listDistinctNum에 추가
		stream.filter(n -> !setRemoveDistinctNum.add(n))
		      .collect(Collectors.toSet())
		      .forEach(item -> listDistinctNum.add(item));
		
		/*
		 set.size() == 1 	-> 3개의 주사위 수가 동일할 경우
		 set.size() == 2 	-> 2개의 주사위 수가 동일할 경우
		 else 				-> 1개의 주사위 수가 동일할 경우
		 */
		if(setRemoveDistinctNum.size() == 1) {
			result = 10000 + (listDistinctNum.get(0) * 1000);
		}else if(setRemoveDistinctNum.size() == 2) {
			result = 1000 + (listDistinctNum.get(0) * 100);
		}else {
			//주사위 수 내림차순 정렬
			Arrays.sort(arrThreeDiceNum, Comparator.reverseOrder());
			result = arrThreeDiceNum[0] * 100;
		}
		
		//결과값 출력
		System.out.println(result);
	}

}
