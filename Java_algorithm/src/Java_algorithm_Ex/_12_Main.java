package Java_algorithm_Ex;

//입력된수 만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형 출력
//n = 4;
//1 5 9  13
//2 6 10 14
//3 7 11 15
//4 8 12 16
public class _12_Main {
	public static void main(String[] args) {
		int n = 4;
		int[][] arr = new int[n][n];
		
		
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[j][i] = num;
				num++;
				//arr[j][i] = i*n + j + 1;
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
