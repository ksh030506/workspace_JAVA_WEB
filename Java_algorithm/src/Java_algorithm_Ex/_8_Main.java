package Java_algorithm_Ex;

//팩토리얼 구하기
public class _8_Main {
	public static void main(String[] args) {
		int inputNum = 5;
		int accNum = 1; //1로 초기화하는게 중요!!
		
		for (int i = 1; i <= inputNum; i++) {
			accNum *= i;
		}
		
		System.out.println(accNum);
		
		accNum = 1;
		for (int i = inputNum; i >= 1; i--) {
			accNum *= i;
		}
		
		System.out.println(accNum);
	}
}
