package Java_algorithm_Ex;

//입력된수 만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형 출력
//n = 4;
// 1 2 3 4
// 8 7 6 5
// 9 10 11 12
// 16 15 14 13

public class _11_Main {
	public static void main(String[] args) {
		int n = 5;

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = i * n + j + 1;
				}
			} 
			else {
				for (int j = n - 1; j >= 0; j--) {
					arr[i][j] = i * n + n - j;
				}
			}

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
