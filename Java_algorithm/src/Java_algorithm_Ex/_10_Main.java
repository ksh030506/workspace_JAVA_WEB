package Java_algorithm_Ex;

//입력된수 만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형 출력
//n = 3
// 1 2 3
// 4 5 6
// 7 8 9
public class _10_Main {
	public static void main(String[] args) {

		int n = 5;

		int num = 1;

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				System.out.printf("%4d", num); // j*(n) + i +1
				num++;
			}
			System.out.println();
		}
	}
}
