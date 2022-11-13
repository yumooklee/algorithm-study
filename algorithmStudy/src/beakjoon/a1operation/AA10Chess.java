package beakjoon.a1operation;

import java.util.Scanner;

public class AA10Chess {

	public static void main(String[] args) {
		int[] arrChess = {1, 1, 2, 2, 2, 8};
		int[] arrFindChess = new int[6];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < arrChess.length; i++) {
			int findChess = scanner.nextInt();
			arrFindChess[i] = arrChess[i] - findChess;
		}
		
		for (int i = 0; i < arrFindChess.length; i++) {
			System.out.println(arrFindChess[i]);
		}
	}

}
